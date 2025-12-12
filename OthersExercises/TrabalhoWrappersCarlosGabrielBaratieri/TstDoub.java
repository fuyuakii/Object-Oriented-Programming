// Nome: Carlos Gabriel Baratieri
// RA: 2706598
// iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html

import java.util.Scanner;

public class TstDoub {

    // i) Classe Double: método doubleToLongBits(double)
    // ii) Converte um número double para sua representação em bits usando doubleToLongBits
    public void representacaoBinaria() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double valor1 = leituraDados.nextDouble();

        System.out.println("Conversao: " + Double.doubleToLongBits(valor1));
    }

    // i) Classe Double: método sum(double a, double b)
    // ii) Soma dois números double
    public void somaDouble() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = leituraDados.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = leituraDados.nextDouble();

        System.out.println("Soma = " + Double.sum(a, b));
    }
}

