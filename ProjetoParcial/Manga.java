// Nome: Carlos Gabriel Baratieri - 2706598
// Classe abstrata base para representação de um Mangá no sistema.

public abstract class Manga {

    // Atributos privados
    private InformacoesEditoriais informacoesEditoriais;
    private AspectosFisicos aspectosFisicos;
    private EstadoConservacao estadoConservacao;
    private InformacoesEstoque informacoesEstoque;
    private double preco; 
    private Generos generos;

    // Construtor default
    public Manga() {

    }

    // Getters e Setters
    public InformacoesEditoriais getInformacoesEditoriais() {
        return informacoesEditoriais;
    }

    public void setInformacoesEditoriais(InformacoesEditoriais informacoesEditoriais) {
        this.informacoesEditoriais = informacoesEditoriais;
    }

    public AspectosFisicos getAspectosFisicos() {
        return aspectosFisicos;
    }

    public void setAspectosFisicos(AspectosFisicos aspectosFisicos) {
        this.aspectosFisicos = aspectosFisicos;
    }

    public EstadoConservacao getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public InformacoesEstoque getInformacoesEstoque() {
        return informacoesEstoque;
    }

    public void setInformacoesEstoque(InformacoesEstoque informacoesEstoque) {
        this.informacoesEstoque = informacoesEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Generos getGeneros() {
        return generos;
    }

    public void setGeneros(Generos generos) {
        this.generos = generos;
    }

    // Métodos abstratos -> aplicar nos concretos
    public abstract void exibirDescricao();

    public abstract void informacoesEstoque();
}

