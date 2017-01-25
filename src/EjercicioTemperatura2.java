import java.util.Scanner;

public class EjercicioTemperatura2 {

	public static void main(String[] args) {
		
		// Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
		// La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
		// F = 32 + ( 9 * C / 5)
		
		System.out.print("Introduce los grados que deseas convertir: ");
		Scanner Teclado = new Scanner(System.in);
		
		float Grados = Teclado.nextFloat();
		
		System.out.print("El Resultado en Fahrenheit es: ");
		System.out.println(Conversion(Grados));
		
	}

	public static float Conversion (float Grados)
	{
		
	float Fahrenheit = 0.0F;
	Fahrenheit = 32 + ( 9 * Grados / 5);
	return Fahrenheit;
	
	}

	}

