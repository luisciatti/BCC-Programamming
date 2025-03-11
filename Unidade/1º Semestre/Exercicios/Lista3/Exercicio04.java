import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: nota1, nota2, nota3
        // Saida:mediaPonderada
        // Processo: (nota1*5+nota2*3+nota3*2)/3;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);
        System.out.println("1° nota: ");
        double nota1 = leitor.nextDouble();
        System.out.println("2° nota: ");
        double nota2 = leitor.nextDouble();
        System.out.println("3° nota: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1*5+nota2*3+nota3*2)/10;
        
        System.out.println("A média do aluno é de: "+media);
        leitor.close();

    }
}
