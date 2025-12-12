// Nome: Carlos Gabriel Baratieri
// RA: 2706598
// iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html

import java.util.Scanner;

public class TstFloat {

    // i) Classe Float: método min(float, float)
    // ii) Retorna o menor valor entre dois floats
    public void operacaoMin() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite o primeiro número (ex: 2,5): ");
        float a = leituraDados.nextFloat();
        System.out.print("Digite o segundo número (ex: 2,5): ");
        float b = leituraDados.nextFloat();

        System.out.println("Menor valor = " + Float.min(a, b));
    }

    // i) Classe Float: método max(float, float)
    // ii) Retorna o maior valor entre dois floats
    public void operacaoMax() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite o primeiro número (ex: 2,5): ");
        float a = leituraDados.nextFloat();
        System.out.print("Digite o segundo número (ex: 2,5): ");
        float b = leituraDados.nextFloat();

        System.out.println("Maior valor = " + Float.max(a, b));
    }
}
