import java.util.Scanner;

public class exercicio03 {
    /*
     * Análise do problema = Todas as informações/variáveis serão utilizadas
     * Entradas = valor1,valor2
     * saida = maior Valor
     * Processos = se valor1 for maior que valor2,
     * escrever(valor1+"é maior que"+valor2)
     * Teste =
     * valor1 | 180 | 30 | 5 |
     * valor2 | 35 | 20 | 10 |
     * maior Valor |valor1|valor1|valor2|
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor 1: ");
        int valor1 = leitor.nextInt();
        System.out.println("Valor 2: ");
        int valor2 = leitor.nextInt();
        if (valor1 > valor2) {
            System.out.println("O valor " + valor1 + " é maior do que o valor " + valor2);
        } else {
            System.out.println("O valor " + valor2 + " é maior do que o valor " + valor1);
        }
        leitor.close();
    }
}
