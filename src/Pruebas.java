
public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos el objeto paki con polimorfismo de tipo
		Perro Paki = new Chiguagua();
		//creamos el objeto puka con polimosfismo de clase
		Chiguagua puka = new Chiguagua();
		
		Libro petLearn = new Chiguagua();
		petLearn.leer();
		//deberia tener el metodo cuidar ya que petLearn es un chiguagua
		petLearn.cuidar();
		petLearn = new Caballo();
		petLearn.leer();
		
		Paki = new Caballo();
		
	}

}
