package exerciciocomposite1.geometricosSimples;

import exerciciocomposite1.InterfaceGrafica;

public class Texto implements InterfaceGrafica {
    
    @Override
    public void desenha(){
        System.out.println("*Escrevendo Texto*");
    }
    
}
