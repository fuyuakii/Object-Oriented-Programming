// Carlos Gabriel Baratieri - RA: 2706598

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VetorInversoCarlosGabrielBaratieri {

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
        int tamanho = lerNumero("Tamanho do vetor: ");
        int[] vetorNumeros = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vetorNumeros[i] = lerNumero("Valor " + (i + 1) + ": ");
		}
		System.out.println("");
		for (int i = tamanho - 1; i >= 0; i--) {
			System.out.printf("Valor %d: %d\n", i + 1, vetorNumeros[i]);
		}
    }
}

