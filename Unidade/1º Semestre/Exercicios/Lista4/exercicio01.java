import java.util.Scanner;

public class exercicio01 {
    /*
     * Análise do problema = Todas as informações/variáveis serão utilizadas
     * Entradas = horasTrabalhadas, valorHora
     * saida = salarioTotal
     * Processos = salarioTotal = valorHora+horasTrabalhadas;
     * se(horasTrabalhadas>160) = salarioExtra =
     * (horasTrabalhadas-160)*(horasTrabalhadas/2); salarioTotal =
     * salarioExtra+salarioTotal
     * Teste =
     * horasTrabalhadas | 180 | 30 | 200 |
     * valorHora | 35 | 20 | 10 |
     * salario | 6650| 600| 6000|
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Horas trabalhadas no mês: ");
        int horasTrabalhadas = leitor.nextInt();
        System.out.println("Valor por hora: ");
        double valorHora = leitor.nextDouble();
        double salarioTotal = valorHora * horasTrabalhadas;
        if (horasTrabalhadas > 160) {
            double salarioExtra = (horasTrabalhadas - 160) * (horasTrabalhadas / 2);
            salarioTotal = salarioExtra + salarioTotal;
        }
        System.out.println("O salário total é de: " + salarioTotal);
        leitor.close();
    }
}
