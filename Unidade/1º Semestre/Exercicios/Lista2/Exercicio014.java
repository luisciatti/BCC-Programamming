import java.util.Scanner;

public class Exercicio014 {
    // Análise do problema: O código recebe um valor que o usuário possui (valorPossuido) e decompõe esse valor em notas.
    // Entradas: valorPossuido.
    // Saídas: As quantidades de notas que representam esse valor. 
    // Processo: Através de um loop, o valor é subtraído sucessivamente pelas maiores denominações de notas possíveis.
    // Teste:
    // Entrada: valorPossuido = 9.99
    // Saída :
    // Notas: 5: 1, 2: 2

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int notas[] = {0,0,0,0,0,0};
        int valorPossuido = 0;

        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("Valor Possuído: ");
                valorPossuido = leitor.nextInt();
                if (valorPossuido >= 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Insira um valor positivo.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                leitor.next(); 
            }
        }

        while (valorPossuido >= 1.00) {
            if (valorPossuido >= 100) {
                notas[0]++;
                valorPossuido -= 100;
            } else if (valorPossuido >= 50) {
                notas[1]++;
                valorPossuido -= 50;
            } else if (valorPossuido >= 20) {
                notas[2]++;
                valorPossuido -= 20;
            } else if (valorPossuido >= 10) {
                notas[3]++;
                valorPossuido -= 10;
            } else if (valorPossuido >= 5) {
                notas[4]++;
                valorPossuido -= 5;
            } else if (valorPossuido >= 2) {
                notas[5]++;
                valorPossuido -= 2;
            }
        }
        System.out.println("Notas:\n100: "+notas[0]+"\n50: "+notas[1]+"\n20: "+notas[2]+"\n10: "+notas[3]+"\n5: "+notas[4]+"\n2: "+notas[5]);
        leitor.close();
    }
}
