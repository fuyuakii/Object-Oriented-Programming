// Autor: Carlos Gabriel Baratieri

public class Shoujo extends Manga {

    private String mahou;
    private String seishunDorama;
    private String romanceShoujo;

    // Construtor default
    public Shoujo() {
    }

    public String getMahou() {
        return mahou;
    }

    public void setMahou(String mahou) {
        this.mahou = mahou;
    }

    public String getSeishunDorama() {
        return seishunDorama;
    }

    public void setSeishunDorama(String seishunDorama) {
        this.seishunDorama = seishunDorama;
    }

    public String getRomanceShoujo() {
        return romanceShoujo;
    }

    public void setRomanceShoujo(String romanceShoujo) {
        this.romanceShoujo = romanceShoujo;
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

        if (mahou != null && !mahou.isEmpty()) {
            System.out.println("Mahou: " + mahou);
        }
        if (seishunDorama != null && !seishunDorama.isEmpty()) {
            System.out.println("Seishun Dorama: " + seishunDorama);
        }
        if (romanceShoujo != null && !romanceShoujo.isEmpty()) {
            System.out.println("Romance Shoujo: " + romanceShoujo);
        }

        informacoesEstoque();

        System.out.println("Preço: R$ " + getPreco());
    }

    //Sobrescrita
    public void informacoesEstoque() {
        System.out.println("Shoujo: " + getInformacoesEditoriais().getEditorialBrasileira().getTituloRomanizado()); //Reflexividade
        System.out.println("Código: " + getInformacoesEstoque().getCodigoInterno()); //Reflexividade
        System.out.println("Estoque: " + getInformacoesEstoque().getQuantidade()); //Reflexividade
        System.out.println("Local: " + getInformacoesEstoque().getLocalEstoque()); //Reflexividade
    }
}
