// Nome: Carlos Gabriel Baratieri
// RA: 2706598

import java.util.Scanner;

public class TstWrap {

    public static void main(String args[]) {
        Scanner leituraDados = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu de Opções :)");
            System.out.println("1: Integer");
            System.out.println("2: Boolean");
            System.out.println("3: Character");
            System.out.println("4: Double");
            System.out.println("5: Byte");
            System.out.println("6: Short");
            System.out.println("7: Float");
            System.out.println("8: Long");
            System.out.println("0: Sair");
            System.out.print("Seleção: ");

            opcao = leituraDados.nextInt();

            switch (opcao) {
                case 1:
                    TstInt i = new TstInt();
                    i.contadorBit();
                    i.bitMaisSIgnificativo();
                    break;
                case 2:
                    TstBool b = new TstBool();
                    b.operacaoAnd();
                    b.operacaoOr();
                    break;
                case 3:
                    TstChar c = new TstChar();
                    c.conversaoMaiuscula();
                    c.conversaoMinuscula();
                    break;
                case 4:
                    TstDoub d = new TstDoub();
                    d.representacaoBinaria();
                    d.somaDouble();
                    break;
                case 5:
                    TstByte by = new TstByte();
                    by.conversaoStringByte();
                    by.conversaoBasesNumericasString();
                    break;
                case 6:
                    TstShort s = new TstShort();
                    s.reversaoBytes();
                    s.valorBytes();
                    break;
                case 7:
                    TstFloat f = new TstFloat();
                    f.operacaoMin();
                    f.operacaoMax();
                    break;
                case 8:
                    TstLong l = new TstLong();
                    l.conversaoHexa();
                    l.conversaoOctal();
                    break;
                case 0:
                    break;
                default:
                    System.out.print("Tente novamente!\n");
            }

        } while (opcao != 0);

        leituraDados.close();
    }
}

