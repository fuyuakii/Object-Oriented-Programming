// Autor: Carlos Gabriel Baratieri

public class Animacao {

    public static void esperar(long tempoEspera) {
        try {
            Thread.sleep(tempoEspera * 100L);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt();
        }
    }

	private static void carregando(String mensagem) {
		int total = 20;
		for (int i = 0; i <= total; i++) {
		    int progresso = (i * 100) / total;
		    System.out.print("\r" + mensagem + " [");
		    for (int j = 0; j < i; j++) System.out.print("=");
		    for (int j = i; j < total; j++) System.out.print(" ");
		    System.out.printf("] %d%%", progresso);
		    try {
		        Thread.sleep(100);
		    } catch (InterruptedException e) {
		        Thread.currentThread().interrupt();
		    }
		}
		System.out.println();
	}


    public static void limparTela() {
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("Erro ao limpar tela!");
        }
    }

    public static void pressione() { 
        System.out.println("Pressione Enter para continuar...");
        Leitura.getLeitura().lerTexto("");
    }
    
    
    public static void cadastrando() {
        carregando("Cadastrando");
    }

    public static void excluindo() {
        carregando("Excluindo");
    }

    public static void consultando() {
        carregando("Consultando");
    }

    public static void atualizando() {
        carregando("Atualizando");
    }
    public static void voltando(){
    	carregando("Voltando");
    }
}
