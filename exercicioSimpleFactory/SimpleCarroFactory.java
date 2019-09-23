package exerciciosimplefactory;

import exerciciosimplefactory.TiposCarros.*;

public class SimpleCarroFactory {

    public Carro createCarro(String type){
        Carro carro = null;
        if (type.equalsIgnoreCase("cruze")){
        carro = new Cruze();
        } else if (type.equalsIgnoreCase("captiva")){
            carro = new Captiva();
        } else if (type.equalsIgnoreCase("celta")){
            carro = new Celta();
        } else if (type.equalsIgnoreCase("classic")){
            carro = new Classic();
        }
        return carro;
   }
}