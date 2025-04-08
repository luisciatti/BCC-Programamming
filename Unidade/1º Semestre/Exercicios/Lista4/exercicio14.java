import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = dia, mes, ano
         * Saída = Mensagem indicando se a data é válida ou não.
         * Processos =
         * - Verificar se o dia, mês e ano são positivos e dentro dos limites
         * aceitáveis.
         * - Validar os meses com 31 dias (1, 3, 5, 7, 8, 10, 12).
         * - Validar os meses com 30 dias (4, 6, 9, 11).
         * - Para fevereiro (mês 2), validar se o dia está entre 1 e 28 ou se é 29 em um
         * ano bissexto.
         * - Um ano é bissexto se:
         * For divisível por 4 e não por 100, exceto se for divisível por 400.
         * Teste =
         * dia | mes | ano | Resultado
         * --------------------------------------
         * 10 | 5 | 2023 | Válida
         * 31 | 4 | 2023 | Não Válida
         * 29 | 2 | 2023 | Não Válida
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = leitor.nextInt();
        System.out.println("Digite o mes: ");
        int mes = leitor.nextInt();
        System.out.println("Digite o ano: ");
        int ano = leitor.nextInt();
        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Válida");
            } else {
                if (mes != 2 && dia < 31) {
                    System.out.println("Válida");
                } else {
                    if (mes == 2 && dia < 29) {
                        System.out.println("Válida");
                    } else {
                        if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                            System.out.println("Válida");
                        } else {
                            System.out.println("Não Válida");
                        }
                    }
                }
            }
        } else {
            System.out.println("Não Válida");
        }
        leitor.close();
    }
}
