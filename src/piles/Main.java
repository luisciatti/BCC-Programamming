package piles;

public class Main {
	
	public static void main(String[] args) {

        PilhaVetor<Integer> p1 = new PilhaVetor<>(5);
        System.out.println("Caso 1: " + p1.estaVazia()); // true

        // Caso 2: Pilha não vazia
        PilhaVetor<Integer> p2 = new PilhaVetor<>(5);
        p2.push(10);
        System.out.println("Caso 2: " + p2.estaVazia()); // false

        // Caso 3: Empilhar e desempilhar corretamente
        PilhaVetor<Integer> p3 = new PilhaVetor<>(10);
        p3.push(10);
        p3.push(20);
        p3.push(30);
        System.out.println("Caso 3: " + p3.pop()); // 30
        System.out.println("Caso 3: " + p3.pop()); // 20
        System.out.println("Caso 3: " + p3.pop()); // 10
        System.out.println("Caso 3: " + p3.estaVazia()); // true

        // Caso 4: PilhaCheiaException
        PilhaVetor<Integer> p4 = new PilhaVetor<>(3);
        try {
            p4.push(10);
            p4.push(20);
            p4.push(30);
            p4.push(40); // deve lançar exceção
        } catch (RuntimeException e) {
            System.out.println("Caso 4: " + e.getMessage());
        }

        // Caso 5: PilhaVaziaException ao desempilhar
        PilhaVetor<Integer> p5 = new PilhaVetor<>(3);
        try {
            p5.pop();
        } catch (PilhaVaziaException e) {
            System.out.println("Caso 5: " + e.getMessage());
        }

        // Caso 6: peek()
        PilhaVetor<Integer> p6 = new PilhaVetor<>(5);
        p6.push(10);
        p6.push(20);
        p6.push(30);
        System.out.println("Caso 6: topo = " + p6.peek()); // 30
        System.out.println("Caso 6: pop = " + p6.pop());   // 30

        // Caso 7: liberar()
        PilhaVetor<Integer> p7 = new PilhaVetor<>(5);
        p7.push(10);
        p7.push(20);
        p7.push(30);
        p7.liberar();
        System.out.println("Caso 7: " + p7.estaVazia()); // true

        // Caso 8: concatenar()
        PilhaVetor<Integer> p8a = new PilhaVetor<>(10);
        p8a.push(10);
        p8a.push(20);
        p8a.push(30);

        PilhaVetor<Integer> p8b = new PilhaVetor<>(10);
        p8b.push(40);
        p8b.push(50);

        p8a.concatenar(p8b);
        System.out.println("Caso 8: " + p8a.toString()); // 50,40,30,20,10
        
        
        
        System.out.println("==========================================");
        
     // Caso 2 1
        PilhaLista<Integer> p9 = new PilhaLista<>();
        System.out.println("Caso 1: " + p9.estaVazia()); // true

        // Caso 2 2
        PilhaLista<Integer> p10 = new PilhaLista<>();
        p2.push(10);
        System.out.println("Caso 2: " + p10.estaVazia()); // false

        // Caso 2 3
        PilhaLista<Integer> p11 = new PilhaLista<>();
        p11.push(10);
        p11.push(20);
        p11.push(30);
        System.out.println("Caso 3: " + p11.pop()); // 30
        System.out.println("Caso 3: " + p11.pop()); // 20
        System.out.println("Caso 3: " + p11.pop()); // 10
        System.out.println("Caso 3: " + p11.estaVazia()); // true

        // Caso 2 4
        PilhaLista<Integer> p12 = new PilhaLista<>();
        p12.push(10);
        p12.push(20);
        p12.push(30);
        System.out.println("Caso 4: topo = " + p12.peek()); // 30
        System.out.println("Caso 4: pop = " + p12.pop());   // 30

        // Caso 2 5
        PilhaLista<Integer> p13 = new PilhaLista<>();
        p13.push(10);
        p13.push(20);
        p13.push(30);
        p13.liberar();
        
        //Último 
        String exp1 = "10 + [20 / (10 - 20)]";
        String exp2 = "10 + [20 / (10 - 20})";

        System.out.println("Expressão 1 correta? " + VerificaExpressao.delimitadoresCorretos(exp1)); // true
        System.out.println("Expressão 2 correta? " + VerificaExpressao.delimitadoresCorretos(exp2)); // false
    }

}

