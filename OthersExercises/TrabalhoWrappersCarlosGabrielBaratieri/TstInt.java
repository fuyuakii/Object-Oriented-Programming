// Nome: Carlos Gabriel Baratieri
// RA: 2706598
// iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html

import java.util.Scanner;

public class TstInt {

    // i) Classe Integer: método bitCount(int)
    // ii) Retorna a quantidade de bits 1
    public void contadorBit() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leituraDados.nextInt();

        System.out.println("Quantidade de bits 1 = " + Integer.bitCount(numero));
    }

    // i) Classe Integer: método highestOneBit(int)
    // ii) Retorna o bit mais significativo
    public void bitMaisSIgnificativo() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leituraDados.nextInt();

        System.out.println("Bit mais significativo = " + Integer.highestOneBit(numero));
    }
}
