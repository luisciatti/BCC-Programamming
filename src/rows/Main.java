package rows;


public class Main {
    public static void main(String[] args) {
        // Caso 1: Fila vazia
        FilaVetor<Integer> fila1 = new FilaVetor<>(5);
        System.out.println("Caso 1: " + fila1.estaVazia()); // true

        // Caso 2: Fila não vazia
        FilaVetor<Integer> fila2 = new FilaVetor<>(5);
        fila2.inserir(10);
        System.out.println("Caso 2: " + fila2.estaVazia()); // false

        // Caso 3: Enfileirar e desenfileirar corretamente
        FilaVetor<Integer> fila3 = new FilaVetor<>(10);
        fila3.inserir(10);
        fila3.inserir(20);
        fila3.inserir(30);
        System.out.println("Caso 3 retirar: " + fila3.retirar()); // 10
        System.out.println("Caso 3 retirar: " + fila3.retirar()); // 20
        System.out.println("Caso 3 retirar: " + fila3.retirar()); // 30
        System.out.println("Caso 3 estaVazia: " + fila3.estaVazia()); // true

        // Caso 4: Exceção FilaCheiaException
        try {
            FilaVetor<Integer> fila4 = new FilaVetor<>(3);
            fila4.inserir(10);
            fila4.inserir(20);
            fila4.inserir(30);
            fila4.inserir(40); // Deve lançar exceção
        } catch (FilaCheiaException e) {
            System.out.println("Caso 4: Exceção lançada -> " + e.getMessage());
        }

        // Caso 5: Exceção FilaVaziaException
        try {
            FilaVetor<Integer> fila5 = new FilaVetor<>(5);
            fila5.retirar(); // Deve lançar exceção
        } catch (FilaVaziaException e) {
            System.out.println("Caso 5: Exceção lançada -> " + e.getMessage());
        }

        // Caso 6: peek() retorna início da fila
        FilaVetor<Integer> fila6 = new FilaVetor<>(5);
        fila6.inserir(10);
        fila6.inserir(20);
        fila6.inserir(30);
        System.out.println("Caso 6 peek: " + fila6.peek()); // 10
        System.out.println("Caso 6 retirar: " + fila6.retirar()); // 10

        // Caso 7: liberar() limpa a fila
        FilaVetor<Integer> fila7 = new FilaVetor<>(5);
        fila7.inserir(10);
        fila7.inserir(20);
        fila7.inserir(30);
        fila7.liberar();
        System.out.println("Caso 7 estaVazia: " + fila7.estaVazia()); // true

        // Caso 8: concatenação de filas
        FilaVetor<Integer> f1 = new FilaVetor<>(5);
        f1.inserir(10);
        f1.inserir(20);
        f1.inserir(30);

        FilaVetor<Integer> f2 = new FilaVetor<>(3);
        f2.inserir(40);
        f2.inserir(50);

        FilaVetor<Integer> concatenada = f1.criarFilaConcatenada(f2);
        System.out.println("Caso 8 concatenada: " + concatenada.toString()); // 10,20,30,40,50
        System.out.println("Caso 8 fila1: " + f1.toString()); // 10,20,30
        System.out.println("Caso 8 fila2: " + f2.toString()); // 40,50
        System.out.println("Caso 8 capacidade concatenada: " + concatenada.getLimite()); // 8
        
        //Questão 4
        System.out.println("\n==========Questão 4=========\n");
     // Caso 1: Fila vazia
        FilaLista<Integer> f9 = new FilaLista<>();
        System.out.println("Caso 1: " + f9.estaVazia()); // true

        // Caso 2: Fila não vazia
        FilaLista<Integer> f10 = new FilaLista<>();
        f10.inserir(10);
        System.out.println("Caso 2: " + f10.estaVazia()); // false

        // Caso 3: Enfileirar e desenfileirar corretamente
        FilaLista<Integer> f11 = new FilaLista<>();
        f11.inserir(10);
        f11.inserir(20);
        f11.inserir(30);
        System.out.println("Caso 3 retirar: " + f11.retirar()); // 10
        System.out.println("Caso 3 retirar: " + f11.retirar()); // 20
        System.out.println("Caso 3 retirar: " + f11.retirar()); // 30
        System.out.println("Caso 3 estaVazia: " + f11.estaVazia()); // true

        // Caso 4: peek() retorna início da fila
        FilaLista<Integer> f12 = new FilaLista<>();
        f12.inserir(10);
        f12.inserir(20);
        f12.inserir(30);
        System.out.println("Caso 4 peek: " + f12.peek()); // 10
        System.out.println("Caso 4 retirar: " + f12.retirar()); // 10

        // Caso 5: liberar() limpa a fila
        FilaLista<Integer> f13 = new FilaLista<>();
        f13.inserir(10);
        f13.inserir(20);
        f13.inserir(30);
        f13.liberar();
        System.out.println("Caso 5 estaVazia: " + f13.estaVazia()); // true
    }
}
