package herencia;

//extendes la clase triangulo va a heredar todos los metoso y variables de clases de dos dimensiones 
public class Triangulo extends DosDimensiones {
	
	String estilo;
	
	double area() {
		return base*altura/2;//Aqui se accede a las variables establecidad en la clase padre(Subclase)
	}
	
	void mostrarEstilo() {
		System.out.println("Tringulo es: " + estilo);
	}
}
