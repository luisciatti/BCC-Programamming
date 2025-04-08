import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = meses
         * Saída = Mensagem indicando o percentual de reajuste salarial.
         * Processos =
         * - Se o funcionário tem até 12 meses na empresa, recebe 5% de reajuste.
         * - Se o funcionário tem entre 12 e 48 meses (inclusive), recebe 7% de
         * reajuste.
         * - Caso contrário, o reajuste não é informado.
         * Teste =
         * Meses | Resultado
         * --------------------------------------
         * 6 | O funcionário irá receber 5% de reajuste
         * 12 | O funcionário irá receber 5% de reajuste
         * 24 | O funcionário irá receber 7% de reajuste
         * 48 | O funcionário irá receber 7% de reajuste
         * 50 | Reajuste não informado
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantidade de meses na empresa: ");
        int meses = leitor.nextInt();
        if (meses <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste");
        } else if (meses >= 12 && meses <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste");
        } else {
            System.out.println("Reajuste não informado");
        }
        leitor.close();
    }
}
