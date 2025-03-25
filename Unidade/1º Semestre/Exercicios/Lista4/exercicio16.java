import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = idadeHomem1, idadeHomem2, idadeMulher1, idadeMulher2
         * Saída = A soma da idade do homem mais velho com a idade da mulher mais nova e
         * o produto da idade do homem mais novo com a idade da mulher mais velha.
         * Processos =
         * - Comparar as idades dos homens para determinar o mais velho e o mais novo.
         * - Comparar as idades das mulheres para determinar a mais velha e a mais nova.
         * - Calcular:
         * Soma = idade do homem mais velho + idade da mulher mais nova.
         * Produto = idade do homem mais novo * idade da mulher mais velha.
         * Teste =
         * Idade H1 | Idade H2 | Idade M1 | Idade M2 | Soma | Produto
         * ---------------------------------------------------------
         * 30 | 25 | 20 | 18 | 48 | 500
         * 40 | 35 | 50 | 30 | 70 | 1750
         * 28 | 32 | 26 | 22 | 54 | 832
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva a idade do 1º homem: ");
        int idadeHomem1 = leitor.nextInt();
        System.out.println("Escreva a idade do 2º homem: ");
        int idadeHomem2 = leitor.nextInt();
        System.out.println("Escreva a idade do 1º mulher: ");
        int idadeMulher1 = leitor.nextInt();
        System.out.println("Escreva a idade do 2º mulher: ");
        int idadeMulher2 = leitor.nextInt();
        if (idadeHomem1 > idadeHomem2) {
            if (idadeMulher1 > idadeMulher2) {
                System.out.println("Soma: " + (idadeHomem1 + idadeMulher2));
                System.out.println("Produto: " + idadeHomem2 * idadeMulher1);
            } else {
                System.out.println("Soma: " + (idadeHomem1 + idadeMulher1));
                System.out.println("Produto: " + idadeHomem2 * idadeMulher2);
            }

        } else {
            if (idadeMulher1 > idadeMulher2) {
                System.out.println("Soma: " + (idadeHomem2 + idadeMulher2));
                System.out.println("Produto: " + idadeHomem1 * idadeMulher1);
            } else {
                System.out.println("Soma: " + (idadeHomem2 + idadeMulher1));
                System.out.println("Produto: " + idadeHomem1 * idadeMulher2);
            }
        }

        leitor.close();
    }
}
