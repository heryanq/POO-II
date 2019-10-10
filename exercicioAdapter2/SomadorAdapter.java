package exercicioadapter;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado {
        
        private List<Integer> lista = new ArrayList<Integer>();
        private SomadorExistente somador = new SomadorExistente();
        
	public int somaVetor(int[] vetor) {
            for (int i = 0; i < vetor.length; i++)
                lista.add(vetor[i]);
            return somador.somaLista(lista);
        }
}
