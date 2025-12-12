// Autor: Carlos Gabriel Baratieri

public abstract class CadastrarMangaBase {

    private static Leitura leitura = Leitura.getLeitura();

    public void preencherDadosComuns(Manga manga) {
        double preco = leitura.lerFloat("Informe o preço do mangá (float): ");
        manga.setPreco(preco);

        InformacoesEditoriais infoEdit = new InformacoesEditoriais();
        preencherDadosEditoriaisPadronizados(infoEdit);
        manga.setInformacoesEditoriais(infoEdit);

        AspectosFisicos fisico = new AspectosFisicos();
        preencherAspectosFisicosPadronizados(fisico);
        manga.setAspectosFisicos(fisico);

        EstadoConservacao estado = new EstadoConservacao();
        preencherEstadoConservacaoPadronizado(estado);
        manga.setEstadoConservacao(estado);

        Generos generos = new Generos();
        manga.setGeneros(generos);

        InformacoesEstoque estoque = new InformacoesEstoque();
        estoque.setQuantidade(leitura.lerInteiro("Informe a quantidade em estoque (int): "));
        estoque.setLocalEstoque(leitura.lerTexto("Informe o local de armazenamento (String): "));
        int codigo = GeradorCIE.gerarCodigo();
        estoque.setCodigoInterno(codigo);

        Animacao.cadastrando();
        Animacao.limparTela();
        System.out.println("Cadastrado com sucesso! O código do estoque desse mangá é: " + codigo);
        Animacao.pressione();

        manga.setInformacoesEstoque(estoque);
    }

    private void preencherDadosEditoriaisPadronizados(InformacoesEditoriais infoEdit) {
        EditorialJaponesa ej = new EditorialJaponesa();
        preencherEditorialJaponesaPadronizada(ej);
        infoEdit.setEditorialJaponesa(ej);

        EditorialBrasileira eb = new EditorialBrasileira();
        preencherEditorialBrasileiraPadronizada(eb);
        infoEdit.setEditorialBrasileira(eb);

        Volume vol = new Volume();
        vol.setNumeroVolume(leitura.lerInteiro("Informe o número do volume (int): "));
        vol.setTipoVolume(leitura.lerTexto("Informe o tipo de volume (String): "));
        vol.setAnoPublicacao(leitura.lerInteiro("Informe o ano do volume (int): "));
        infoEdit.setVolume(vol);

        infoEdit.setIsbn(leitura.lerTexto("Informe o ISBN (String): "));
    }

    private void preencherEditorialJaponesaPadronizada(EditorialJaponesa ej) {
        int opcaoEditora = escolherEditoraJaponesa();
        switch (opcaoEditora) {
            case 1:
                ej.setEditoraOriginal("Shueisha");
                break;
            case 2:
                ej.setEditoraOriginal("Kodansha");
                break;
            case 3:
                ej.setEditoraOriginal("Shogakukan");
                break;
            case 4:
                ej.setEditoraOriginal("Kadokawa Shoten");
                break;
            case 5:
                ej.setEditoraOriginal("Akita Shoten");
                break;
            case 6:
                ej.setEditoraOriginal("Hakusensha");
                break;
            default:
                ej.setEditoraOriginal("Shueisha");
        }

        ej.setAutor(leitura.lerTexto("Informe o autor (String): "));
        
        String desenhista = leitura.lerTexto("Informe o desenhista (String) [Enter se for o mesmo autor]: ");
        if (desenhista.trim().isEmpty()) {
            ej.setDesenhista(ej.getAutor());
        } else {
            ej.setDesenhista(desenhista);
        }

        ej.setAnoPublicacao(leitura.lerInteiro("Informe o ano de publicação (int): "));
        ej.setEdicao(leitura.lerInteiro("Informe a edição (int): "));
    }

    private void preencherEditorialBrasileiraPadronizada(EditorialBrasileira eb) {
        int opcaoEditora = escolherEditoraBrasileira();
        switch (opcaoEditora) {
            case 1:
                eb.setEditora("Panini");
                break;
            case 2:
                eb.setEditora("JBC");
                break;
            case 3:
                eb.setEditora("NewPOP");
                break;
            case 4:
                eb.setEditora("Editora Abril");
                break;
            case 5:
                eb.setEditora("Conrad");
                break;
            case 6:
                eb.setEditora("Outra");
                String outraEditora = leitura.lerTexto("Informe o nome da editora: ");
                eb.setEditora(outraEditora);
                break;
            default:
                eb.setEditora("Panini");
        }

        eb.setTituloRomanizado(leitura.lerTexto("Informe o título romanizado (String): "));
        
        eb.setTradutor(leitura.lerTexto("Informe o tradutor (String): "));
        
        String revisor = leitura.lerTexto("Informe o revisor (String) [Enter se for o mesmo tradutor]: ");
        if (revisor.trim().isEmpty()) {
            eb.setRevisor(eb.getTradutor());
        } else {
            eb.setRevisor(revisor);
        }

        eb.setAnoPublicacao(leitura.lerInteiro("Informe o ano de publicação no Brasil (int): "));
        eb.setEdicao(leitura.lerInteiro("Informe a edição no Brasil (int): "));
    }

    private void preencherAspectosFisicosPadronizados(AspectosFisicos fisico) {
        int opcaoVolume = escolherTipoVolume();
        switch (opcaoVolume) {
            case 1:
                fisico.setAltura(18.2);
                fisico.setLargura(12.8);
                fisico.setPeso(180.0);
                fisico.setTipoCapa("Tankoubon");
                break;
            case 2:
                fisico.setAltura(15.0);
                fisico.setLargura(10.5);
                fisico.setPeso(120.0);
                fisico.setTipoCapa("Bunkobon");
                break;
            case 3:
                fisico.setAltura(21.0);
                fisico.setLargura(14.8);
                fisico.setPeso(220.0);
                fisico.setTipoCapa("Wideban");
                break;
            case 4:
                fisico.setAltura(22.5);
                fisico.setLargura(15.2);
                fisico.setPeso(280.0);
                fisico.setTipoCapa("Kanzenban");
                break;
            default:
                fisico.setAltura(18.2);
                fisico.setLargura(12.8);
                fisico.setPeso(180.0);
                fisico.setTipoCapa("Tankoubon");
        }

        fisico.setNumPaginas(leitura.lerInteiro("Informe o número de páginas (int): "));

        int opcaoPapel = escolherTipoPapel();
        switch (opcaoPapel) {
            case 1:
                fisico.setTipoPapel("Couché");
                break;
            case 2:
                fisico.setTipoPapel("Offset");
                break;
            case 3:
                fisico.setTipoPapel("Jornal");
                break;
            case 4:
                fisico.setTipoPapel("Reciclado");
                break;
            default:
                fisico.setTipoPapel("Offset");
        }
    }

    private void preencherEstadoConservacaoPadronizado(EstadoConservacao estado) {
        int opcaoCondicao = escolherCondicao();
        switch (opcaoCondicao) {
            case 1:
                estado.setCondicao("Novo");
                break;
            case 2:
                estado.setCondicao("Semi-novo");
                break;
            case 3:
                estado.setCondicao("Usado");
                break;
            case 4:
                estado.setCondicao("Restaurado");
                break;
            default:
                estado.setCondicao("Novo");
        }

        int opcaoIntegridade = escolherIntegridade();
        switch (opcaoIntegridade) {
            case 1:
                estado.setIntegridadeFisica("Íntegro");
                break;
            case 2:
                estado.setIntegridadeFisica("Pequenos danos");
                break;
            case 3:
                estado.setIntegridadeFisica("Danos moderados");
                break;
            case 4:
                estado.setIntegridadeFisica("Danos severos");
                break;
            default:
                estado.setIntegridadeFisica("Íntegro");
        }

        int opcaoPreservacao = escolherPreservacao();
        switch (opcaoPreservacao) {
            case 1:
                estado.setPreservacao("Excelente");
                break;
            case 2:
                estado.setPreservacao("Boa");
                break;
            case 3:
                estado.setPreservacao("Regular");
                break;
            case 4:
                estado.setPreservacao("Ruim");
                break;
            default:
                estado.setPreservacao("Boa");
        }
    }

	private int escolherEditoraJaponesa() {
		System.out.println();
		System.out.println("Editoras Japonesas:");
		System.out.println(" [1] | Shueisha (Shonen Jump, etc.)");
		System.out.println(" [2] | Kodansha (Shonen Magazine, etc.)");
		System.out.println(" [3] | Shogakukan (Shonen Sunday, etc.)");
		System.out.println(" [4] | Kadokawa Shoten");
		System.out.println(" [5] | Akita Shoten");
		System.out.println(" [6] | Hakusensha");
		return leitura.lerInteiro("> ");
	}

	private int escolherEditoraBrasileira() {
		System.out.println();
		System.out.println("Editoras Brasileiras:");
		System.out.println(" [1] | Panini (Manga Line)");
		System.out.println(" [2] | JBC");
		System.out.println(" [3] | NewPOP");
		System.out.println(" [4] | Editora Abril");
		System.out.println(" [5] | Conrad");
		System.out.println(" [6] | Outra");
		return leitura.lerInteiro("> ");
	}

	private int escolherTipoVolume() {
		System.out.println();
		System.out.println("Tipos de Volume:");
		System.out.println(" [1] | Tankoubon (Formato padrão)");
		System.out.println("      Altura: 18.2cm, Largura: 12.8cm, Peso: 180g");
		System.out.println(" [2] | Bunkobon (Formato menor e econômico)");
		System.out.println("      Altura: 15.0cm, Largura: 10.5cm, Peso: 120g");
		System.out.println(" [3] | Wideban (Formato maior)");
		System.out.println("      Altura: 21.0cm, Largura: 14.8cm, Peso: 220g");
		System.out.println(" [4] | Kanzenban/Aizouban (Edição de colecionador)");
		System.out.println("      Altura: 22.5cm, Largura: 15.2cm, Peso: 280g");
		return leitura.lerInteiro("> ");
	}

	private int escolherTipoPapel() {
		System.out.println();
		System.out.println("Tipos de Papel:");
		System.out.println(" [1] | Couché (Alta qualidade)");
		System.out.println(" [2] | Offset (Qualidade padrão)");
		System.out.println(" [3] | Jornal (Econômico)");
		System.out.println(" [4] | Reciclado (Ecológico)");
		return leitura.lerInteiro("> ");
	}

	private int escolherCondicao() {
		System.out.println();
		System.out.println("Condição do Manga:");
		System.out.println(" [1] | Novo (Lacrado/ Nunca usado)");
		System.out.println(" [2] | Semi-novo (Pouco uso)");
		System.out.println(" [3] | Usado (Sinais de uso visíveis)");
		System.out.println(" [4] | Restaurado (Danos reparados)");
		return leitura.lerInteiro("> ");
	}

	private int escolherIntegridade() {
		System.out.println();
		System.out.println("Integridade Física:");
		System.out.println(" [1] | Íntegro (Sem danos)");
		System.out.println(" [2] | Pequenos danos (Amassados leves)");
		System.out.println(" [3] | Danos moderados (Páginas soltas)");
		System.out.println(" [4] | Danos severos (Capa danificada)");
		return leitura.lerInteiro("> ");
	}

	private int escolherPreservacao() {
		System.out.println();
		System.out.println("Estado de Preservação:");
		System.out.println(" [1] | Excelente (Conservado perfeitamente)");
		System.out.println(" [2] | Boa (Pequenos sinais de tempo)");
		System.out.println(" [3] | Regular (Amarelecimento/ Manchas)");
		System.out.println(" [4] | Ruim (Deterioração avançada)");
		return leitura.lerInteiro("> ");
	}
}
