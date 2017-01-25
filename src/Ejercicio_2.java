public class Ejercicio_2 {

	public static void main(String[] args) {
		
		int[]MiArray={1,2,3,4};
		
		int[]ArrayInvertido=ArrayInvertido(MiArray);
		
		for (int i=0;i<MiArray.length;i++){
			
			System.out.println(ArrayInvertido[i]);
		}
	}

	public static int[]ArrayInvertido(int[]MiArray)
	{
		int[]Array2 = new int [MiArray.length];
		
		for (int i=0;i<MiArray.length;i++){
			
			Array2[i]=MiArray[MiArray.length-1-i];
			
	}
		return Array2;
}
}