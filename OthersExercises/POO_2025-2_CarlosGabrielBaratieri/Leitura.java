// Nome: Carlos Gabriel Baratieri - RA: 2706598

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public String entDados(String rotulo) {
        System.out.print(rotulo);
        String valor = "";
        try {
            InputStreamReader tec = new InputStreamReader(System.in);
            BufferedReader buff = new BufferedReader(tec);
            valor = buff.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada!");
        }
        return valor;
    }
}

