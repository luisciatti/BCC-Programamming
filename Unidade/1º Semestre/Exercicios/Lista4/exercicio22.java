import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = opcao
         * Saída =
         * - O título do curso correspondente à opção fornecida.
         * Processos =
         * - O programa lê a opção do usuário e utiliza a estrutura `switch` para
         * determinar qual curso exibir, de acordo com a escolha:
         * 1. Ciência da Computação
         * 2. Licenciatura em Computação
         * 3. Sistemas de Informação
         * - Caso o número não corresponda a nenhuma das opções, não será exibida
         * nenhuma mensagem.
         * Teste =
         * Opção | Resultado
         * --------------------
         * 1 | Bacharel em Ciência da Computação
         * 2 | Licenciado em Ciência da Computação
         * 3 | Bacharel em Sistemas de Informação
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação");
        byte opcao = leitor.nextByte();
        switch (opcao) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Ciência da Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                break;
        }
        leitor.close();
    }
}
