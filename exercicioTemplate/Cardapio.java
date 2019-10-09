package exerciciotemplate;

abstract class Cardapio {
    
    final void prepararDrink() {
        escolherAlcoolicos();
        escolherMistura();
        escolherAdicionais();
        if (clienteQuerTrocarCopo()){
            colocarNoCopoPlastico();
        }
    }
    
    abstract void escolherAlcoolicos();
    abstract void escolherMistura();
    abstract void escolherAdicionais();
    abstract void colocarNoCopoPlastico();
    
    boolean clienteQuerTrocarCopo(){
        return true;
    }

}
