package exerciciotemplate2;

public class inverteString extends recebeString{
    
    public String transformarString() {
        stringTratada = new StringBuilder(stringDigitada).reverse().toString();
        return stringTratada;
    }
    
    
}