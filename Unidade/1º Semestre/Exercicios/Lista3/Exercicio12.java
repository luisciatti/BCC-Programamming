import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa 
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: nome, horasTrabalhadas, dependentes
        // Saida:salarioInicial, SalarioLiquido
        // Processo:  salarioFamilia = dependentes * 60; salarioHoraTrabalhada = horasTrabalhadas * 10; salarioInicial = salarioFamilia + salarioHoraTrabalhada;salarioBruto = (salarioHoraTrabalhada * 0.865); salarioLiquido = salarioFamilia + salarioBruto;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = leitor.next();
        System.out.println("Horas trabalhadas: ");
        double horasTrabalhadas = leitor.nextDouble();
        System.out.println("Dependentes: ");
        double dependentes = leitor.nextDouble();

        double salarioBruto = horasTrabalhadas * 10+dependentes*60;
        double salarioLiquido = salarioBruto-salarioBruto*(0.085+0.05);
        System.out.println("O funcionário "+ nome + " possui um salário bruto de " + salarioBruto + " e um salário líquido de " + salarioLiquido);  
        leitor.close();
    }
}
