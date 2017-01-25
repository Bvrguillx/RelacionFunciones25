import java.util.Scanner;

public class FuncionRadio {

	public static void main(String[] args) {
		
		// Programa que lee por teclado el valor del radio de una circunferencia y 
		// calcula y muestra por pantalla la longitud y el área de la circunferencia. 

        // Longitud de la circunferencia = 2*PI*Radio
		// Area de la circunferencia = PI*Radio^2

		System.out.print("Introduce el valor del RADIO: ");
		
		@SuppressWarnings("resource")
		Scanner Teclado = new Scanner(System.in);
		
		double Radio = Teclado.nextDouble();
		
		System.out.print("La LONGITUD de la Circunferencia es: ");
		System.out.println(Longitud(Radio));
		System.out.print("El AREA de la circunferencia es: ");
		System.out.println(Area(Radio));
	}
	
	public static double Longitud(double Radio)
	
	{
		double Longitud = 2*(Math.PI)*Radio;
		return Longitud;
	}
	
	public static double Area(double Radio)
	{
		double Area = (Math.PI)*(Radio*Radio);
		return Area;
	}

}
