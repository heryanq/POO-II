import Exception.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest {

    public static final String PRIMEIRO = "Primeiro";
    public static final String SEGUNDO = "Segundo";
    public static final String TERCEIRO = "Terceiro";
    private Fila<String> fila;

    @Before
    public void iniciaFila() throws Exception {
        fila = new Fila<String>();
    }

    @After
    public void finalizaFila() throws Exception {
        fila = null;
    }

    @Test
    public void tamanhoDeveSerZero() throws  Exception {
        assertEquals("Tamanho atual da fila é: ",0, fila.tamanho());
    }

    @Test
    public void adicionaUmNaFila() throws Exception {
        fila.adiciona(PRIMEIRO);
        assertEquals("Tamanho atual da fila é: ",1, fila.tamanho());
    }

    @Test
    public void removeUmNaFila() throws Exception {
        fila.adiciona(PRIMEIRO);
        fila.remove();
        assertEquals("Tamanho atual da fila é: ",0, fila.tamanho());
    }

    @Test
    public void filaDeveEstarVazia() throws Exception {
        assertTrue("Fila deve estar vazia!", fila.estaVazia());
    }

    @Test
    public void filaNaoDeveEstaVazia() throws Exception {
        fila.adiciona(PRIMEIRO);
        assertFalse("Fila não deve estar vazia!", fila.estaVazia());
    }

    @Test (expected = FilaVaziaException.class)
    public void filaVaziaException() throws Exception {
        fila.remove();
    }

    @Test
    public void itemAdicionadoDeveSerRemovido() throws Exception {
        fila.adiciona(PRIMEIRO);
        assertEquals("Posição do item da fila: ", PRIMEIRO, fila.remove());
    }

    @Test
    public void TresAdicionadosDevemSerRemovidosPorOrdemDeChegada() throws Exception {

        fila.adiciona(PRIMEIRO);
        fila.adiciona(SEGUNDO);
        fila.adiciona(TERCEIRO);

        assertEquals("Posição do item da fila: ", PRIMEIRO, fila.remove());
        assertEquals("Posição do item da fila: ", SEGUNDO, fila.remove());
        assertEquals("Posição do item da fila: ", TERCEIRO, fila.remove());
    }
}