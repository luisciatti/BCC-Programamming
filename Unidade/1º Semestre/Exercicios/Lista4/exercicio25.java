import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        /*
         * Análise do problema =Todas as informações/variáveis serão utilizadas
         * Entradas = valor1,valor2,opcao
         * Saída =
         * - O resultado da operação solicitada ou uma mensagem de erro.
         * Processos =
         * - O programa verifica a opção informada (1, 2, 3 ou 4).
         * - Dependendo da opção, ele realiza a operação (soma, subtração, multiplicação
         * ou divisão).
         * - Caso a opção seja inválida, o programa exibe uma mensagem de erro.
         * - Caso a operação seja divisão, o programa verifica se o denominador é
         * diferente de zero para evitar divisão por zero.
         * Teste =
         * valor1 | 180 | 30 | 5 |
         * valor2 | 35 | 20 | 10|
         * opcao | 1 | 2 | 3 |
         * resultado |215 |10 |50 |
         * 
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor 1: ");
        int valor1 = leitor.nextInt();
        System.out.println("Valor 2: ");
        int valor2 = leitor.nextInt();
        System.out.println("Opção: ");
        int opcao = leitor.nextInt();
        switch (opcao) {
            case 1:
                System.out.println(valor1 + valor2);
                break;
            case 2:
                System.out.println(valor1 - valor2);
                break;
            case 3:
                System.out.println(valor1 * valor2);
                break;
            case 4:
                if (valor2 > 0) {
                    System.out.println(valor1 / valor2);
                } else {
                    System.out.println("Denominador não pode ser 0");
                }
                break;
            default:
                System.out.println("Erro");
                break;
        }
        leitor.close();
    }
}
