
public class MatrizMultidimensonal {

	public static void main(String[] args) {
	
		int matriz [][]={{1,2,3},{4,5,6},{7,8,9}};

		for (int c=0; c <matriz.length;c++){

		System.out.print(" ( ");

		for  (int f=0;f<matriz[c].length-1;f++){

		System.out.print(matriz[c][f] +" , ");

		}

		System.out.println(matriz[c][c] + " )");

		}

		System.out.println("La suma de los datos es: " +suma (matriz));

		}

	public static int suma(int[][] m){

		int suma=0;

		for (int c=0; c <m.length;c++){

		for  (int f=0;f<m[c].length;f++){

		suma +=m[c][f];

		}

		}

		return suma;

		}
	
}
	


