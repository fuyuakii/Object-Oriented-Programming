// Autor: Carlos Gabriel Baratieri

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

	// ===== Fim: Singleton =====
    private static Leitura instanciaLeitura; 
    private BufferedReader leitura;

    private Leitura() {
        leitura = new BufferedReader(new InputStreamReader(System.in));
    }

    public static Leitura getLeitura() {
        if (instanciaLeitura == null) {
            instanciaLeitura = new Leitura();
        }
        return instanciaLeitura;
    }
    // ===== Fim: Singleton =====
    
    public String lerTexto(String texto) {
        System.out.print(texto);
        try {
            return leitura.readLine();
        } catch (IOException e) {
            System.out.println("[ERRO]: Erro na leitura do texto!");
            return "";
        }
    }

    public int lerInteiro(String texto) {
        boolean valido = false;
        int numeroInteiro = 0;
        
        do {
            System.out.print(texto);
            try {
                String entrada = leitura.readLine();
                numeroInteiro = Integer.parseInt(entrada);
                valido = true;
            } catch (IOException e) {
                System.out.println("[ERRO]: Erro de leitura! Tente novamente");
            } catch (NumberFormatException e) {
                System.out.println("[ERRO]: Valor inválido! Digite um número inteiro");
            }
        } while (!valido);
        
        return numeroInteiro;
    }

    public float lerFloat(String texto) {
        boolean valido = false;
        float numeroFlutuante = 0;
        
        do {
            System.out.print(texto);
            try {
                String entrada = leitura.readLine();
                numeroFlutuante = Float.parseFloat(entrada);
                valido = true;
            } catch (IOException e) {
                System.out.println("[ERRO]: Erro de leitura! Tente novamente");
            } catch (NumberFormatException e) {
                System.out.println("[ERRO]: Valor inválido! Digite um número decimal");
            }
        } while (!valido);
        
        return numeroFlutuante;
    }
}

