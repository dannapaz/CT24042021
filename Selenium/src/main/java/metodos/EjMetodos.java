package metodos;

public class EjMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado=suma(3,4);
		System.out.println(resultado);
		
		//Sobrecarga de metodo volver a utlizar el metodo pero con parametros diferentes
		
		int resultado2=suma(2,4);
		System.out.println(resultado2);
		
		//Comienza desde 0,1,2,3
		String car =carro(0);
		System.out.println(car);
	}
	
	public static int suma(int a, int b) {
		int c=a+b;
		return c;
	}
	
	//Sobrecarga de metodos utilizando el mismo nombre de metodo pero con diferentes parametros
	
	public static int suma(int a, int b , int c) {
		int d=a+b+c;
		return d;
	}

	public static String carro(int a) {
		//Comienza desde 0,1,2,3
		String[] cars = {"Volvo", "BMW","Ford", "Mazda"};
		return cars[a];
	}
}
