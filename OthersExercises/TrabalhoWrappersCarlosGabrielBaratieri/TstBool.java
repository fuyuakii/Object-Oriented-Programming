// Nome: Carlos Gabriel Baratieri
// RA: 2706598
// iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html

public class TstBool {
    // i) Classe Boolean: método logicalAnd(boolean a, boolean b)
    // ii) Retorna true somente se ambos os valores forem true
    public void operacaoAnd() {
        boolean a = true, b = false;
        System.out.println("AND lógico = " + Boolean.logicalAnd(a, b));
    }

    // i) Classe Boolean: método logicalOr(boolean a, boolean b)
    // ii) Retorna true se pelo menos um dos valores for true
    public void operacaoOr() {
        boolean a = true, b = false;
        System.out.println("OR lógico = " + Boolean.logicalOr(a, b));
    }
}
