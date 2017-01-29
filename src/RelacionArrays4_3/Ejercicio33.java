package RelacionArrays4_3;

public class Ejercicio33 {
	

	public static void main(String[] args) {
		
		// Escribe una función “InsertaEnArray” a la que le pasas tres parámetros: un array de
		// enteros, un valor entero y una posición. La función insertará el valor en la posición
		// indicada, desplazando el resto de valores para hacerle hueco. Ej.: Si tenemos el array
		// [1,2,3,4,5] y queremos insertar el valor “26” en la posición “2”, el resultado será:
		// [1,2,26,3,4,5]. Nota: el array habrá que pasarlo por referencia; esto es necesario
		// siempre que hay que modificar el tamaño de un array.
		
		int [] Array1 = {1,2,3,4,5};
		int Valor = 26;
		int Posicion = 3;
		
		int [] Array2 = InsertarEnArray(Array1, Valor, Posicion);
		
		Imprime(Array2);
		
	}
		
		public static int [] InsertarEnArray ( int[] ArrayA , int val , int ind ){
			
			int []Array1 = new int [ArrayA.length+1];
			int Contador = 0;
			for ( int i = 0; i<Array1.length; i++){
				if (i == ind){
				Array1[i] = val;
				}
				else {
					Array1[i]=ArrayA[Contador];
					Contador++;
				}
			}
			return Array1;
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


