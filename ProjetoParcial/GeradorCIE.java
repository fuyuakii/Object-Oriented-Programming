// Autor: Carlos Gabriel Baratieri

import java.util.Random;

public class GeradorCIE {
    private static Random random = new Random();

    // Construtor default
    public GeradorCIE() {
    }

    public static int gerarCodigo() {
        return 100000 + random.nextInt(900000); 
    }
}
