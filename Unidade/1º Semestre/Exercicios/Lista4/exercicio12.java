import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = lado1,lado2,lado3
         * Saída = Mensagem indicando se os lados formam um triângulo e qual é seu tipo
         * (equilátero, isósceles ou escaleno).
         * Processos =
         * - Para ser um triângulo válido, a soma de dois lados deve ser maior que o
         * terceiro lado.
         * - Se os três lados forem iguais, o triângulo é equilátero.
         * - Se apenas dois lados forem iguais, o triângulo é isósceles.
         * - Se todos os lados forem diferentes, o triângulo é escaleno.
         * Teste =
         * lado1 | lado2 | lado3 | Resultado
         * --------------------------------------
         * 3 | 3 | 3 | É equilátero
         * 4 | 4 | 6 | É isósceles
         * 5 | 6 | 7 | É escaleno
         * 2 | 2 | 5 | Não formam um triângulo
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o comprimento do lado1: ");
        int lado1 = leitor.nextInt();
        System.out.println("Entre com o comprimento do lado2: ");
        int lado2 = leitor.nextInt();
        System.out.println("Entre com o comprimento do lado3: ");
        int lado3 = leitor.nextInt();
        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É equilatero");
            } else {
                if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    System.out.println("É isósceles");
                } else {
                    System.out.println("É escaleno");
                }
            }
        } else {
            System.out.println("Não formam  um triângulo");
        }
        leitor.close();
    }
}
