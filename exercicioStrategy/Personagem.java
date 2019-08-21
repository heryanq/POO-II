public abstract class Personagem {

    private Arma arma;

    public abstract void lutar();

    public void usaArma(){
        this.arma.usarArma();
    }

    public Arma pegaArma(){
        return arma;
    }

    public void empunhaArma(Arma arma){
        this.arma = arma;
    }

}