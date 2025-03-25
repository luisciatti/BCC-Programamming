import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = altura,massa
         * Saída =
         * - A classificação do IMC da pessoa (Magreza, Saudável, Sobrepeso, Obesidade
         * Grau I, Obesidade Grau II, ou Obesidade Grau III).
         * Processos =
         * - Calcula o IMC usando a fórmula: IMC = massa / (altura²).
         * - Com base no valor do IMC, o programa classifica a pessoa conforme as faixas
         * estabelecidas pela Organização Mundial de Saúde (OMS).
         * Teste =
         * Altura | Massa | IMC | Classificação
         * ----------------------------------------
         * 1.60 | 50 | 19.53 | Saudável
         * 1.75 | 90 | 29.39 | Sobrepeso
         * 1.70 | 120 | 41.55 | Obesidade Grau III
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Altura:");
        double altura = leitor.nextDouble();
        System.out.println("Massa:");
        double massa = leitor.nextDouble();

        double imc = massa / (Math.pow(altura, 2));
        if (imc < 18.5) {
            System.out.println("Magreza");
        } else {
            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Saudável");
            } else {
                if (imc >= 25.0 && imc <= 29.9) {
                    System.out.println("Sobrepeso");
                } else {
                    if (imc >= 30.0 && imc <= 34.9) {
                        System.out.println("Obesidade Grau I");
                    } else {
                        if (imc >= 35.0 && imc <= 39.9) {
                            System.out.println("Obesidade Grau II (severa)");
                        } else {
                            System.out.println("Obesidade Grau III (mórbida)");
                        }
                    }
                }
            }
            leitor.close();
        }
    }
}
