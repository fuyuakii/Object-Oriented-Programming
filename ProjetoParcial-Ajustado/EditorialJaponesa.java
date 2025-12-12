// Autor: Carlos Gabriel Baratieri

public class EditorialJaponesa {

    private String editoraOriginal;
    private String autor;
    private String desenhista;
    private int anoPublicacao;
    private int edicao;

    public EditorialJaponesa() {
        this.editoraOriginal = "";
        this.autor = "";
        this.desenhista = "";
        this.anoPublicacao = 0;
        this.edicao = 0;
    }

    public String getEditoraOriginal() {
        return editoraOriginal;
    }

    public void setEditoraOriginal(String editoraOriginal) {
        this.editoraOriginal = editoraOriginal;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDesenhista() {
        return desenhista;
    }

    public void setDesenhista(String desenhista) {
        this.desenhista = desenhista;
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
