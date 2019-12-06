import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> items = new ArrayList<>();
    private List<ObserverCarrinho> observers = new ArrayList<>();

    public void adicionaProduto(Produto p) {
        items.add(p);
        for(ObserverCarrinho observer: observers)
        try {
            observer.produtoAdicionado(p.getNome(), p.getValor());
        } catch (Exception e) {
        }
    }

    public int total() {
        int total = 0;
        for(Produto p: items)
            total += p.getValor();
        return total;
    }

    public void adicionaObserver(ObserverCarrinho observer) {
        observers.add(observer);
    }
}
