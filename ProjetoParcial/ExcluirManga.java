// Autor: Carlos Gabriel Baratieri

public class ExcluirManga {
    private ConsultarCodigoInterno consultar = new ConsultarCodigoInterno();
    
    public boolean executar(int codigo) {
        try {
            Manga mangaParaExcluir = consultar.buscarMangaPorCodigo(codigo);
            
            if (mangaParaExcluir != null) {
                boolean removido = Estoque.removerManga(mangaParaExcluir);
                
                if (removido) {
                    System.out.println("Mangá com código " + codigo + " removido com sucesso!");
                    return true;
                } else {
                    System.out.println("Erro ao remover mangá com código " + codigo);
                    return false;
                }
            } else {
                System.out.println("Mangá com código " + codigo + " não encontrado");
                return false;
            }
        } catch (CodigoInvalidoException e) {
            System.out.println("Código inválido! Não foi possível excluir o mangá");
            return false;
        }
    }
}
