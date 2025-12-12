// Autor: Carlos Gabriel Baratieri

public class Volume {

    private int numeroVolume;
    private String tipoVolume;
    private int anoPublicacao;

    // Construtor default
    public Volume() {
    }

    public int getNumeroVolume() {
        return numeroVolume;
    }

    public void setNumeroVolume(int numeroVolume) {
        this.numeroVolume = numeroVolume;
    }

    public String getTipoVolume() {
        return tipoVolume;
    }

    public void setTipoVolume(String tipoVolume) {
        this.tipoVolume = tipoVolume;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
