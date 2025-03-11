import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: valorProduto
        // Saida:valorDesconto, valorFinal
        // Processo: valorDesconto = valorProduto*0.12; valorFinal = valorDesconto - valorProduto;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor do Produto: ");
        double valorProduto = leitor.nextDouble();
        double valorDesconto = valorProduto*0.12;
        double valorFinal = valorDesconto - valorProduto;
        System.out.println("O valor de desconto é de: "+valorDesconto+"\nO preço final será de: "+ valorFinal);
        leitor.close();

    }
}