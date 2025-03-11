import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        ///Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.
        // Analise: Todas as variaveis estão sendo utilizadas
        // Entradas: tempo, distancia
        // Saida:velocidadeMedia, qtdLitros
        // Processo: velocidadeMedia = distancia / tempo; qtdLitros = distancia / 12;
        // Testes: os testes foram utilizados no enunciado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o tempo: ");
        double tempo = leitor.nextDouble();
        System.out.println("Informe a distancia: ");
        double distancia = leitor.nextDouble();
        double velocidadeMedia = distancia / tempo;
        double qtdLitros = distancia / 12;
        System.out.println("A quantidade de litros: "+ qtdLitros);
        System.out.println("A velocidade média: "+ velocidadeMedia+" KM/H");
        
        leitor.close();
    }
}
