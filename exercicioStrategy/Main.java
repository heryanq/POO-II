public class Main{
  
  public static void main(String []args){
    
    Personagem personagem1 = new Guerreiro();
    Personagem personagem2 = new Duende();
    Personagem personagem3 = new Rainha();
    Personagem personagem4 = new Rei();
    
    personagem1.empunhaArma(new Machado());
    personagem1.lutar();
    personagem1.usaArma();

    personagem2.empunhaArma(new Faca());
    personagem2.lutar();
    personagem2.usaArma();

    personagem3.empunhaArma(new ArcoeFlecha());
    personagem3.lutar();
    personagem3.usaArma();

    personagem4.empunhaArma(new Espada());
    personagem4.lutar();
    personagem4.usaArma();
    personagem4.empunhaArma(new Faca());
    personagem4.usaArma();
  }

}