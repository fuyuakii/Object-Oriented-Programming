// Autor: Carlos Gabriel Baratieri

public class ConsultarCodigoInterno { 
    public void executar(int codigo) throws CodigoInvalidoException {
        Manga mangaEncontrado = buscarMangaPorCodigo(codigo);
        
        if (mangaEncontrado != null) {
            System.out.println(FormatadorManga.formatarInformacoesEstoque(mangaEncontrado));
        } else {
            System.out.println("Mangá com código " + codigo + " não encontrado");
        }
    }
    
    public Manga buscarMangaPorCodigo(int codigo) throws CodigoInvalidoException {
        java.util.ArrayList<Manga> listaMangas = Estoque.getListaMangas();
        if (codigo <= 0) {
            throw new CodigoInvalidoException("Código deve ser um número positivo");
        }
        
        for (Manga manga : listaMangas) {
            if (manga.getInformacoesEstoque().getCodigoInterno() == codigo) {
                return manga;
            }
        }
        
        return null;
    }
}
