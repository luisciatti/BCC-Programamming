package piles;

public class ListaEncadeada<T> {
    private NoLista<T> primeiro;

    public ListaEncadeada() {
        primeiro = null;
    }

    public void inserir(T valor) {
        NoLista<T> novo = new NoLista<>(valor);
        novo.prox = primeiro;
        primeiro = novo;
    }

    public T remover() {
        if (primeiro == null) throw new PilhaVaziaException("Pilha vazia");
        T valor = primeiro.info;
        primeiro = primeiro.prox;
        return valor;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public T peek() {
        if (primeiro == null) throw new PilhaVaziaException("Pilha vazia");
        return primeiro.info;
    }

    public void liberar() {
        primeiro = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> atual = primeiro;
        while (atual != null) {
            sb.append(atual.info);
            if (atual.prox != null) sb.append(",");
            atual = atual.prox;
        }
        return sb.toString();
    }
}
