// Nome: Carlos Gabriel Baratieri - RA: 2706598

public class TstVeic {
    public static void main(String[] args) {
        Leitura leitura = new Leitura();
        Passeio carro = new Passeio();
        Carga caminhao = new Carga();
        int velocCarro, velocCaminhao;

        carro.setPlaca(leitura.entDados("placa do carro: "));
        carro.setMarca(leitura.entDados("marca do carro: "));
        carro.setModelo(leitura.entDados("modelo do carro: "));
        carro.setCor(leitura.entDados("cor do carro: "));
        carro.setQtdRodas(Integer.parseInt(leitura.entDados("quantidade de rodas do carro: ")));
        carro.setQtdePassageiro(Integer.parseInt(leitura.entDados("quantidade de passageiros do carro: ")));
        velocCarro = Integer.parseInt(leitura.entDados("velocidade máxima do carro (Km/h): "));
        if (velocCarro < 10 || velocCarro > 250) {
            System.out.println("Velocidade fora do limite. Será definido 100 Km/h");
            velocCarro = 100;
        }
        carro.setVelocMax(velocCarro);
        caminhao.setPlaca(leitura.entDados("placa do caminhão: "));
        caminhao.setMarca(leitura.entDados("marca do caminhão: "));
        caminhao.setModelo(leitura.entDados("modelo do caminhão: "));
        caminhao.setCor(leitura.entDados("cor do caminhão: "));
        caminhao.setQtdRodas(Integer.parseInt(leitura.entDados("quantidade de rodas do caminhão: ")));
        caminhao.setTara(Integer.parseInt(leitura.entDados("tara do caminhão: ")));
        caminhao.setCargaMax(Integer.parseInt(leitura.entDados("carga máxima do caminhão: ")));
        velocCaminhao = Integer.parseInt(leitura.entDados("velocidade máxima do caminhão (Km/h): "));
        if (velocCaminhao < 10 || velocCaminhao > 250) {
            System.out.println("Velocidade fora do limite. Será definido 100 Km/h");
            velocCaminhao = 100;
        }
        caminhao.setVelocMax(velocCaminhao);

        System.out.println("Velocidade do carro em m/h: " + carro.calcVel());
        System.out.println("Resultado do calcular(): " + carro.calcular());
        System.out.println("Velocidade do caminhão em cm/h: " + caminhao.calcVel());
        System.out.println("Resultado do calcular(): " + caminhao.calcular());
    }
}

