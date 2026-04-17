package rows;

public class ListaEncadeada<T> {
    private NoLista<T> primeiro;
    private NoLista<T> ultimo;

    public ListaEncadeada() {
        primeiro = null;
        ultimo = null;
    }

    // Inserir no final (fila)
    public void inserirNoFinal(T valor) {
        NoLista<T> novo = new NoLista<>(valor);
        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.prox = novo;
            ultimo = novo;
        }
    }

    // Remover do início (fila)
    public T retirarDoInicio() {
        if (primeiro == null) {
            throw new FilaVaziaException("Fila vazia");
        }
        T valor = primeiro.info;
        primeiro = primeiro.prox;
        if (primeiro == null) {
            ultimo = null; // lista ficou vazia
        }
        return valor;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public T peek() {
        if (primeiro == null) {
            throw new FilaVaziaException("Fila vazia");
        }
        return primeiro.info;
    }

    public void liberar() {
        primeiro = null;
        ultimo = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> atual = primeiro;
        while (atual != null) {
            sb.append(atual.info);
            if (atual.prox != null) sb.append(", ");
            atual = atual.prox;
        }
        return sb.toString();
    }
}
