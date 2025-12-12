// Autor: Carlos Gabriel Baratieri

public class ConsultarManga {
    private ConsultarCodigoInterno consultorCodigo = new ConsultarCodigoInterno();
    
    // Construtor default
    public ConsultarManga() {
    
    }
    
    public void consultarTodos() throws EstoqueVazioException {
        java.util.ArrayList<Manga> listaMangas = Estoque.getListaMangas();
        if (listaMangas.isEmpty()) {
            throw new EstoqueVazioException(); 
        }
        Animacao.consultando(); 
        System.out.println(">==================================<");
        for (Manga manga : listaMangas) {
            manga.informacoesEstoque(); 
        }
        System.out.println(">==================================<");
        Animacao.pressione();
    }
    
    public void consultarPorCodigo(int codigo) {
        try {
            Animacao.consultando();
            Manga mangaEncontrado = consultorCodigo.buscarMangaPorCodigo(codigo);
            
            if (mangaEncontrado != null) {
                mangaEncontrado.exibirDescricao();
                Animacao.pressione();
            } else {
                System.out.println("Mangá com código " + codigo + " não encontrado");
                Animacao.pressione();
            }
        } catch (CodigoInvalidoException e) {
            System.out.println("[ERRO]: Código inválido! " + e.getMessage());
            Animacao.pressione(); 
        }
    }
}
