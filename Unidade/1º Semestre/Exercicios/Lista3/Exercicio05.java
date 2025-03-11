import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
       //Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: galinhas
        // Saida:valorFinal
        // Processo: valorFinal = (galinhas*4)+(galinhas*7);
        // Testes: os testes foram utilizados no enunciado     
       Scanner leitor = new Scanner(System.in);
       System.out.println("Galinhas: ");
       int galinhas = leitor.nextInt();
       double valorFinal = (galinhas*4)+(galinhas*7);
       System.out.println("O gasto total é de: R$"+valorFinal);
       leitor.close();     
    }
}
