import java.util.Scanner;

public class exercicio04 {
    /*
     * Análise do problema = Todas as informações/variáveis serão utilizadas
     * Entradas = valor1,valor2
     * saida = com casas decimais ou não
     * Processos = se o resto de divisao do numero for diferente de 0 ele digitou o
     * numero com casas decimais. Caso contrario, não.
     * Teste =
     * numero | 10 | 1,20 | 5,20 |
     * maior Valor |sem |com |com |
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = leitor.nextDouble();
        if (numero % 1 == 0) {
            System.out.println("Casas decimais não foram digitadas");
        } else {
            System.out.println("Casas decimais foram digitadas");
        }
        leitor.close();
    }
}
