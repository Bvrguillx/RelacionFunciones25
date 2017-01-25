package EjercicioVelocidad;

import java.util.Scanner;

public class FuncionVelocidad {

	public static void main(String[] args) {
		
		// Programa que pase una velocidad en Km/h a m/s. 
		// La velocidad se lee por teclado.
		
		System.out.print("Introduce la VELOCIDAD que quieres Convertir: ");
		Scanner Teclado = new Scanner(System.in);
		
		float Velocidad = Teclado.nextFloat();
		
		System.out.print(Conversion(Velocidad));

	}

	public static double Conversion(float KilometrosHora)
	
	{
	
		double Velocidad = (KilometrosHora)/3.6;
		return Velocidad;
				
	}
	
}
