import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = mes
         * Saída =
         * - O nome do mês correspondente ao número informado.
         * - Caso o número informado seja inválido (fora do intervalo de 1 a 12), é
         * exibida uma mensagem de erro.
         * Processos =
         * - O programa lê o número do mês fornecido pelo usuário e utiliza o `switch`
         * para determinar qual mês exibir.
         * - Caso o número esteja fora do intervalo de 1 a 12, o programa retorna
         * "Valor inválido".
         * Teste =
         * Mês (número) | Resultado
         * -------------------------
         * 1 | Janeiro
         * 2 | Fevereiro
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o número do mês: ");
        int mes = leitor.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
        leitor.close();
    }
}
