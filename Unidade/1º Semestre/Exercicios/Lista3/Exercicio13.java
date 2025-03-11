import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: comprimento, altura
        // Saida:valor
        // Processo: valor = metros * (9 * 12.50);
        // Testes: os testes foram utilizados no enunciado
       Scanner leitor = new Scanner(System.in);
        System.out.println("Comprimento: ");
        double comprimento = leitor.nextDouble();
        System.out.println("Altura: ");
        double altura = leitor.nextDouble();
        double metros = (altura * comprimento);
        double valor = metros * (9 * 12.50);
        System.out.println("O valor é de "+ valor);    
        leitor.close(); 
    }
}
