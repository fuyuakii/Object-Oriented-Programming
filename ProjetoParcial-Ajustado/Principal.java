// Autor: Carlos Gabriel Baratieri

public class Principal {
    private static Leitura leitura = Leitura.getLeitura();
    private static ControleEstoque controle = new ControleEstoque();
    private static CadastroUnificadoManga cadastroUnificado = new CadastroUnificadoManga();

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = mostrarMenuPrincipal();
            System.out.println();
            switch(opcao) {
                case 1:
                    cadastroUnificado.executar();
                    break;
                case 2:
                    menuConsultarRegistros();
                    break;
                case 3:
                    menuExcluirRegistro();
                    break;
                case 4: 
                    menuAtualizarRegistro();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    entradaMenuInvalido();
            }
            System.out.println();
        } while(opcao != 0);
    }

    public static int mostrarMenuPrincipal() {
        Animacao.limparTela();
        System.out.println(">==================================<");
        Animacao.esperar(1);
        System.out.println("|          MENU DE REGISTROS       |");
        Animacao.esperar(1);
        System.out.println(">==================================<");
        Animacao.esperar(1);
        System.out.println(" [1] | Cadastrar Registro");
        Animacao.esperar(1);
        System.out.println(" [2] | Consultar Registros");
        Animacao.esperar(1);
        System.out.println(" [3] | Excluir Registro");
        Animacao.esperar(1);
        System.out.println(" [4] | Atualizar Registro");
        Animacao.esperar(1);
        System.out.println("------------------------------------");
        Animacao.esperar(1);
        System.out.println(" [0] | Sair");
        Animacao.esperar(1);
        System.out.println(">==================================<");
        return leitura.lerInteiro("Escolha uma opção: \n> ");
    }

    public static void menuAtualizarRegistro() {
        int opcao;
        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            Animacao.esperar(1);
            System.out.println("         ATUALIZAR REGISTRO");
            Animacao.esperar(1);
            System.out.println(">==================================<");
            Animacao.esperar(1);
            System.out.println(" [1] | Atualização Específica");
            Animacao.esperar(1);
            System.out.println(" [2] | Atualização Completa");
            Animacao.esperar(1);
            System.out.println(" [0] | Voltar");
            Animacao.esperar(1);
            System.out.println(">==================================<");
            opcao = leitura.lerInteiro("Escolha uma opção: \n> ");

            switch(opcao) {
                case 1:
                    controle.atualizarMangaEspecifica();
                    break;
                case 2:
                    controle.atualizarMangaCompleta();
                    break;
                case 0:
                    voltarMenuPrincipal();
                    break;
                default:
                    entradaMenuInvalido();
            }
        } while(opcao != 0);
    }

    public static void menuConsultarRegistros() {
        int opcao;
        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            Animacao.esperar(1);
            System.out.println("         CONSULTAR REGISTROS");
            Animacao.esperar(1);
            System.out.println(">==================================<");
            Animacao.esperar(1);
            System.out.println(" [1] | Consultar Todos os Dados");
            Animacao.esperar(1);
            System.out.println(" [2] | Consultar por Código Interno");
            Animacao.esperar(1);
            System.out.println(" [0] | Voltar");
            Animacao.esperar(1);
            System.out.println(">==================================<");
            opcao = leitura.lerInteiro("Escolha uma opção: \n> ");

            switch(opcao) {
                case 1:
                    controle.consultar();
                    break;
                case 2:
                    int codigo = leitura.lerInteiro("Digite o código interno do mangá: ");
                    controle.consultar(codigo);
                    break;
                case 0:
                    voltarMenuPrincipal();
                    break;
                default:
                    entradaMenuInvalido();
            }
        } while(opcao != 0);
    }

    public static void menuExcluirRegistro() {
        controle.excluirManga();
    }

    public static void voltarMenuPrincipal() {
        Animacao.voltando();
    }
    
    public static void entradaMenuInvalido(){
        System.out.println("Inválido, tente novamente");
        Animacao.pressione();
    }
}
