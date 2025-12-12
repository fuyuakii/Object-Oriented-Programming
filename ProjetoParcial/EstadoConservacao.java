// Autor: Carlos Gabriel Baratieri

public class EstadoConservacao {

    private String condicao;
    private String integridadeFisica;
    private String preservacao;

    // Construtor default
    public EstadoConservacao() {
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getIntegridadeFisica() {
        return integridadeFisica;
    }

    public void setIntegridadeFisica(String integridadeFisica) {
        this.integridadeFisica = integridadeFisica;
    }

    public String getPreservacao() {
        return preservacao;
    }

    public void setPreservacao(String preservacao) {
        this.preservacao = preservacao;
    }
}
