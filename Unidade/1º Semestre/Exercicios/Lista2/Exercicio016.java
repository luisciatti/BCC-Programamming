import java.util.Scanner;

public class Exercicio016 {
    public static void main(String[] args) throws Exception {
        /*
         * Análise do problema: as capacidades dos formatos são processos
         * Entradas: lataQ, garrafaMlQ, garrafaLQ
         * Saída: total
         * Processos: total = lataQ * 350 + garrafaMlQ * 600 + garrafaLQ * 2000
         * Fluxograma:
         * "C:\Users\escholl\OneDrive - FURB\Documentos\FURB\IP\U2\Exe16.drawio"
         * Testes:
         * lataQ | 10 | 5 | 5 |
         * garrfaMlQ | 1 | 23 | 4 |
         * garrafaLQ | 1 | 2 | 2 |
         * total | 6100 | 19550 | 8150 |
         */

        Scanner scr = new Scanner(System.in);

        int lataQ = 0, garrafaMlQ = 0, garrafaLQ = 0, total = 0; 

        System.out.println("Insira a quantidade de latas");
        lataQ = scr.nextInt();

        System.out.println("Insira a quantidade garrafas de 600 mL");
        garrafaMlQ = scr.nextInt();

        System.out.println("Insira a quantidade garrafas de 2 L");
        garrafaLQ = scr.nextInt();

        System.out.printf("A capacidade total acumulada com as compras dos refrigerantes é de %d", total = lataQ * 350 + garrafaMlQ * 600 + garrafaLQ * 2000);

        scr.close();
    }
}
