// Autor: Carlos Gabriel Baratieri

public class EstoqueVazioException extends Exception {
    public void mensagemEstoqueVazio() {
        System.out.println("[EXCEÇÃO]: Estoque vazio!!! Realize uma operação de cadastro antes...");
    }
}

