// Nome: Carlos Gabriel Baratieri - RA: 2706598

public final class Passeio extends Veiculo implements Calc {
    private int qtdePassageiro;

    public Passeio() {
        qtdePassageiro = 0;
    }

    public int getQtdePassageiro() {
        return qtdePassageiro;
    }

    public void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    public int calcVel() {
        return getVelocMax() * 1000;
    }

    public int calcular() {
        int soma = 0;
        String[] atributos = {getPlaca(), getMarca(), getModelo(), getCor(), getDataCadastro()};
        for (String s : atributos) {
            if (s != null) {
                soma += s.length();
            }
        }
        return soma;
    }
}

