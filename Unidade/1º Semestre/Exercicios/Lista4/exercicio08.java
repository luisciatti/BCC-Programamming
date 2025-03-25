import java.util.Scanner;

public class exercicio08 {
    /*
     * Análise do problema = Todas as informações/variáveis serão utilizadas
     * Entradas = letra
     * saida = é vogal ou não
     * Processos = caso letra for igual a "a""e""i"o"u será vogal. Caso contrario,
     * não.
     * Teste =
     * letra |a |y |u |
     * é vogal ounao |é vogal |não é vogal |é vogal|
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a letra: ");
        char letra = leitor.next().toUpperCase().charAt(0);
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }
        leitor.close();
    }
}
