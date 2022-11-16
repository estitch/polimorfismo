
public class Pruebas {
	public static void reconocer(Libro a) {
		a.aprender();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos el objeto paki con polimorfismo de tipo
		Perro Paki = new Chiguagua();
		Perro raul = new Chiguagua();
		raul = new Pastor();
		//raul.cuidar();
		reconocer(((Libro)raul));
		//raul.cuidar();
		
		//creamos el objeto puka con polimosfismo de clase
		Chiguagua puka = new Chiguagua();
		//puka = new Pastor();
		//reconocer(puka);
		//puka.cuidar();
		//((Libro)puka).aprender();
		Caballo pony = new Caballo();
		//pony.aprender();
		
		Libro petLearn = new Chiguagua();
		//petLearn.aprender();
		//deberia tener el metodo cuidar ya que petLearn es un chiguagua
		//((Perro) petLearn).cuidar();
		petLearn = new Caballo();
		//petLearn.aprender();
		//no puede usar el metodo cuidar debido a que no tiene implementacion en caballo
		//((Perro) petLearn).cuidar();
		//reconocer(petLearn);
		Perro petLearn = new Chiguagua();
		Libro libro = new Libro();
		
		//Paki = new Caballo();
	}
}
