import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = valor,valor2,valor3,opcao
         * Saída =
         * - Os três valores na ordem solicitada pela opção escolhida.
         * Processos =
         * - O programa verifica a opção informada (1, 2 ou 3).
         * - Dependendo da opção, ele ordena os três valores de acordo com a lógica
         * interna da estrutura `switch`.
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println();

        System.out.println("Valor 1: ");
        int valor1 = leitor.nextInt();
        System.out.println("Valor 2: ");
        int valor2 = leitor.nextInt();
        System.out.println("Valor 3: ");
        int valor3 = leitor.nextInt();
        System.out.println("Opção(1a3): ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                if (valor1 > valor2 && valor1 > valor3) {
                    if (valor2 > valor3) {
                        System.out.println(valor3 + " " + valor2 + " " + valor1);
                    } else {
                        System.out.println(valor2 + " " + valor3 + " " + valor1);
                    }
                } else if (valor2 > valor1 && valor2 > valor3) {
                    if (valor1 > valor3) {
                        System.out.println(valor3 + " " + valor1 + " " + valor2);
                    } else {
                        System.out.println(valor1 + " " + valor3 + " " + valor2);
                    }
                } else {
                    if (valor1 > valor2) {
                        System.out.println(valor2 + " " + valor1 + " " + valor3);
                    } else {
                        System.out.println(valor1 + " " + valor2 + " " + valor3);
                    }
                }
                break;
            case 2:
                if (valor1 > valor2 && valor1 > valor3) {   
                    if (valor2 > valor3) {
                        System.out.println(valor1 + " " + valor2 + " " + valor3);
                    } else {
                        System.out.println(valor1 + " " + valor3 + " " + valor2);
                    }
                } else if (valor2 > valor1 && valor2 > valor3) {
                    if (valor1 > valor3) {
                        System.out.println(valor2 + " " + valor1 + " " + valor3);
                    } else {
                        System.out.println(valor2 + " " + valor3 + " " + valor1);
                    }
                } else {
                    if (valor1 > valor2) {
                        System.out.println(valor3 + " " + valor1 + " " + valor2);
                    } else {
                        System.out.println(valor3 + " " + valor2 + " " + valor1);
                    }
                }
                break;
            case 3:
                if (valor1 > valor2 && valor1 > valor3) {
                    if (valor2 > valor3) {
                        System.out.println(valor2 + " " + valor1 + " " + valor3);
                    } else {
                        System.out.println(valor3 + " " + valor1 + " " + valor2);
                    }
                } else if (valor2 > valor1 && valor2 > valor3) {
                    if (valor1 > valor3) {
                        System.out.println(valor1 + " " + valor2 + " " + valor3);
                    } else {
                        System.out.println(valor3 + " " + valor2 + " " + valor1);
                    }
                } else {
                    if (valor1 > valor2) {
                        System.out.println(valor1 + " " + valor3 + " " + valor2);
                    } else {
                        System.out.println(valor2 + " " + valor3 + " " + valor1);
                    }
                }
                break;
            default:
                break;
        }
        leitor.close();
        ;
    }
}
