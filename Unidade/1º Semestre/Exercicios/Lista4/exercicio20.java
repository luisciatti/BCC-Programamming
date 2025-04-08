import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = nota1,nota2,nota3,notaexercicios
         * Saída =
         * - A média de aproveitamento do aluno.
         * - O conceito (A, B, C, D ou E) baseado na média.
         * - Se o aluno foi aprovado ou reprovado.
         * Processos =
         * - Calcula a média ponderada das notas com pesos diferentes (1, 2, 3 e 1 para
         * a nota dos exercícios).
         * - Dependendo da média, atribui um conceito (A, B, C, D, E) e determina o
         * status do aluno (Aprovado ou Reprovado).
         * Teste =
         * Nota 1 | Nota 2 | Nota 3 | Nota Exercicios | Média | Conceito | Resultado
         * ----------------------------------------------------------------------
         * 9.0 | 7.5 | 8.0 | 8.0 | 8.0 | B | Aprovado
         * 5.0 | 4.0 | 6.5 | 5.5 | 5.5 | D | Reprovado
         * 10.0 | 9.0 | 8.0 | 9.0 | 9.0 | A | Aprovado
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nota 1:");
        double nota1 = leitor.nextDouble();
        System.out.println("Nota 2:");
        double nota2 = leitor.nextDouble();
        System.out.println("Nota 3:");
        double nota3 = leitor.nextDouble();
        System.out.println("Nota Exercicios:");
        double notaExercicios = leitor.nextDouble();

        double media = (nota1 + nota2 * 2 + nota3 * 3 + notaExercicios) / 7;
        if (media >= 9.0) {
            System.out.println("A média de aproveitamento foi: " + media + ". Conceito: A. Aprovado");
        } else {
            if (media >= 7.5 && media < 9.0) {
                System.out.println("A média de aproveitamento foi: " + media + ". Conceito: B. Aprovado");
            } else {
                if (media >= 6.0 && media < 7.5) {
                    System.out.println("A média de aproveitamento foi: " + media + ". Conceito: C. Aprovado");
                } else {
                    if (media >= 4.0 && media < 6.0) {
                        System.out.println("A média de aproveitamento foi: " + media + ". Conceito: D. Reprovado");
                    } else {
                        System.out.println("A média de aproveitamento foi: " + media + ". Conceito: E. Reprovado");
                    }
                }
            }
        }
        leitor.close();
    }
}
