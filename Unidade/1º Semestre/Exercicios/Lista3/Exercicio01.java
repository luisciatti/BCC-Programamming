import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
        // Analise: Todas váriaveis sendo utilizadas
        // Entradas: n1, n2
        // Saida: area 
        // Processo:(n1*n2)
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor =new Scanner(System.in);
        System.out.println("Dimensões de  um terreno: ");
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        int area = n1*n2;
        System.out.println("Área do terreno: "+area);
        leitor.close();
    }
}
