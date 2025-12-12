public class Principal {
    private static Leitura leitura = Leitura.getLeitura();
    private static ControleEstoque controle = new ControleEstoque();
 	
    private static CadastrarJosei cadastroJosei = new CadastrarJosei();
    private static CadastrarKodomo cadastroKodomo = new CadastrarKodomo();
    private static CadastrarSeinen cadastroSeinen = new CadastrarSeinen();
    private static CadastrarShoujo cadastroShoujo = new CadastrarShoujo();
    private static CadastrarShounen cadastroShounen = new CadastrarShounen();

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = mostrarMenuPrincipal();
            System.out.println();
            switch(opcao) {
                case 1:
                    menuCadastrarManga();
                    break;
                case 2:
                    menuConsultarRegistros();
                    break;
                case 3:
                    menuExcluirRegistro();
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
        System.out.println("------------------------------------");
        Animacao.esperar(1);
        System.out.println(" [0] | Sair");
        Animacao.esperar(1);
        System.out.println(">==================================<");
        return leitura.lerInteiro("Escolha uma opção: \n> ");
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
    
    public static void menuCadastrarManga() {
        int opcao;

        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            Animacao.esperar(1);
            System.out.println("         CADASTRAR MANGÁ");
            Animacao.esperar(1);
            System.out.println(">==================================<");
            Animacao.esperar(1);
            System.out.println(" [1] | Josei");
            Animacao.esperar(1);
            System.out.println(" [2] | Kodomo");
            Animacao.esperar(1);
            System.out.println(" [3] | Seinen");
            Animacao.esperar(1);
            System.out.println(" [4] | Shoujo");
            Animacao.esperar(1);
            System.out.println(" [5] | Shounen");
            Animacao.esperar(1);
            System.out.println(" [0] | Voltar");
            Animacao.esperar(1);
            System.out.println(">==================================<");

            opcao = leitura.lerInteiro("Escolha o tipo de mangá para cadastrar: \n> ");

            switch(opcao) {
                case 1: 
                    submenuCadastrarJosei();
                    break;
                case 2: 
                    submenuCadastrarKodomo();
                    break;
                case 3: 
                    submenuCadastrarSeinen();
                    break;
                case 4: 
                    submenuCadastrarShoujo();
                    break;
                case 5: 
                    submenuCadastrarShounen();
                    break;
                case 0:
                    voltarMenuPrincipal();
                    break;
                default:
                    entradaMenuInvalido();
            }

        } while(opcao != 0);
    }

    public static void submenuCadastrarSeinen() {
        int opcao;
        String descricao;

        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            System.out.println("       CADASTRAR SEINEN");
            System.out.println(">==================================<");
            System.out.println(" [1] | Shinri/Thriller");
            System.out.println(" [2] | Ningen Dorama");
            System.out.println(" [3] | Shakai Fushi");
            System.out.println(" [4] | Ankoku Fantaji");
            System.out.println(" [0] | Voltar");
            System.out.println(">==================================<");

            opcao = leitura.lerInteiro("> Escolha o tipo de Seinen: ");

            switch(opcao) {
                case 1:
                    descricao = leitura.lerTexto("Descreva a obra Shinri/Thriller: ");
                    cadastroSeinen.executar("shinriThriller", descricao);
                    break;
                case 2:
                    descricao = leitura.lerTexto("Descreva a obra Ningen Dorama: ");
                    cadastroSeinen.executar("ningenDorama", descricao);
                    break;
                case 3:
                    descricao = leitura.lerTexto("Descreva a obra Shakai Fushi: ");
                    cadastroSeinen.executar("shakaiFushi", descricao);
                    break;
                case 4:
                    descricao = leitura.lerTexto("Descreva a obra Ankoku Fantaji: ");
                    cadastroSeinen.executar("ankokuFantaji", descricao);
                    break;
                case 0:
                    Animacao.voltando();
                    break;
                default:
                    entradaMenuInvalido();
            }
        } while(opcao != 0);
    }

    public static void submenuCadastrarShoujo() {
        int opcao;
        String descricao;

        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            System.out.println("       CADASTRAR SHOUJO");
            System.out.println(">==================================<");
            System.out.println(" [1] | Mahou");
            System.out.println(" [2] | Seishun Dorama");
            System.out.println(" [3] | Romance Shoujo");
            System.out.println(" [0] | Voltar");
            System.out.println(">==================================<");

            opcao = leitura.lerInteiro("> Escolha o tipo de Shoujo: ");

            switch(opcao) {
                case 1:
                    descricao = leitura.lerTexto("Descreva a obra Mahou: ");
                    cadastroShoujo.executar("mahou", descricao);
                    break;
                case 2:
                    descricao = leitura.lerTexto("Descreva a obra Seishun Dorama: ");
                    cadastroShoujo.executar("seishunDorama", descricao);
                    break;
                case 3:
                    descricao = leitura.lerTexto("Descreva a obra Romance Shoujo: ");
                    cadastroShoujo.executar("romanceShoujo", descricao);
                    break;
                case 0:
                    Animacao.voltando();
                    break;
                default:
                    entradaMenuInvalido();
            }
        } while(opcao != 0);
    }

    public static void submenuCadastrarShounen() {
        int opcao;
        String descricao;

        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            System.out.println("       CADASTRAR SHOUNEN");
            System.out.println(">==================================<");
            System.out.println(" [1] | Battle Shonen");
            System.out.println(" [2] | Isekai");
            System.out.println(" [3] | Sport Shonen");
            System.out.println(" [0] | Voltar");
            System.out.println(">==================================<");

            opcao = leitura.lerInteiro("> Escolha o tipo de Shounen: ");

            switch(opcao) {
                case 1:
                    descricao = leitura.lerTexto("Descreva a obra Battle Shonen: ");
                    cadastroShounen.executar("battleShonen", descricao);
                    break;
                case 2:
                    descricao = leitura.lerTexto("Descreva a obra Isekai: ");
                    cadastroShounen.executar("isekai", descricao);
                    break;
                case 3:
                    descricao = leitura.lerTexto("Descreva a obra Sport Shonen: ");
                    cadastroShounen.executar("sportShonen", descricao);
                    break;
                case 0:
                    Animacao.voltando();
                    break;
                default:
                    entradaMenuInvalido();
            }
        } while(opcao != 0);
    }

    public static void submenuCadastrarJosei() {
        int opcao;
        String descricao;

        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            System.out.println("         CADASTRAR JOSEI");
            System.out.println(">==================================<");
            System.out.println(" [1] | Shokuba Dorama");
            System.out.println(" [2] | Kekkon Seikatsu");
            System.out.println(" [3] | Otona Dorama");
            System.out.println(" [0] | Voltar");
            System.out.println(">==================================<");

            opcao = leitura.lerInteiro("> Escolha o tipo de Josei: ");

            switch(opcao) {
                case 1:
                    descricao = leitura.lerTexto("Descreva Shokuba Dorama: ");
                    cadastroJosei.executar("shokubaDorama", descricao);
                    break;
                case 2:
                    descricao = leitura.lerTexto("Descreva Kekkon Seikatsu: ");
                    cadastroJosei.executar("kekkonSeikatsu", descricao);
                    break;
                case 3:
                    descricao = leitura.lerTexto("Descreva Otona Dorama: ");
                    cadastroJosei.executar("otonaDorama", descricao);
                    break;
                case 0:
                    Animacao.voltando();
                    break;
                default:
                    entradaMenuInvalido();
            }
        } while(opcao != 0);
    }

    public static void submenuCadastrarKodomo() {
        int opcao;
        String descricao;

        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            System.out.println("       CADASTRAR KODOMO");
            System.out.println(">==================================<");
            System.out.println(" [1] | Educativo");
            System.out.println(" [2] | Fábula/Conto");
            System.out.println(" [3] | Ilustrativo");
            System.out.println(" [0] | Voltar");
            System.out.println(">==================================<");

            opcao = leitura.lerInteiro("> Escolha o tipo de Kodomo: ");

            switch(opcao) {
                case 1:
                    descricao = leitura.lerTexto("Descreva a obra educativa: ");
                    cadastroKodomo.executar("educativo", descricao);
                    break;
                case 2:
                    descricao = leitura.lerTexto("Descreva a fábula/conto: ");
                    cadastroKodomo.executar("fabulaConto", descricao);
                    break;
                case 3:
                    descricao = leitura.lerTexto("Descreva a obra ilustrativa: ");
                    cadastroKodomo.executar("ilustrativo", descricao);
                    break;
                case 0:
                    Animacao.voltando();
                    break;
                default:
                    entradaMenuInvalido();
            }
        } while(opcao != 0);
    }

    public static void voltarMenuPrincipal() {
        Animacao.voltando();
    }
    
    public static void entradaMenuInvalido(){
        System.out.println("Inválido, tente novamente");
        Animacao.pressione();
    }
}
