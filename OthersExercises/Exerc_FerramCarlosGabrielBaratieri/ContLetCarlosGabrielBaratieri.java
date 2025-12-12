// Carlos Gabriel Baratieri - RA: 2706598

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContLetCarlosGabrielBaratieri {
    public static String lerCadeia(String mensagem) {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader leitor = new BufferedReader(entrada);
        String dadoLeitura = "";
        System.out.print(mensagem);
        try {
            dadoLeitura = leitor.readLine();
        } catch (IOException e) {
            System.out.println("Falha [...]");
        }
        
        return dadoLeitura;
    }
    
	public static void main(String args[]) {
		int contador = 0;
		boolean existencia = false;
		
		String frase = lerCadeia("Digite sua frase: ");
		frase = frase.toLowerCase();
		String caractereFrase = lerCadeia("Digite um caractere: ");
		
		int[] posicoes = new int[frase.length()];

		caractereFrase = caractereFrase.toLowerCase();
		char caractere = caractereFrase.charAt(0);
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == caractere) {
				posicoes[contador] = i + 1;
				contador++;
				existencia = true;
			}
		}
		
        if (existencia) {
            System.out.println("Quantidade: "+contador);
            System.out.print("Posição: ");
            for (int i = 0; i < contador; i++) {
                System.out.print(posicoes[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Não apareceu na frase!");
        }
	}
}
