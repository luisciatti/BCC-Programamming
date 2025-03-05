import java.util.Scanner;

public class Exercicio017 {
    // Uma empresa tem para um funcionário os seguintes dados: o nome, o número de
    // horas trabalhadas mensais e o número de dependentes.
    // A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e
    // R$ 60,00 por dependente (valor para cálculo do salário família)
    // e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5%
    // sobre o salário trabalho para o imposto de renda.
    // Ao final informe o nome, o salário bruto e o salário líquido do funcionário.

    // Analise: O salário bruto é calculado pela soma do salário trabalho e do
    // salário família
    // Entradas: nome, horas trabalhadas, dependentes
    // Saida: nome, salário bruto, salário líquido
    // Processo: salarioLiquido = horasTrabalhadas * 10 ,00 + dependentes * 60,00.
    // salarioBruto = salarioLiquido * 0.85. salarioBruto = salarioLiquido * 0.95
    // Teste:
    // horasTrabalhadas | 1     | 10     | 250     |
    // dependentes      | 1     | 10     | 20      |
    // salarioLiquido   | 70,00 | 700,00 | 3700,00 |
    // salarioBruto     | 66.5  | 665,00 | 3515,00 |

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String nome;
        double horasTrabalhadas, dependentes, salarioLiquido, salarioBruto;

        System.out.println("Digite o nome do funcionário: ");
        nome = src.nextLine();
        System.out.println("Digite o número de horas trabalhadas mensais: ");
        horasTrabalhadas = src.nextDouble();
        System.out.println("Digite o número de dependentes: ");
        dependentes = src.nextDouble();
        src.nextLine();
        salarioLiquido = horasTrabalhadas * 10 + dependentes * 60;
        salarioBruto = salarioLiquido * 0.85;
        salarioBruto = salarioLiquido * 0.95;
        
        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Líquido: " + salarioLiquido);
        src.close();
        
    }
}
