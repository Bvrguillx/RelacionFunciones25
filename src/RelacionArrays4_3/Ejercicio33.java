package RelacionArrays4_3;

public class Ejercicio33 {
	

	public static void main(String[] args) {
		
		// Escribe una funci�n �InsertaEnArray� a la que le pasas tres par�metros: un array de
		// enteros, un valor entero y una posici�n. La funci�n insertar� el valor en la posici�n
		// indicada, desplazando el resto de valores para hacerle hueco. Ej.: Si tenemos el array
		// [1,2,3,4,5] y queremos insertar el valor �26� en la posici�n �2�, el resultado ser�:
		// [1,2,26,3,4,5]. Nota: el array habr� que pasarlo por referencia; esto es necesario
		// siempre que hay que modificar el tama�o de un array.
		
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


