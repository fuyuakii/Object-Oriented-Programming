// Autor: Carlos Gabriel Baratieri

public class CadastroUnificadoManga extends CadastrarMangaBase {
    private static Leitura leitura = Leitura.getLeitura();

    public void executar() {
        int opcao;
        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            Animacao.esperar(1);
            System.out.println("        CADASTRO UNIFICADO");
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

            opcao = leitura.lerInteiro("Escolha o tipo de mangá: \n> ");

            switch(opcao) {
                case 1:
                    cadastrarJosei();
                    break;
                case 2:
                    cadastrarKodomo();
                    break;
                case 3:
                    cadastrarSeinen();
                    break;
                case 4:
                    cadastrarShoujo();
                    break;
                case 5:
                    cadastrarShounen();
                    break;
                case 0:
                    Animacao.voltando();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    Animacao.pressione();
            }
        } while(opcao != 0);
    }

    private void cadastrarJosei() {
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

            opcao = leitura.lerInteiro("Escolha o tipo de Josei: \n> ");

            if (opcao == 0) {
                Animacao.voltando();
                return;
            }

            switch(opcao) {
                case 1:
                    descricao = leitura.lerTexto("Descreva Shokuba Dorama: ");
                    cadastrarJoseiSubtipo("shokubaDorama", descricao);
                    break;
                case 2:
                    descricao = leitura.lerTexto("Descreva Kekkon Seikatsu: ");
                    cadastrarJoseiSubtipo("kekkonSeikatsu", descricao);
                    break;
                case 3:
                    descricao = leitura.lerTexto("Descreva Otona Dorama: ");
                    cadastrarJoseiSubtipo("otonaDorama", descricao);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    Animacao.pressione();
            }
        } while(opcao != 0);
    }

    private void cadastrarJoseiSubtipo(String subtipo, String descricao) {
        Josei josei = new Josei();
        preencherDadosComuns(josei);

        switch (subtipo) {
            case "shokubaDorama":
                josei.setShokubaDorama(descricao);
                josei.getGeneros().setAcao(false);
                josei.getGeneros().setComedia(true);
                josei.getGeneros().setDrama(true);
                josei.getGeneros().setSuspense(false);
                josei.getGeneros().setTerror(false);
                josei.getGeneros().setRomance(false);
                break;
            case "kekkonSeikatsu":
                josei.setKekkonSeikatsu(descricao);
                josei.getGeneros().setAcao(false);
                josei.getGeneros().setComedia(true);
                josei.getGeneros().setDrama(true);
                josei.getGeneros().setSuspense(false);
                josei.getGeneros().setTerror(false);
                josei.getGeneros().setRomance(true);
                break;
            case "otonaDorama":
                josei.setOtonaDorama(descricao);
                josei.getGeneros().setAcao(false);
                josei.getGeneros().setComedia(false);
                josei.getGeneros().setDrama(true);
                josei.getGeneros().setSuspense(true);
                josei.getGeneros().setTerror(false);
                josei.getGeneros().setRomance(true);
                break;
        }

        Estoque.cadastrarManga(josei);
    }

    private void cadastrarKodomo() {
        int opcao;
        String descricao;

        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            System.out.println("         CADASTRAR KODOMO");
            System.out.println(">==================================<");
            System.out.println(" [1] | Educativo");
            System.out.println(" [2] | Fábula/Conto");
            System.out.println(" [3] | Ilustrativo");
            System.out.println(" [0] | Voltar");
            System.out.println(">==================================<");

            opcao = leitura.lerInteiro("Escolha o tipo de Kodomo: \n> ");

            if (opcao == 0) {
                Animacao.voltando();
                return;
            }

            switch(opcao) {
                case 1:
                    descricao = leitura.lerTexto("Descreva a obra educativa: ");
                    cadastrarKodomoSubtipo("educativo", descricao);
                    break;
                case 2:
                    descricao = leitura.lerTexto("Descreva a fábula/conto: ");
                    cadastrarKodomoSubtipo("fabulaConto", descricao);
                    break;
                case 3:
                    descricao = leitura.lerTexto("Descreva a obra ilustrativa: ");
                    cadastrarKodomoSubtipo("ilustrativo", descricao);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    Animacao.pressione();
            }
        } while(opcao != 0);
    }

    private void cadastrarKodomoSubtipo(String subtipo, String descricao) {
        Kodomo kodomo = new Kodomo();
        preencherDadosComuns(kodomo);

        switch (subtipo) {
            case "educativo":
                kodomo.setEducativo(descricao);
                kodomo.getGeneros().setAcao(false);
                kodomo.getGeneros().setComedia(true);
                kodomo.getGeneros().setDrama(false);
                kodomo.getGeneros().setSuspense(false);
                kodomo.getGeneros().setTerror(false);
                kodomo.getGeneros().setRomance(false);
                break;
            case "fabulaConto":
                kodomo.setFabulaConto(descricao);
                kodomo.getGeneros().setAcao(true);
                kodomo.getGeneros().setComedia(false);
                kodomo.getGeneros().setDrama(true);
                kodomo.getGeneros().setSuspense(false);
                kodomo.getGeneros().setTerror(false);
                kodomo.getGeneros().setRomance(false);
                break;
            case "ilustrativo":
                kodomo.setIlustrativo(descricao);
                kodomo.getGeneros().setAcao(false);
                kodomo.getGeneros().setComedia(true);
                kodomo.getGeneros().setDrama(false);
                kodomo.getGeneros().setSuspense(false);
                kodomo.getGeneros().setTerror(false);
                kodomo.getGeneros().setRomance(true);
                break;
        }

        Estoque.cadastrarManga(kodomo);
    }

    private void cadastrarSeinen() {
        int opcao;
        String descricao;

        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            System.out.println("         CADASTRAR SEINEN");
            System.out.println(">==================================<");
            System.out.println(" [1] | Shinri/Thriller");
            System.out.println(" [2] | Ningen Dorama");
            System.out.println(" [3] | Shakai Fushi");
            System.out.println(" [4] | Ankoku Fantaji");
            System.out.println(" [0] | Voltar");
            System.out.println(">==================================<");

            opcao = leitura.lerInteiro("Escolha o tipo de Seinen: \n> ");

            if (opcao == 0) {
                Animacao.voltando();
                return;
            }

            switch(opcao) {
                case 1:
                    descricao = leitura.lerTexto("Descreva a obra Shinri/Thriller: ");
                    cadastrarSeinenSubtipo("shinriThriller", descricao);
                    break;
                case 2:
                    descricao = leitura.lerTexto("Descreva a obra Ningen Dorama: ");
                    cadastrarSeinenSubtipo("ningenDorama", descricao);
                    break;
                case 3:
                    descricao = leitura.lerTexto("Descreva a obra Shakai Fushi: ");
                    cadastrarSeinenSubtipo("shakaiFushi", descricao);
                    break;
                case 4:
                    descricao = leitura.lerTexto("Descreva a obra Ankoku Fantaji: ");
                    cadastrarSeinenSubtipo("ankokuFantaji", descricao);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    Animacao.pressione();
            }
        } while(opcao != 0);
    }

    private void cadastrarSeinenSubtipo(String subtipo, String descricao) {
        Seinen seinen = new Seinen();
        preencherDadosComuns(seinen); 

        switch (subtipo) {
            case "shinriThriller":
                seinen.setShinriThriller(descricao);
                seinen.getGeneros().setAcao(false);
                seinen.getGeneros().setComedia(false);
                seinen.getGeneros().setDrama(true);
                seinen.getGeneros().setSuspense(true);
                seinen.getGeneros().setTerror(true);
                seinen.getGeneros().setRomance(false);
                break;
            case "ningenDorama":
                seinen.setNingenDorama(descricao);
                seinen.getGeneros().setAcao(false);
                seinen.getGeneros().setComedia(false);
                seinen.getGeneros().setDrama(true);
                seinen.getGeneros().setSuspense(false);
                seinen.getGeneros().setTerror(false);
                seinen.getGeneros().setRomance(true);
                break;
            case "shakaiFushi":
                seinen.setShakaiFushi(descricao);
                seinen.getGeneros().setAcao(false);
                seinen.getGeneros().setComedia(true);
                seinen.getGeneros().setDrama(true);
                seinen.getGeneros().setSuspense(false);
                seinen.getGeneros().setTerror(false);
                seinen.getGeneros().setRomance(false);
                break;
            case "ankokuFantaji":
                seinen.setAnkokuFantaji(descricao);
                seinen.getGeneros().setAcao(true);
                seinen.getGeneros().setComedia(false);
                seinen.getGeneros().setDrama(false);
                seinen.getGeneros().setSuspense(true);
                seinen.getGeneros().setTerror(true);
                seinen.getGeneros().setRomance(false);
                break;
        }

        Estoque.cadastrarManga(seinen);
    }

    private void cadastrarShoujo() {
        int opcao;
        String descricao;

        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            System.out.println("         CADASTRAR SHOUJO");
            System.out.println(">==================================<");
            System.out.println(" [1] | Mahou");
            System.out.println(" [2] | Seishun Dorama");
            System.out.println(" [3] | Romance Shoujo");
            System.out.println(" [0] | Voltar");
            System.out.println(">==================================<");

            opcao = leitura.lerInteiro("Escolha o tipo de Shoujo: \n> ");

            if (opcao == 0) {
                Animacao.voltando();
                return;
            }

            switch(opcao) {
                case 1:
                    descricao = leitura.lerTexto("Descreva a obra Mahou: ");
                    cadastrarShoujoSubtipo("mahou", descricao);
                    break;
                case 2:
                    descricao = leitura.lerTexto("Descreva a obra Seishun Dorama: ");
                    cadastrarShoujoSubtipo("seishunDorama", descricao);
                    break;
                case 3:
                    descricao = leitura.lerTexto("Descreva a obra Romance Shoujo: ");
                    cadastrarShoujoSubtipo("romanceShoujo", descricao);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    Animacao.pressione();
            }
        } while(opcao != 0);
    }

    private void cadastrarShoujoSubtipo(String subtipo, String descricao) {
        Shoujo shoujo = new Shoujo();
        preencherDadosComuns(shoujo);

        switch (subtipo) {
            case "mahou":
                shoujo.setMahou(descricao);
                shoujo.getGeneros().setAcao(true);
                shoujo.getGeneros().setComedia(true);
                shoujo.getGeneros().setDrama(true);
                shoujo.getGeneros().setSuspense(false);
                shoujo.getGeneros().setTerror(false);
                shoujo.getGeneros().setRomance(true);
                break;
            case "seishunDorama":
                shoujo.setSeishunDorama(descricao);
                shoujo.getGeneros().setAcao(false);
                shoujo.getGeneros().setComedia(true);
                shoujo.getGeneros().setDrama(true);
                shoujo.getGeneros().setSuspense(false);
                shoujo.getGeneros().setTerror(false);
                shoujo.getGeneros().setRomance(true);
                break;
            case "romanceShoujo":
                shoujo.setRomanceShoujo(descricao);
                shoujo.getGeneros().setAcao(false);
                shoujo.getGeneros().setComedia(false);
                shoujo.getGeneros().setDrama(true);
                shoujo.getGeneros().setSuspense(false);
                shoujo.getGeneros().setTerror(false);
                shoujo.getGeneros().setRomance(true);
                break;
        }

        Estoque.cadastrarManga(shoujo);
    }

    private void cadastrarShounen() {
        int opcao;
        String descricao;

        do {
            Animacao.limparTela();
            System.out.println(">==================================<");
            System.out.println("         CADASTRAR SHOUNEN");
            System.out.println(">==================================<");
            System.out.println(" [1] | Battle Shonen");
            System.out.println(" [2] | Isekai");
            System.out.println(" [3] | Sport Shonen");
            System.out.println(" [0] | Voltar");
            System.out.println(">==================================<");

            opcao = leitura.lerInteiro("Escolha o tipo de Shounen: \n> ");

            if (opcao == 0) {
                Animacao.voltando();
                return;
            }

            switch(opcao) {
                case 1:
                    descricao = leitura.lerTexto("Descreva a obra Battle Shonen: ");
                    cadastrarShounenSubtipo("battleShonen", descricao);
                    break;
                case 2:
                    descricao = leitura.lerTexto("Descreva a obra Isekai: ");
                    cadastrarShounenSubtipo("isekai", descricao);
                    break;
                case 3:
                    descricao = leitura.lerTexto("Descreva a obra Sport Shonen: ");
                    cadastrarShounenSubtipo("sportShonen", descricao);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    Animacao.pressione();
            }
        } while(opcao != 0);
    }

    private void cadastrarShounenSubtipo(String subtipo, String descricao) {
        Shounen shounen = new Shounen();
        preencherDadosComuns(shounen);

        switch (subtipo) {
            case "battleShonen":
                shounen.setBattleShonen(descricao);
                shounen.getGeneros().setAcao(true);
                shounen.getGeneros().setComedia(true);
                shounen.getGeneros().setDrama(true);
                shounen.getGeneros().setSuspense(false);
                shounen.getGeneros().setTerror(false);
                shounen.getGeneros().setRomance(false);
                break;
            case "isekai":
                shounen.setIsekai(descricao);
                shounen.getGeneros().setAcao(true);
                shounen.getGeneros().setComedia(false);
                shounen.getGeneros().setDrama(true);
                shounen.getGeneros().setSuspense(true);
                shounen.getGeneros().setTerror(false);
                shounen.getGeneros().setRomance(true);
                break;
            case "sportShonen":
                shounen.setSportShonen(descricao);
                shounen.getGeneros().setAcao(false);
                shounen.getGeneros().setComedia(false);
                shounen.getGeneros().setDrama(true);
                shounen.getGeneros().setSuspense(true);
                shounen.getGeneros().setTerror(false);
                shounen.getGeneros().setRomance(false);
                break;
        }

        Estoque.cadastrarManga(shounen);
    }
}
