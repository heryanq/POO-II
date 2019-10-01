package exercicioSingleton;

public class Copo {
	
	private static Copo pegarCopo;
	
	private Copo() {}
	
	public static Copo pegarCopo() {
		if (pegarCopo == null) {
			pegarCopo = new Copo();
			System.out.println("Use esse copo para pegar bebida.");
		}
		System.out.println("Você já pegou seu copo gratuito, use ele ou compre outro.");
		return pegarCopo();
	}
	
	public void esvaziarCopo() {
		System.out.println("Ficou ruim. *Jogando bebida fora*");
	}
	
	public void guardarCopo() {
		System.out.println("Bora pra casa pizada?\n *Guardando copo*");
	}

}
