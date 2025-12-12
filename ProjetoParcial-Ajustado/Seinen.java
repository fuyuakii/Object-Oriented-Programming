// Autor: Carlos Gabriel Baratieri

public class Seinen extends Manga {

    private String shinriThriller;
    private String ningenDorama;
    private String shakaiFushi;
    private String ankokuFantaji;

    // Construtor default
    public Seinen() {
        this.shinriThriller = "";
        this.ningenDorama = "";
        this.shakaiFushi = "";
        this.ankokuFantaji = "";
    }

    public String getShinriThriller() {
        return shinriThriller;
    }

    public void setShinriThriller(String shinriThriller) {
        this.shinriThriller = shinriThriller;
    }

    public String getNingenDorama() {
        return ningenDorama;
    }

    public void setNingenDorama(String ningenDorama) {
        this.ningenDorama = ningenDorama;
    }

    public String getShakaiFushi() {
        return shakaiFushi;
    }

    public void setShakaiFushi(String shakaiFushi) {
        this.shakaiFushi = shakaiFushi;
    }

    public String getAnkokuFantaji() {
        return ankokuFantaji;
    }

    public void setAnkokuFantaji(String ankokuFantaji) {
        this.ankokuFantaji = ankokuFantaji;
    }
}
