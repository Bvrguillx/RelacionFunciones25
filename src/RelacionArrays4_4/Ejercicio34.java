package RelacionArrays4_4;

public class Ejercicio34 {

	public static void main(String[] args) {
		
		// Escribe una función “BorraDeArray” a la que le pasas dos parámetros: un array de
		// enteros y una posición. La función eliminará el elemento colocado en la posición
		// indicada. Ej.: Si tenemos el array [5,7,2,8,1] y queremos eliminar la posición 1, el
		// resultado será: [5,2,8,1]. Nota: el array habrá que pasarlo por referencia; esto es
		// necesario siempre que hay que modificar el tamaño de un array

		int [] Array = {5,7,2,8,1};
		int Posicion = 0;
		
		int [] Array2 = BorraDeArray(Array, Posicion);
		
		Imprime(Array2);
		
	}
	
	public static int [] BorraDeArray ( int [] Array1 , int Pos ){
		
		int [] ArrayA = new int [Array1.length-1];
		
		for ( int i = 0 ; i<Array1.length ; i++){
			
			if (i==Pos){
				i=i-1;
			}
			
		} return ArrayA;
		
	}
	
	public static void Imprime(int[] Array)
	{
		int i;
		
		System.out.print("[ ");
		
		for (i=0;i<Array.length-1;i++){
			System.out.print(Array[i] + "\t ");
		} System.out.println(Array[i] + " ]");
		
		
	}	


}
