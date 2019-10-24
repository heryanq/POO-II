package exerciciocomposite1.Compostos;

import exerciciocomposite1.InterfaceGrafica;
import exerciciocomposite1.Quadro;

public class Pokebola {
    
    private Quadro quadro;
    
    public Pokebola(){
        quadro = new Quadro();
    }
    
    public void visualizar(){
        quadro.desenha();
    }
    
    public void adicionaDesenho(InterfaceGrafica tD){
        quadro.addDesenho(tD);
    }
    
}
