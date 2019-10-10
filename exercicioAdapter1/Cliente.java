package exercicioadapter;

public class Cliente {

    public static void main(String args[]) {
        
        TomadaDeTresPinos tomada3pinos = new TomadaDeTresPinos();
        TomadaDeDoisPinos tomada2pinos = new TomadaDeDoisPinos();
        
        AdapterTomada adapterT1 = new AdapterTomada(tomada3pinos);
        adapterT1.ligarNaTomadaDeDoisPinos();
    }
    
}
