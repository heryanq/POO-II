package exerciciocomposite1;

import exerciciocomposite1.Compostos.*;
import exerciciocomposite1.geometricosSimples.*;

public class Artista {

    public static void main(String[] args) {
        
        Pokebola pokebola = new Pokebola();
        
        /// Aqui ele desenha o fundo do quadro ///
        Retangulo retanguloSuperior = new Retangulo();
        Retangulo retanguloInferior = new Retangulo();
        
        /// Aqui seria o desenho da pokebola ///
        Circulo circuloFora = new Circulo();
        Circulo circuloCentral = new Circulo();
        Linha linhaHorizontal = new Linha();
        Circulo circuloInterno = new Circulo();
        
        /// Escrita da assinatura
        Texto textoAssinatura = new Texto();
        
        /// Aqui é feita a criação dos dois quadros
        /// Sendo o quadro2 o quadro que será sobreposto
        /// E o quadro1 a pokebola
        Quadro quadro1 = new Quadro();
        Quadro quadro2 = new Quadro();
        
        // Aqui ele coloca o fundo no quadro que será sobreposto
        quadro1.addDesenho(retanguloSuperior);
        quadro1.addDesenho(retanguloInferior);
        
        /// Aqui ele desenha a pokebola
        quadro2.addDesenho(circuloFora);
        quadro2.addDesenho(circuloCentral);
        quadro2.addDesenho(linhaHorizontal);
        quadro2.addDesenho(circuloInterno);
        
        /// Sobrepõe a pokebola sob o fundo
        quadro1.addDesenho(quadro2);
        
        /// Aqui a assinatura é posta na parte traseira
        pokebola.adicionaDesenho(textoAssinatura);
        /// Aqui o quadro de nome pokebola é criado
        pokebola.adicionaDesenho(quadro1);
        
        pokebola.visualizar();
    }
    
}
