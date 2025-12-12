// Autor: Carlos Gabriel Baratieri

public class Shounen extends Manga {

    private String battleShonen;
    private String isekai;
    private String sportShonen;

    // Construtor default
    public Shounen() {
    }

    public String getBattleShonen() {
        return battleShonen;
    }

    public void setBattleShonen(String battleShonen) {
        this.battleShonen = battleShonen;
    }

    public String getIsekai() {
        return isekai;
    }

    public void setIsekai(String isekai) {
        this.isekai = isekai;
    }

    public String getSportShonen() {
        return sportShonen;
    }

    public void setSportShonen(String sportShonen) {
        this.sportShonen = sportShonen;
    }

    //Sobrescrita
    public void exibirDescricao() {
        System.out.println("Editora Original: " + getInformacoesEditoriais().getEditorialJaponesa().getEditoraOriginal()); //Reflexividade
        System.out.println("Autor: " + getInformacoesEditoriais().getEditorialJaponesa().getAutor()); //Reflexividade
        System.out.println("Desenhista: " + getInformacoesEditoriais().getEditorialJaponesa().getDesenhista()); //Reflexividade
        System.out.println("Ano Publicação: " + getInformacoesEditoriais().getEditorialJaponesa().getAnoPublicacao()); //Reflexividade
        System.out.println("Edição: " + getInformacoesEditoriais().getEditorialJaponesa().getEdicao()); //Reflexividade
		
        System.out.println("Título Romanizado: " + getInformacoesEditoriais().getEditorialBrasileira().getTituloRomanizado()); //Reflexividade
        System.out.println("Tradutor: " + getInformacoesEditoriais().getEditorialBrasileira().getTradutor()); //Reflexividade
        System.out.println("Revisor: " + getInformacoesEditoriais().getEditorialBrasileira().getRevisor()); //Reflexividade
        System.out.println("Editora Brasileira: " + getInformacoesEditoriais().getEditorialBrasileira().getEditora()); //Reflexividade
        System.out.println("Ano Publicação Brasil: " + getInformacoesEditoriais().getEditorialBrasileira().getAnoPublicacao()); //Reflexividade
        System.out.println("Edição Brasil: " + getInformacoesEditoriais().getEditorialBrasileira().getEdicao()); //Reflexividade

        System.out.println("Número do Volume: " + getInformacoesEditoriais().getVolume().getNumeroVolume()); //Reflexividade
        System.out.println("Tipo do Volume: " + getInformacoesEditoriais().getVolume().getTipoVolume()); //Reflexividade
        System.out.println("Ano do Volume: " + getInformacoesEditoriais().getVolume().getAnoPublicacao()); //Reflexividade

        System.out.println("ISBN: " + getInformacoesEditoriais().getIsbn());

        System.out.println("Altura: " + getAspectosFisicos().getAltura() + " cm"); //Reflexividade
        System.out.println("Largura: " + getAspectosFisicos().getLargura() + " cm"); //Reflexividade
        System.out.println("Peso: " + getAspectosFisicos().getPeso() + " g"); //Reflexividade
        System.out.println("Tipo de Capa: " + getAspectosFisicos().getTipoCapa()); //Reflexividade
        System.out.println("Número de Páginas: " + getAspectosFisicos().getNumPaginas()); //Reflexividade
        System.out.println("Tipo de Papel: " + getAspectosFisicos().getTipoPapel()); //Reflexividade

        System.out.println("Condição: " + getEstadoConservacao().getCondicao()); //Reflexividade
        System.out.println("Integridade Física: " + getEstadoConservacao().getIntegridadeFisica()); //Reflexividade
        System.out.println("Preservação: " + getEstadoConservacao().getPreservacao()); //Reflexividade

        System.out.print("Gêneros: ");
        if (getGeneros().getAcao()) { //Reflexividade
            System.out.print("Ação ");
        }
        if (getGeneros().getComedia()) { //Reflexividade
            System.out.print("Comédia ");
        }
        if (getGeneros().getDrama()) { //Reflexividade
            System.out.print("Drama ");
        }
        if (getGeneros().getSuspense()) { //Reflexividade
            System.out.print("Suspense ");
        }
        if (getGeneros().getTerror()) { //Reflexividade
            System.out.print("Terror ");
        }
        if (getGeneros().getRomance()) { //Reflexividade
            System.out.print("Romance ");
        }
        System.out.println();

        if (battleShonen != null && !battleShonen.isEmpty()) {
            System.out.println("Battle Shonen: " + battleShonen);
        }
        if (isekai != null && !isekai.isEmpty()) {
            System.out.println("Isekai: " + isekai);
        }
        if (sportShonen != null && !sportShonen.isEmpty()) {
            System.out.println("Sport Shonen: " + sportShonen);
        }

        informacoesEstoque();

        System.out.println("Preço: R$ " + getPreco());
    }

    //Sobrescrita
    public void informacoesEstoque() {
        System.out.println("Shounen: " + getInformacoesEditoriais().getEditorialBrasileira().getTituloRomanizado()); //Reflexividade
        System.out.println("Código: " + getInformacoesEstoque().getCodigoInterno()); //Reflexividade
        System.out.println("Estoque: " + getInformacoesEstoque().getQuantidade()); //Reflexividade
        System.out.println("Local: " + getInformacoesEstoque().getLocalEstoque()); //Reflexividade
    }
}
