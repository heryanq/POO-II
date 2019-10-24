package exerciciocomposite1;

import java.util.ArrayList;
import java.util.List;

public class Quadro implements InterfaceGrafica{
    private List<InterfaceGrafica> tipoDesenhos = new ArrayList<InterfaceGrafica>();
    
    @Override
    public void desenha() {
        System.out.println("*Desenhando quadro*");
        for (InterfaceGrafica tD: tipoDesenhos)
            tD.desenha();
        System.out.println("*Desenho concluído*");
    }
    
    public void addDesenho(InterfaceGrafica tD){
        tipoDesenhos.add(tD);
    }

}