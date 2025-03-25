import java.util.Scanner;

public class exercicio02 {
    /*
     * Análise do problema = Todas as informações/variáveis serão utilizadas
     * Entradas = valor
     * saida = par ou impar
     * Processos = se valor%2==0 o numero será par, caso contrario impar
     * Teste =
     * valor | 180 | 217 | 200 |
     * saída |par | impar| par |
     * 
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com um valor inteiro maior do que 0: ");
        int valor = leitor.nextInt();
        if (valor % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
        leitor.close();
    }
}
