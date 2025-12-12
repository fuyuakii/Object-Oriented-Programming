// Autor: Carlos Gabriel Baratieri

public class Kodomo extends Manga {

    private String educativo;
    private String fabulaConto;
    private String ilustrativo;

    // Construtor default
    public Kodomo() {
        this.educativo = "";
        this.fabulaConto = "";
        this.ilustrativo = "";
    }


    public String getEducativo() {
        return educativo;
    }

    public void setEducativo(String educativo) {
        this.educativo = educativo;
    }

    public String getFabulaConto() {
        return fabulaConto;
    }

    public void setFabulaConto(String fabulaConto) {
        this.fabulaConto = fabulaConto;
    }

    public String getIlustrativo() {
        return ilustrativo;
    }

    public void setIlustrativo(String ilustrativo) {
        this.ilustrativo = ilustrativo;
    }
}
