package piles;

public class PilhaLista<T> implements Pilha<T> {
    private ListaEncadeada<T> lista;

    public PilhaLista() {
        lista = new ListaEncadeada<>();
    }

    @Override
    public void push(T info) {
        lista.inserir(info);
    }

    @Override
    public T pop() {
        return lista.remover();
    }

    @Override
    public T peek() {
        return lista.peek();
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public void liberar() {
        lista.liberar();
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
