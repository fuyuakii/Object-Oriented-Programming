// Autor: Carlos Gabriel Baratieri

public class EditorialBrasileira {

    private String tituloRomanizado;
    private String tradutor;
    private String revisor;
    private String editora;
    private int anoPublicacao;
    private int edicao;

    public EditorialBrasileira() {
        this.tituloRomanizado = "";
        this.tradutor = "";
        this.revisor = "";
        this.editora = "";
        this.anoPublicacao = 0;
        this.edicao = 0;
    }

    public String getTituloRomanizado() {
        return tituloRomanizado;
    }

    public void setTituloRomanizado(String tituloRomanizado) {
        this.tituloRomanizado = tituloRomanizado;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
