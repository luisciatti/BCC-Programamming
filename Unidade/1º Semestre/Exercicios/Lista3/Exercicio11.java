import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa 
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: celsius
        // Saida:fahrenheit
        // Processo: fahrenheit = (celsius * 9 / 5) + 32;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a temperatura em celsius: ");
        double celsius = leitor.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em fahrenheit é de: " + fahrenheit);
        leitor.close();
    }
}
