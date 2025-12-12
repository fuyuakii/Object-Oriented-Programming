// Autor: Carlos Gabriel Baratieri

public class Josei extends Manga {

    private String shokubaDorama;
    private String kekkonSeikatsu;
    private String otonaDorama;

	// Construtor Default
    public Josei() {
        this.shokubaDorama = "";
        this.kekkonSeikatsu = "";
        this.otonaDorama = "";
    }

    public String getShokubaDorama() {
        return shokubaDorama;
    }

    public void setShokubaDorama(String shokubaDorama) {
        this.shokubaDorama = shokubaDorama;
    }

    public String getKekkonSeikatsu() {
        return kekkonSeikatsu;
    }

    public void setKekkonSeikatsu(String kekkonSeikatsu) {
        this.kekkonSeikatsu = kekkonSeikatsu;
    }

    public String getOtonaDorama() {
        return otonaDorama;
    }

    public void setOtonaDorama(String otonaDorama) {
        this.otonaDorama = otonaDorama;
    }
}
