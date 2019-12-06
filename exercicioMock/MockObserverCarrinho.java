import static org.junit.Assert.*;

public class MockObserverCarrinho implements ObserverCarrinho {

    private String nomeRecebido;
    private int valorRecebido;
    private boolean geraErro = false;

    @Override
    public void produtoAdicionado(String nome, int valor) {
        nomeRecebido = nome;
        valorRecebido = valor;
    }

    public void verificaRecebimentoProduto(String nomeEsperado, int valorEsperado) {
        assertEquals(nomeEsperado, nomeRecebido);
        assertEquals(valorEsperado, valorRecebido);
    }

    public void temQueDarErro() {
        geraErro = true;
    }
}
