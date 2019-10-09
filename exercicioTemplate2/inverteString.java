package exerciciotemplate;

public class inverteString extends recebeString{
    
    @Override
    String transformarString() {
        return new StringBuilder(stringDigitada).reverse().toString();
    }
    
    
}