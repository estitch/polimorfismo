
public class Chiguagua extends Perro implements Libro{
	
	@Override
	public void cuidar() {
		System.out.println("Cuidar la casa");
	}
	
	@Override
	public void aprender() {
		System.out.println("Chiguagua aprende a cuidar");
	}

}
