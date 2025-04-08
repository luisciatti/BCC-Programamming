import java.util.Scanner;

public class exercicio05 {
    /*
     * Análise do problema = Todas as informações/variáveis serão utilizadas
     * Entradas = cor
     * saida = Sim ou não
     * Processos = caso a resposta for true então será sim. Caso contrario, não.
     * Teste =
     * cor | true| false|
     * SimouNão | Sim | Não |
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("A cor é azul? ");
        boolean cor = leitor.nextBoolean();
        if (cor == true) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        leitor.close();
    }
}
