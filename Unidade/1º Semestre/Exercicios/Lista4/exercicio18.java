import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = diaVencimento, diaPagamento, valorPrestacao
         * Saída = Mensagem informando o status do pagamento e o valor atualizado da
         * prestação.
         * Processos =
         * - Se o pagamento for até o dia do vencimento, há um desconto de 10%.
         * - Se o pagamento for feito até 5 dias após o vencimento, o desconto é
         * perdido.
         * - Se o pagamento atrasar mais de 5 dias, há uma multa de 2% por dia de
         * atraso.
         * Teste =
         * Dia Venc. | Dia Pag. | Valor Original | Resultado
         * -------------------------------------------------
         * 10 | 9 | 100.00 | 90.00 (desconto de 10%)
         * 10 | 10 | 200.00 | 180.00 (desconto de 10%)
         * 10 | 12 | 150.00 | 150.00 (sem desconto)
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dia do vencimento: ");
        int diaVencimento = leitor.nextInt();
        System.out.println("Dia do pagamento: ");
        int diaPagamento = leitor.nextInt();
        System.out.println("Valor da Prestação: ");
        double valorPrestação = leitor.nextInt();

        if (diaPagamento <= diaVencimento) {
            valorPrestação = valorPrestação - (valorPrestação * 0.1);
            System.out.println("O pagamento está em dia. O valor da prestação = R$" + valorPrestação);
        } else if (diaPagamento >= (diaVencimento + 5)) {
            double multa = (diaPagamento - diaVencimento) * 2;
            valorPrestação = valorPrestação + valorPrestação * (multa / 100);
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$"
                    + valorPrestação);
        } else {
            System.out.println("O desconto foi perdido. O valor da prestação = R$" + valorPrestação);
        }
        leitor.close();
    }
}
