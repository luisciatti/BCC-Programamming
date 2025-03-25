import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = carta1,carta2,carta3
         * Saída = Mensagem indicando o nível do jogo com base na quantidade de cartas
         * boas.
         * Processos =
         * - Inicializar um contador para contar quantas cartas boas (1, 2 ou 3) foram
         * recebidas.
         * - Se houver uma carta boa, exibir "Truco".
         * - Se houver duas cartas boas, exibir "Seis".
         * - Se houver três cartas boas, exibir "Nove".
         * Teste =
         * carta1 | carta2 | carta3 | Resultado
         * --------------------------------------
         * 1 | 5 | 7 | Truco
         * 2 | 3 | 8 | Seis
         * 1 | 2 | 3 | Nove
         */

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a carta 1: ");
        int carta1 = leitor.nextInt();
        System.out.println("Informe a carta 2: ");
        int carta2 = leitor.nextInt();
        System.out.println("Informe a carta 3: ");
        int carta3 = leitor.nextInt();
        int qtdCartasBoas = 0;
        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtdCartasBoas = qtdCartasBoas + 1;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtdCartasBoas = qtdCartasBoas + 1;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtdCartasBoas = qtdCartasBoas + 1;
        }
        if (qtdCartasBoas == 1) {
            System.out.println("Truco");

        }
        if (qtdCartasBoas == 2) {
            System.out.println("SEIS");
        }
        if (qtdCartasBoas == 3) {
            System.out.println("NOVE");
        }
        leitor.close();
    }
}
