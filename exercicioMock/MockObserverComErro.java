public class MockObserverComErro implements ObserverCarrinho {

    @Override
    public void produtoAdicionado(String nome, int valor) {
        throw new RuntimeException("Problema simulado pelo mock");
    }
}
