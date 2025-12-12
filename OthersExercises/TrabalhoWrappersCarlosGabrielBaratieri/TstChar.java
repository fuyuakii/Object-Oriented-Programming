// Nome: Carlos Gabriel Baratieri
// RA: 2706598
// iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html

import java.util.Scanner;

public class TstChar {

    // i) Classe Character: método toUpperCase(char)
    // ii) Converte um caractere para maiúsculo
    public void conversaoMaiuscula() {
        char caractere;
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        caractere = leituraDados.nextLine().charAt(0);

        System.out.println("Em maiúsculo = " + Character.toUpperCase(caractere));
    }

    // i) Classe Character: método toLowerCase(char)
    // ii) Converte um caractere para minúsculo
    public void conversaoMinuscula() {
        char caractere;
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        caractere = leituraDados.nextLine().charAt(0);

        System.out.println("Em minúsculo = " + Character.toLowerCase(caractere));
    }
}
