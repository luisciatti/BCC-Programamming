import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        /*
         * Análise do problema =Todas as informações/variáveis serão utilizadas
         * Entradas = idade1, idade2, idade3
         * Saída = Mensagem indicando se são gêmeos, trigêmeos ou apenas irmãos.
         * Processos =
         * - Se pelo menos dois irmãos tiverem a mesma idade, exibir "GÊMEOS".
         * - Se os três irmãos tiverem a mesma idade, exibir "TRIGÊMEOS".
         * - Caso contrário, exibir "APENAS IRMÃOS".
         * Teste =
         * idade1 | idade2 | idade3 | Resultado
         * --------------------------------------
         * 10 | 10 | 12 | GÊMEOS
         * 15 | 15 | 15 | TRIGÊMEOS
         * 8 | 12 | 14 | APENAS IRMÃOS
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a idade do 1° irmão: ");
        int idade1 = leitor.nextInt();
        System.out.println("Digite a idade do 2° irmão: ");
        int idade2 = leitor.nextInt();
        System.out.println("Digite a idade do 3° irmão: ");
        int idade3 = leitor.nextInt();
        if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3) {
            System.out.println("GÊMEOS");
        } else if (idade1 == idade2 && idade1 == idade3 && idade3 == idade2) {
            System.out.println("TRIGÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }
        leitor.close();
    }
}
