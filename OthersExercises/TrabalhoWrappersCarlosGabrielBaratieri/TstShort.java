// Nome: Carlos Gabriel Baratieri
// RA: 2706598
// iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html

import java.util.Scanner;

public class TstShort {

    // i) Classe Short: método reverseBytes(short)
    // ii) Inverte os bytes de um short.
    public void reversaoBytes() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite um número: ");
        short numero = leituraDados.nextShort();

        System.out.println("Valor com bytes invertidos = " + Short.reverseBytes(numero));
    }

    // i) Classe Short: método byteValue()
    // ii) Converte um Short para byte
    public void valorBytes() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite um número: ");
        short numero = leituraDados.nextShort();

        System.out.println("Valor convertido para byte = " + Short.valueOf(numero).byteValue());
    }
}
