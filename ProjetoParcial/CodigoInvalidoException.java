// Autor: Carlos Gabriel Baratieri

public class CodigoInvalidoException extends Exception {
    
    // Construtor default
    public CodigoInvalidoException() {
    
    }
    
    public CodigoInvalidoException(String mensagem) {
        System.out.println("[EXCEÇÃO]: " + mensagem);
    }
}
