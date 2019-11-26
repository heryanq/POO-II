import Exception.*;

import java.util.ArrayList;

public class Fila<T> {

    public static final int primeiroDaFila = 0;
    private ArrayList<T> items = new ArrayList<T>();

    public int tamanho() {
        return items.size();
    }

    public void adiciona(T item) {
        items.add(item);
    }

    public T remove() {
        if (items.isEmpty()) {
            throw  new FilaVaziaException();
        }

        return items.remove(primeiroDaFila);
    }

    public boolean estaVazia() {
        return items.isEmpty();
    }

}
