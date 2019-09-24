package exerciciofactory;

public abstract class Cadeira {
    
    public String name;
    public String assento;
    public String braco;
    public String recosto;
    public String estrutura;
    
    public void produzirCadeira(){
    System.out.println("Sua cadeira de " + name + " está sendo criada");
    }
    
    public void criaAssento(){
    System.out.println("Estamos criando o assento");
    }
    
    public void criaBraco(){
    System.out.println("O braço da sua cadeira está em processo de criação");
    }
    
    public void criaRecosto(){
    System.out.println("Quase finalizando, estamos criandos o recosto");
    }
    
    public void criaEstrutura(){
    System.out.println("Chegamos na parte final, estrutura sendo criada");
    }

}