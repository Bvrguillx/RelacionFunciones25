package EjercicioHipotenusa;

import java.util.Scanner;

public class HipotenusaFunciones {

	public static void main(String[] args) {

		// Programa lea la longitud de los catetos de un triángulo rectángulo y 
		// calcule la longitud de la hipotenusa según el teorema de Pitágoras.
		
		double Hipotenusa = Math.sqrt((LeerCateto1(0))+(LeerCateto2(0)));
		
		System.out.print("El valor de la HIPOTENUSA es: "+Hipotenusa);
		
	}

	public static float LeerCateto1(float Cateto){
        
		System.out.print("Introduzca el valor del 1er CATETO: ");
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		float Cateto1 = Teclado.nextFloat();
		Cateto1 = (Cateto1*Cateto1);
		return Cateto1;
		
	}
	
	public static float LeerCateto2(float Cateto){
        
		System.out.print("Introduzca el valor del 2do CATETO: ");
		Scanner Teclado = new Scanner(System.in);
		float Cateto2 = Teclado.nextFloat();
		Cateto2 = (Cateto2*Cateto2);
		return Cateto2;
		
	}
	
}
