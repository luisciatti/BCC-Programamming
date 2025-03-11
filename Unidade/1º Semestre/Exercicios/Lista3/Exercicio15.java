import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        ///Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma: X centena(s)  Y dezena(s) K unidade(s)  
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: numero
        // Saida: centena,dezena,unidade
        // Processo: centena = numero / 100; dezena = (numero % 100) / 10; unidade = numero % 10;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o numero(até 3 digitos): ");  
        int numero = leitor.nextInt();
        int centena = numero / 100; 
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;
        System.out.println("A numero separado é " + centena + " Centena(s), " + dezena + " Dezena(s), " + unidade + " Unidade(s) ");
        leitor.close();
    }   
    }
