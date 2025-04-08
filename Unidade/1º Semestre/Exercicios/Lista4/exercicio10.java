import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        /*
         * Análise do problema = Todas as informações/variáveis serão utilizadas
         * Entradas = idadeM, idadeZ, idadeL
         * Saída = Nome da pessoa mais nova.
         * Processos = Comparar as idades para determinar quem tem a menor idade.
         * Teste =
         * idadeM|idadeZ|idadeL| Resultado
         * ----------------------------------------------------------------------
         * 10 |12 |15 | Marquinhos é o caçula
         * 14 |9 |13 | Zezinho é o caçula
         * 18 |20 |16 | Luluzinha é o caçula
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Idade de Marquinhos: ");
        int idadeM = leitor.nextInt();
        System.out.println("Idade de Zezinho: ");
        int idadeZ = leitor.nextInt();
        System.out.println("Idade de Luluzinha: ");
        int idadeL = leitor.nextInt();
        if (idadeM < idadeZ && idadeM < idadeL) {
            System.out.println("Marquinhos é o caçula");
        } else if (idadeZ < idadeM && idadeZ < idadeL) {
            System.out.println("Zezinho é o caçula");
        } else {
            System.out.println("Luluzinha é o caçula");
        }
        leitor.close();
    }
}
