import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: precoGasolina, valorPagamento
        // Saida:gasolinaColocada
        // Processo: gasolinaColocada = precoGasolina/valorPagamento;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Preço do Litro GASOLINA: ");
        double precoGasolina = leitor.nextDouble();
        System.out.println("Valor a pagar: ");
        double valorPagamento = leitor.nextDouble();
        double gasolinaColocada = precoGasolina/valorPagamento;
        
        System.out.println("O motorista conseguiu colocar: "+gasolinaColocada+" Litros");
        leitor.close();

    }
}
