// Nome: Carlos Gabriel Baratieri
// RA: 2706598
// iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html

import java.util.Scanner;

public class TstByte {

    // i) Classe Byte: método parseByte(String)
    // ii) Converte String para byte
    public void conversaoStringByte() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite algum número para o parse: ");
        String valor1 = leituraDados.nextLine();

        System.out.println("Resultado do parse = " + Byte.parseByte(valor1));
    }

    // i) Classe Byte: método decode()
    // ii) Converte String para byte -> compreende várias bases numéricas
    public void conversaoBasesNumericasString() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite um número de alguma base diferente de 2 para decode (ex: 0x10): ");
        String valor2 = leituraDados.nextLine();

        System.out.println("Decode = " + Byte.decode(valor2));
    }
}
