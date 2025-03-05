import java.util.Scanner;

public class Exercicio01 {
    //Leia 2 valores inteiros e imprima sua soma.

    // Analise: Tudo certo
    // Entradas: n1, n2
    // Saida:soma
    // Processo: n1 + n2
    //Teste:
    //n1    | 9 | 9 | 8 |
    //n2    | 9 | 4 | 9 |
    //soma  | 18| 13| 17|
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n1 , n2;
        System.out.println("Digite 2 valores: ");
        n1 = src.nextInt();
        n2 = src.nextInt();
        int soma = n1 + n2;
        System.out.println(soma);
        src.close();
    }
}
