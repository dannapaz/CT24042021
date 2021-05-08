package javaPracticas;

public class ArrayBidimensional {

	public static void main(String[] args) {
		//declarando e inicializando el array 2D
		int arr[][]= { {2,7,9}, {3,6,1}, {7,4,2} };
		
		//La primera posición es el array y la segunda posicion es la que esta dentro del array
		//System.out.println(arr[0][2]);
		
		//imprimir array 2d
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
