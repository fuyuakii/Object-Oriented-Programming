// Carlos Gabriel Baratieri - RA: 2706598

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G1CarlosGabrielBaratieri {
    public static void mostrarMenu() {
        System.out.println("\nMenu de Opções:");
        System.out.println("1 - Somar");
        System.out.println("2 - Multiplicação");
        System.out.println("3 - Subtração");
        System.out.println("4 - Divisão");
        System.out.print("Escolha uma opção: ");
    }

    public static float lerNumero(String mensagem) {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader leitor = new BufferedReader(entrada);
        float numero = 0.0f;
        String dadoLeitura = "";
        System.out.print(mensagem);
        try {
            dadoLeitura = leitor.readLine();
        } catch (IOException e) {
            System.out.println("Falha [...]");
        }
        numero = Float.parseFloat(dadoLeitura);
        return numero;
    }

    public static void main(String args[]) {
    	float primeiroNumero = 0.0f, segundoNumero = 0.0f;
    	int opcao = 0;
    	
		do {
			mostrarMenu();
			opcao = (int)lerNumero("");
		} while (opcao < 1 || opcao > 4);
        
        primeiroNumero = lerNumero("Digite o valor do primeiro numero ");     
        if (opcao == 4) {
        	do {
        		segundoNumero = lerNumero("Digite o valor do segundo numero (Não pode ser zero): ");
        	} while (segundoNumero == 0); 
        } else {
        	segundoNumero = lerNumero("Digite o valor do segundo numero: ");
        }

        switch (opcao) {
            case 1:
                System.out.println("Soma: " + (primeiroNumero + segundoNumero));
                break;
            case 2:
                System.out.println("Multiplicação: " + (primeiroNumero * segundoNumero));
                break;
            case 3:
                System.out.println("Subtração: " + (primeiroNumero - segundoNumero));
                break;
            case 4:
                System.out.println("Divisão: " + (primeiroNumero / segundoNumero));
                break;
        }
    }
}
