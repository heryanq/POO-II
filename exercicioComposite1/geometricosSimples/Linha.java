package exerciciocomposite1.geometricosSimples;

import exerciciocomposite1.InterfaceGrafica;

public class Linha implements InterfaceGrafica {
    
    @Override
    public void desenha(){
        System.out.println("*Desenhando linha*");
    }
    
}
