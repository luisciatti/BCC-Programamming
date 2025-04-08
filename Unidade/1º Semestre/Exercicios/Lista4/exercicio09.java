import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = valor1 e valor2.
         * Saída = Mensagem indicando se os valores são múltiplos ou não.
         * Processos = Se o primeiro valor for divisível pelo segundo sem deixar resto,
         * então são múltiplos; caso contrário, não são.
         * Teste =
         * valor1 | valor2 | resultado
         * ---------------------------
         * 10 | 5 | Os valores são múltiplos
         * 7 | 3 | Os valores não são múltiplos
         * 20 | 4 | Os valores são múltiplos
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor 1: ");
        int valor1 = leitor.nextInt();
        System.out.println("Valor 2: ");
        int valor2 = leitor.nextInt();
        if (valor1 % valor2 == 0) {
            System.out.println("Os valores são múltiplos");
        } else {
            System.out.println("Os valores não são múltiplos");
        }
        leitor.close();

    }
}
