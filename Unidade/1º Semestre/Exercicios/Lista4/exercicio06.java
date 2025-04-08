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
            if(genero=='M'){
                System.out.println("Masculino");
            }else if(genero=='F'){
                System.out.println("Feminino");
            }else if(genero=='I'){
                System.out.println("Não informado");
            }
            else{
                System.out.println("Entrada Incorreta");
            }
        
        leitor.close();
    }
}
