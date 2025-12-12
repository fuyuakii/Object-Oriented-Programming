// Autor: Carlos Gabriel Baratieri

public abstract class CadastrarMangaBase {

    private static Leitura leitura = Leitura.getLeitura();

    public void preencherDadosComuns(Manga manga) {

        double preco = leitura.lerFloat("Informe o preço do mangá (float): ");
        manga.setPreco(preco);

        InformacoesEditoriais infoEdit = new InformacoesEditoriais();

        EditorialJaponesa ej = new EditorialJaponesa();
        ej.setEditoraOriginal(leitura.lerTexto("Informe a editora original (String): "));
        ej.setAutor(leitura.lerTexto("Informe o autor (String): "));
        ej.setDesenhista(leitura.lerTexto("Informe o desenhista (String): "));
        ej.setAnoPublicacao(leitura.lerInteiro("Informe o ano de publicação (int): "));
        ej.setEdicao(leitura.lerInteiro("Informe a edição (int): "));
        infoEdit.setEditorialJaponesa(ej);

        EditorialBrasileira eb = new EditorialBrasileira();
        eb.setTituloRomanizado(leitura.lerTexto("Informe o título romanizado (String): "));
        eb.setTradutor(leitura.lerTexto("Informe o tradutor (String): "));
        eb.setRevisor(leitura.lerTexto("Informe o revisor (String): "));
        eb.setEditora(leitura.lerTexto("Informe a editora brasileira (String): "));
        eb.setAnoPublicacao(leitura.lerInteiro("Informe o ano de publicação no Brasil (int): "));
        eb.setEdicao(leitura.lerInteiro("Informe a edição no Brasil (int): "));
        infoEdit.setEditorialBrasileira(eb);

        Volume vol = new Volume();
        vol.setNumeroVolume(leitura.lerInteiro("Informe o número do volume (int): "));
        vol.setTipoVolume(leitura.lerTexto("Informe o tipo de volume (String): "));
        vol.setAnoPublicacao(leitura.lerInteiro("Informe o ano do volume (int): "));
        infoEdit.setVolume(vol);

        infoEdit.setIsbn(leitura.lerTexto("Informe o ISBN (String): "));
        manga.setInformacoesEditoriais(infoEdit);

        AspectosFisicos fisico = new AspectosFisicos();
        fisico.setAltura(leitura.lerFloat("Informe a altura em centímetros (float): "));
        fisico.setLargura(leitura.lerFloat("Informe a largura em centímetros (float): "));
        fisico.setPeso(leitura.lerFloat("Informe o peso em gramas (float): "));
        fisico.setTipoCapa(leitura.lerTexto("Informe o tipo de capa (String): "));
        fisico.setNumPaginas(leitura.lerInteiro("Informe o número de páginas (int): "));
        fisico.setTipoPapel(leitura.lerTexto("Informe o tipo de papel (String): "));
        manga.setAspectosFisicos(fisico);

        EstadoConservacao estado = new EstadoConservacao();
        estado.setCondicao(leitura.lerTexto("Informe a condição do mangá (String): "));
        estado.setIntegridadeFisica(leitura.lerTexto("Informe a integridade física (String): "));
        estado.setPreservacao(leitura.lerTexto("Informe a preservação (String): "));
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
}
