import java.util.Scanner;

public class exercicio06 {
    /*
     * Análise do problema = Todas as informações/variáveis serão utilizadas
     * Entradas = genero
     * saida = Masculino,feminino, não Informado ou entrada Incorreto
     * Processos = caso a letra for m será masculino, f feminino, i não informado e
     * qualquer outra letra será uma entrada incorreta
     * Teste =
     * genero | "M" | "F" | "I" | "J" |
     * saída |Masculino |Feminino|Não Informado |Entrada Incorreto
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char genero = leitor.next().toUpperCase().charAt(0);

        switch (genero) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            case 'I':
                System.out.println("Não informado");
                break;
            default:
                System.out.println("Entrada Incorreta");
                break;
        }
        leitor.close();
    }
}
