// Autor: Carlos Gabriel Baratieri

public class EstoqueVazioException extends Exception {

    // Construtor Default
    public EstoqueVazioException() {
    
    }

    public void mensagemEstoqueVazio() {
        System.out.println("[EXCEÇÃO]: Estoque vazio!!! Realize uma operação de cadastro antes...");
    }
}

