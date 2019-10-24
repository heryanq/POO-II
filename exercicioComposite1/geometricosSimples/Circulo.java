package exerciciocomposite1.geometricosSimples;

import exerciciocomposite1.InterfaceGrafica;

public class Circulo implements InterfaceGrafica {
    
    @Override
    public void desenha(){
        System.out.println("*Desenhando círculo*");
    }
    
}
