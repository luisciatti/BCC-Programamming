import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        //Descreva um programa que calcule o volume de uma lata de óleo. 
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: raio, altura
        // Saida:volume
        // Processo: volume = 3.14159 * (raio * raio) * altura;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Raio do barril: ");
        double raio = leitor.nextDouble();
        System.out.println("Altura do barril: ");
        double altura = leitor.nextDouble();
        double volume = 3.14159 * (raio * raio) * altura;
        System.out.println("O volume é: " + volume);   
        leitor.close();
    }
}
