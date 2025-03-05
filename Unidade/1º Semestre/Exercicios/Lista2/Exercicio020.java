import java.util.Scanner;

public class Exercicio020 {
    public static void main(String[] args) throws Exception {
        /*
         * Análise do problema: todas variavés serão utilizadas
         * Entradas: nDobras
         * Saída: nQuadrados
         * Processos: nQuadrados = nDobras * 2
         * Fluxograma:
         * "C:\Users\escholl\OneDrive - FURB\Documentos\FURB\IP\U2\Exe20.drawio"
         * Testes:
         * nDobras | 2 | 4 | 40 |
         * nQuadrados | 4 | 8 | 80 |
         */

        Scanner scr = new Scanner(System.in);

        int nDobras = 0, nQuadrados = 0;

        do {
        	System.out.println("Insira a quantidade de dobras");
        	nDobras = scr.nextInt();
		} while (nDobras % 2 != 0);
        
        System.out.printf("DOBRAS: %d\nQUADRADOS: %d", nDobras, nQuadrados = nDobras * 2);

        scr.close();
    }
}
