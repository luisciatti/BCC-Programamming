import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        //Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: peso
        // Saida:valorPrato
        // Processo: valorPrato = (peso - 0.75)*25;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);    
        System.out.println("Quantidade 350ml: ");
        double quantidade350ml = leitor.nextDouble();
        System.out.println("Quantidade 600ml: ");
        double quantidade600ml = leitor.nextDouble(); 
        System.out.println("Quantidade 2L: ");
        double quantidade2l = leitor.nextInt();
        double litros = ((quantidade350ml*0.35)+(quantidade600ml*0.6)+quantidade2l*2);
        System.out.println("Litros: "+litros);
        leitor.close();
    }
        
    }

