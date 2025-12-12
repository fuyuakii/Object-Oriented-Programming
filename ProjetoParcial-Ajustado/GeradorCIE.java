// Autor: Carlos Gabriel Baratieri

import java.util.Random;

public class GeradorCIE {
    private static Random random = new Random();

    public static int gerarCodigo() {
        return 100000 + random.nextInt(900000); 
    }
}
