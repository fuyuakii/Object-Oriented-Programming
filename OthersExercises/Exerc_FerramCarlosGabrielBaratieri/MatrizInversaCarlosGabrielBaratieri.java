// Carlos Gabriel Baratieri - RA: 2706598

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrizInversaCarlosGabrielBaratieri {

    public static int lerNumero(String mensagem) {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader leitor = new BufferedReader(entrada);
        int numero = 0;
        String dadoLeitura = "";
        System.out.print(mensagem);
        try {
            dadoLeitura = leitor.readLine();
        } catch (IOException e) {
            System.out.println("Falha [...]");
        }
        numero = Integer.parseInt(dadoLeitura);
        return numero;
    }

    public static void main(String[] args) {
        int linha = lerNumero("Tamanho da Linha: ");
        int coluna = lerNumero("Tamanho da Coluna: ");
        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = lerNumero("Valor [" + i + "][" + j + "]: ");
            }
        }
		System.out.println("");
        for (int i = linha - 1; i >= 0; i--) {
            for (int j = coluna - 1; j >= 0; j--) {
                System.out.printf("Valor[%d][%d]: %d\n", i, j, matriz[i][j]);
            }
        }
    }
}
