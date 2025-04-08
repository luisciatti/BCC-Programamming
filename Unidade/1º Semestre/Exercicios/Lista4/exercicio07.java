import java.util.Scanner;

public class exercicio07 {
    /*
     * Análise do problema = Todas as informações/variáveis serão utilizadas
     * Entradas = peso
     * saida = valorPagar
     * Processos = caso peso for menor ou igual a 50, valorPagar será 0.45. Caso
     * contrario, variavel pesoExcedido será peso-50, qtAdcional será
     * pesoExcedido/20 +1 e o valorPagar é 0.45+0.45*qtAdicional
     * Teste =
     * peso |10 |100 |320 |
     * valorPagar |0.45 |2.0249 |6.974|
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com peso da carta: ");
        double peso = leitor.nextDouble();
        double valorPagar;
        if (peso <= 50) {
            valorPagar = 0.45;
        } else {
            double pesoExcedido = peso - 50;
            double qtAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * qtAdicional;
        }
        System.out.println("Custo do selo: " + valorPagar);
        leitor.close();
    }
}
