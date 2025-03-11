import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        //Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos.  
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: valorCompra, valorNotas
        // Saida: qntdNotas
        // Processo:  centena = valorTroco / 100; dezena = (valorTroco % 100) / 10;unidade = valorTroco % 10;qntNotas = centena + dezena + unidade;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor da compra: ");
        int valorCompra = leitor.nextInt();
        System.out.println("informe o valor dado em dinheiro: ");
        int valorNotas = leitor.nextInt();
        int valorTroco = valorNotas - valorCompra;
        int centena = valorTroco / 100; 
        int dezena = (valorTroco % 100) / 10;
        int unidade = valorTroco % 10;
        int qntdNotas = centena + dezena + unidade;
        System.out.println("A numero de notas é " + qntdNotas);
        leitor.close();
    }
}
