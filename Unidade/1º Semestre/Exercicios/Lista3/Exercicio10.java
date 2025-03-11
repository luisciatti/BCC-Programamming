import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa 
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: catetoAdjacente, catetoOposto
        // Saida:hipotenusa
        // Processo: Math.hypot (catetoAdjacente, catetoOposto);
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);

        System.out.println("Cateto oposto: ");
        double catetoOposto = leitor.nextDouble();
        System.out.println("Cateto adjacente: ");
        double catetoAdjacente = leitor.nextDouble();
        double hipotenusa = Math.hypot (catetoAdjacente, catetoOposto);

        System.out.println("O valor da hipotenusa é de: " + hipotenusa);
        
        leitor.close();   
    }
}
