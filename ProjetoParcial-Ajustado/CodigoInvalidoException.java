// Autor: Carlos Gabriel Baratieri

public class CodigoInvalidoException extends Exception {
    public CodigoInvalidoException(String mensagem) {
        System.out.println("[EXCEÇÃO]: " + mensagem);
    }
}
