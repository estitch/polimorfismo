
public class Pastor extends Perro implements Libro{

	@Override
	public void cuidar() {
		System.out.println("Pastor cuidando");
		
	}
	
	@Override
	public void aprender() {
		System.out.println("Pastor aprende a cuidar");
	}


}
