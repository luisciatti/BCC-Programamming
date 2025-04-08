import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = x,y
         * Saída = O quadrante correspondente ou se o ponto está na origem (0,0).
         * Processos =
         * - Se o ponto está na origem (0,0), o quadrante é 0.
         * - Se o ponto está no primeiro quadrante (X > 0, Y > 0), o quadrante é 1.
         * - Se o ponto está no segundo quadrante (X < 0, Y > 0), o quadrante é 2.
         * - Se o ponto está no terceiro quadrante (X < 0, Y < 0), o quadrante é 3.
         * - Se o ponto está no quarto quadrante (X > 0, Y < 0), o quadrante é 4.
         * Teste =
         * X | Y | Resultado
         * -----------------------
         * 0 | 0 | Quadrante 0
         * 1 | 1 | Quadrante 1
         * -1 | 1 | Quadrante 2
         * -1 | -1 | Quadrante 3
         * 1 | -1 | Quadrante 4
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("X: ");
        int x = leitor.nextInt();
        System.out.println("Y: ");
        int y = leitor.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else {
            if (x > 0 && y > 0) {
                System.out.println("Quadrante 1");
            } else {
                if (x < 0 && y > 0) {
                    System.out.println("Quadrante 2");
                } else {
                    if (x < 0 && y < 0) {
                        System.out.println("Quadrante 3");
                    } else {
                        if (x > 0 && y < 0) {
                            System.out.println("Quadrante 4");
                        }
                    }
                }
            }
        }
        leitor.close();
    }
}
