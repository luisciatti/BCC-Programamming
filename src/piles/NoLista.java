package piles;

public class NoLista<T> {
    T info;
    NoLista<T> prox;

    public NoLista(T info) {
        this.info = info;
        this.prox = null;
    }
}
