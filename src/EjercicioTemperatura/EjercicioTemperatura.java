package EjercicioTemperatura;

public class EjercicioTemperatura {

	public static void main(String[] args) {
		
		// Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
		// La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
		// F = 32 + ( 9 * C / 5)
		
		int Grados = 30;
		
		float Temperatura = Conversion(Grados);
		
		System.out.println(Temperatura);
	}

	public static float Conversion (int Grados)
	{
		
	float Fahrenheit = 0.0F;
	
	Fahrenheit = 32 + ( 9 * Grados / 5);
	
	return Fahrenheit;
	
	}
}
