// Autor: Carlos Gabriel Baratieri

public class AspectosFisicos {

    private double altura;
    private double largura;
    private double peso;
    private String tipoCapa;
    private int numPaginas;
    private String tipoPapel;

    public AspectosFisicos() {
        this.altura = 0.0;
        this.largura = 0.0;
        this.peso = 0.0;
        this.tipoCapa = "";
        this.numPaginas = 0;
        this.tipoPapel = "";
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(String tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getTipoPapel() {
        return tipoPapel;
    }

    public void setTipoPapel(String tipoPapel) {
        this.tipoPapel = tipoPapel;
    }
}
