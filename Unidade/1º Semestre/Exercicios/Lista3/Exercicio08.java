import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
        //Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: dolar
        // Saida:real
        // Processo: real = dolar * 5.65;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o quantos dolares você tem: ");
        double dolar = leitor.nextDouble();
        double real = dolar * 5.65;
        System.out.println("O valor de reais possuido é de: " + real);
        leitor.close();  
        
    }
}

