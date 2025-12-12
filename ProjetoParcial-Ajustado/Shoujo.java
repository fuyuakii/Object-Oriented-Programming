// Autor: Carlos Gabriel Baratieri

public class Shoujo extends Manga {

    private String mahou;
    private String seishunDorama;
    private String romanceShoujo;

    // Construtor default
    public Shoujo() {
        this.mahou = "";
        this.seishunDorama = "";
        this.romanceShoujo = "";
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
}
