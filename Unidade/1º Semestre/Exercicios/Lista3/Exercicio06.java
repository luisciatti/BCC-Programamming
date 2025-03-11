import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        //Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: peso
        // Saida:valorPrato
        // Processo: valorPrato = (peso - 0.75)*25;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Peso em KG: ");
        double peso = leitor.nextDouble();
        double valorPrato = (peso - 0.75)*25;
        System.out.println("Valor Final é de : R$"+valorPrato);
        leitor.close();
    }
}
