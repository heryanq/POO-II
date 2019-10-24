package exerciciocomposite1.geometricosSimples;

import exerciciocomposite1.InterfaceGrafica;

public class Retangulo implements InterfaceGrafica {
    
    @Override
    public void desenha(){
        System.out.println("*Desenhando retângulo*");
    }
    
}
