import static org.junit.Assert.*;
import org.junit.Test;

public class CarrinhoDeComprasTest {

    @Test
    public void totalCarrinho() {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionaProduto(new Produto("tenis", 100));
        c.adicionaProduto(new Produto("camiseta", 50));
        c.adicionaProduto(new Produto("bermuda", 70));
        assertEquals(220, c.total());
    }

    @Test
    public void escutaAdicaoDeProduto() {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        MockObserverCarrinho mock = new MockObserverCarrinho();
        c.adicionaObserver(mock);
        c.adicionaProduto(new Produto("tenis", 100));
        mock.verificaRecebimentoProduto("tenis", 100);
    }

    @Test
    public void adicionaDoisObservers() {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        MockObserverCarrinho mockUm = new MockObserverCarrinho();
        MockObserverCarrinho mockDois = new MockObserverCarrinho();
        c.adicionaObserver(mockUm);
        c.adicionaObserver(mockDois);
        c.adicionaProduto(new Produto("tenis", 100));
        mockUm.verificaRecebimentoProduto("tenis", 100);
        mockDois.verificaRecebimentoProduto("tenis", 100);
    }

    @Test
    public void notificaMesmoComErroNoObserver() {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        MockObserverCarrinho mockUm = new MockObserverCarrinho();
        ObserverCarrinho mockDois = new MockObserverComErro();
        MockObserverCarrinho mockTres = new MockObserverCarrinho();
        c.adicionaObserver(mockUm);
        c.adicionaObserver(mockDois);
        c.adicionaObserver(mockTres);
        c.adicionaProduto(new Produto("tenis", 100));
        mockUm.verificaRecebimentoProduto("tenis", 100);
        mockTres.verificaRecebimentoProduto("tenis", 100);
    }
}