package RelacionArrays4_1;

public class Ejercicio31 {
	
	public static void main(String[] args) {
		
		// Escribe una funci�n �ConcatenaArraysPro� a la que le pasas dos arrays de enteros y te
		// devuelve un array cuyo tama�o es la suma del tama�o de ambos y que contiene todos
		// los elementos del primero y a continuaci�n los del segundo. Esta funci�n devolver� un
		// array de enteros (int[]) el cu�l se crear� dentro de la propia funci�n.
		// Ej. de uso: 	int[] a = {1,2,3};
		// 				int[] b = {4,5,6,7,2};
		// 				int[] c;
		// 				c = ConcatenaArraysPro(a, b); 
		
		int[] ArrayA = {1,2,3};
		int[] ArrayB = {4,5,6};
		int[] ArrayC;
		
		ArrayC = ConcatenaArraysPro(ArrayA, ArrayB);
		
		Imprime(ArrayA); Imprime(ArrayB); Imprime(ArrayC);
		
	}
	
		public static int[] ConcatenaArraysPro(int[] arrayA, int[] arrayB)
		{
			int[] ArrayCC = new int[arrayA.length+arrayB.length];
			
			for(int i = 0; i<arrayA.length; i++)
			{
				ArrayCC[i] = arrayA[i];
			}
			
			for(int i = ArrayCC.length-1; i>arrayA.length-1; i--)
			{
				ArrayCC[i] = arrayB[i-arrayA.length];
			}
			
			return ArrayCC;
			
		}
		
		public static void Imprime(int[] Array)
		{
			int i;
			
			System.out.print("[ ");
			
			for (i=0;i<Array.length-1;i++){
				
				System.out.print(Array[i] + "\t ");
			} 
			
			System.out.println(Array[i] + " ]");
					
		}	

}
