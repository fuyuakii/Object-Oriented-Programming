// Autor: Carlos Gabriel Baratieri

public class ControleEstoque implements InterfaceEstoque {

    private ConsultarManga consultar = new ConsultarManga();
    private ConsultarCodigoInterno consultarCodigo = new ConsultarCodigoInterno();
    private ExcluirManga excluirManga = new ExcluirManga();
    
    private static Leitura leitura = Leitura.getLeitura();

    public ControleEstoque() {
    }

    public void cadastrarManga(Manga manga) {
        Estoque.cadastrarManga(manga);
    }

    // Sobrecarga - Polimorfismo
    public void consultar() {
        try {
            consultar.consultarTodos();
        } catch (EstoqueVazioException e) {
            e.mensagemEstoqueVazio();
            Animacao.pressione();
        }
    }

    // Sobrecarga - Polimorfismo
    public void consultar(int codigo) {
        if (Estoque.getListaMangas().isEmpty()) {
            System.out.println("Estoque vazio! Cadastre algum mangá antes de consultar.");
            Animacao.pressione();
            return;
        }

        try {
            Animacao.consultando(); 
            Manga mangaEncontrado = consultarCodigo.buscarMangaPorCodigo(codigo);
            
            if (mangaEncontrado != null) {
                System.out.println(">==================================<");
                mangaEncontrado.exibirDescricao();
                System.out.println(">==================================<");
            } else {
                System.out.println("Mangá com código " + codigo + " não encontrado");
            }
        } catch (CodigoInvalidoException e) {
            System.out.println("Código inválido! Digite um número inteiro positivo");
        }
        
        Animacao.pressione();
    }

    public void excluirManga() {
        if (Estoque.getListaMangas().isEmpty()) {
            System.out.println("Estoque vazio! Não há mangás para excluir.");
            Animacao.pressione();
            return;
        }

        boolean codigoValido = false;

        do {
            int codigo = leitura.lerInteiro("Digite o código interno do mangá a excluir: ");
            
            Animacao.excluindo();
            boolean excluido = excluirManga.executar(codigo);
            
            if (excluido) {
                codigoValido = true;
            } else {
                System.out.println("Não foi possível excluir o mangá com código " + codigo);
                System.out.println("Verifique se o código existe e tente novamente");
                Animacao.pressione();
            }
            
        } while (!codigoValido);
        
        Animacao.pressione();
    }
}
