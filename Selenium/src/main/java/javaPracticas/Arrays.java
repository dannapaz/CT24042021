package javaPracticas;

public class Arrays {

	public static void main(String[] args) {
		int intArray[];
		int[] intArray2[];
		
		//declarar un array de String
		String[] arr;
		
		//Asignando memoria para 5;
		arr= new String[5];
		
		//Inicializr el primer valor del elemento del array
		arr[0]="Cero";
		//Inicializar el segundo valor del elemento
		arr[1]="Uno";
		
		//Consecutivamente
		arr[2]="Dos";
		arr[3]="Tres";
		arr[4]="Cuatro";
		
		//System.out.println("El rpimer valor del arreglo es: " + arr[3]);
		
		//Accediendo a todos los elementos del array
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}

	}

}
