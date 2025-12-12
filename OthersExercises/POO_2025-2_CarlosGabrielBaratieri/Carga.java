// Nome: Carlos Gabriel Baratieri - RA: 2706598

public final class Carga extends Veiculo implements Calc {
    private int tara;
    private int cargaMax;

    public Carga() {
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int calcVel() {
        return getVelocMax() * 100000;
    }

    public int calcular() {
        int soma = 0;
        soma += getQtdRodas();
        soma += getVelocMax();
        soma += tara;
        soma += cargaMax;
        if (getMotor() != null) {
            soma += getMotor().getQtdPistoes();
            soma += getMotor().getPotencia();
        }
        return soma;
    }
}

