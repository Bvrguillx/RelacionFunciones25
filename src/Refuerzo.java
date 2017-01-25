public class Refuerzo {

	public static void main(String[] args) {

		// Programa con tres funciones, la primera funcion creara y devolvera un
		// Array de 100 elementos rellenado con los numeros del 1 al 100 en su
		// respectiva
		// posicion. Segunda funcion le pasaremos un Array de enteros y
		// calculara la suma
		// de los elementos de Array (Parametro). Tercera funcion (Media),
		// calcula la
		// media de todo el Array y te lo devuelve

		int Array[] = ArrayRelleno();
		
		for (int i : Array)
		{	
       	System.out.print(i+" ");
		}
		
		System.out.println("");
		System.out.println(Suma(ArrayRelleno()));
		System.out.println(Media(Suma(ArrayRelleno())));
		
	}
	public static int[] ArrayRelleno() {
		int ArrayRelle[] = new int[100];
		for (int i = 0; i < ArrayRelle.length; i++) {
			ArrayRelle[i] = i + 1;
		}
		return ArrayRelle;
	}
	public static int Suma(int[]ArraySuma)
	{
		int suma = 0;
		
		for ( int i = 0 ; i<ArraySuma.length ; i++)
		{
			suma += ArraySuma[i];
		}
		return suma;
	}
	public static float Media(int Suma)
	{
    float Media = 0.0F;
    
    Media=Suma/100;
		
	return Media;	
	}
}
