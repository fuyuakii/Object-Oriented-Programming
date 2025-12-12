// Nome: Carlos Gabriel Baratieri - 2706598

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
        this.informacoesEditoriais = new InformacoesEditoriais();
        this.aspectosFisicos = new AspectosFisicos();
        this.estadoConservacao = new EstadoConservacao();
        this.informacoesEstoque = new InformacoesEstoque();
        this.preco = 0.0;
        this.generos = new Generos();
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
}
