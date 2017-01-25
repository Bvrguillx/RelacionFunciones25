package RelacionArrays4_2;

public class Ejercicio32 {

	public static void main(String[] args) {
		
		// Escribe una función “CopiaArrayPro” a la que le pasas un array y te devuelve un array
		// del mismo tamaño y con los mismos datos.
		// Ej. de uso: int[] a = {1,2,3};
		// int[] b;
		// b = CopiaArrayPro(a);
		
		int[] ArrayA = {1,2,3};
		int[] ArrayB;
		ArrayB = CopiarArraysPro(ArrayA);
		
		Imprime(ArrayA); Imprime(ArrayB);
		
		}
	
	public static int [] CopiarArraysPro( int[] Array){
		
		int [] Array1 = new int[Array.length];
		
		for (int i=0; i<Array1.length; i++){
			Array1[i] = Array[i];
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
