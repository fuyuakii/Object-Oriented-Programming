// Autor: Carlos Gabriel Baratieri

public class InformacoesEstoque {

    private int quantidade;
    private String localEstoque;
    private int codigoInterno;

    public InformacoesEstoque() {
        this.quantidade = 0;
        this.localEstoque = "";
        this.codigoInterno = 0;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getLocalEstoque() {
        return localEstoque;
    }

    public void setLocalEstoque(String localEstoque) {
        this.localEstoque = localEstoque;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
}
