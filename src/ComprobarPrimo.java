import java.util.Scanner;

public class ComprobarPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean ComprobarPrimo(int Numero){
		
		  int Contador = 2;
		
		  boolean Primo = true;
		  
		  while ( (Primo) && (Contador != Numero) ){
		  
			  if ( Numero % Contador == 0)
		      
				  Primo = false;
		    
			  Contador++;
		  }
		  
		  return Primo;
		
	}

}
