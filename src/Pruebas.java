
public class Pruebas {
	public static void reconocer(Libro a) {
		a.leer();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos el objeto paki con polimorfismo de tipo
		Perro Paki = new Chiguagua();
		
		//creamos el objeto puka con polimosfismo de clase
		Chiguagua puka = new Chiguagua();
		reconocer(puka);

		
		Libro petLearn = new Chiguagua();
		//petLearn.leer();
		//deberia tener el metodo cuidar ya que petLearn es un chiguagua
		//((Perro) petLearn).cuidar();
		petLearn = new Caballo();
		//petLearn.leer();
		//no puede usar el metodo cuidar debido a que no tiene implementacion en caballo
		//((Perro) petLearn).cuidar();
		reconocer(petLearn);
		
		
		//Paki = new Caballo();
		
	}

}
