
public class Ejercicio_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] MiMatriz = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(Suma(MiMatriz));
	}

	public static int Suma(int [][] MiMatriz2)
	{
		
	int suma = 0;
		
		for( int i = 0 ; i < MiMatriz2.length ; i++)
		{
			for ( int j = 0 ; j < MiMatriz2[i].length ; j++)
			{
				suma += MiMatriz2[i][j];
			}
		}
		return suma;
	}
}
