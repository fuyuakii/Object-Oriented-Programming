// Nome: Carlos Gabriel Baratieri
// RA: 2706598
// iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html

import java.util.Scanner;

public class TstLong {

    // i) Classe Long: método toHexString(long)
    // ii) Converte tipo long em hexadecimal
    public void conversaoHexa() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite um número: ");
        long numero = leituraDados.nextLong();

        System.out.println("Em Hexadecimal = " + Long.toHexString(numero));
    }

    // i) Classe Long: método toOctalString(long)
    // ii) Converte tipo long em octal
    public void conversaoOctal() {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite um número: ");
        long numero = leituraDados.nextLong();

        System.out.println("Em Octal = " + Long.toOctalString(numero));
    }
}
