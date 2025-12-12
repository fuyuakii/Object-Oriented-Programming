// Autor: Carlos Gabriel Baratieri

public class Shounen extends Manga {

    private String battleShonen;
    private String isekai;
    private String sportShonen;

    // Construtor default
    public Shounen() {
        this.battleShonen = "";
        this.isekai = "";
        this.sportShonen = "";
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
}
