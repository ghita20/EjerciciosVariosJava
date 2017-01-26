import java.util.*;
public class DiscoDuroDeRroerArray_ej2 {
	
	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
		
		System.out.println("Introduce el tamaño deseado para el array: ");
		int longitud=teclado.nextInt();
		
		array=new int[longitud];
		
		rellenarArray(array, 0, 9);
		mostrarArray(array);
		
		System.out.println("La suma de todos los numeros del array es = " +mostrarSumaArray(array));
		
	}
	
	public static void rellenarArray(int array[],int min, int max){
		for(int i=0;i<array.length;i++)
			array[i]=generarNrAleatorio(min, max);
		
	}
	
	public static void mostrarArray(int array[]){
		for(int i: array)
			System.out.print(i +", ");
			
		System.out.println();
	}
	
	public static int mostrarSumaArray(int array[]){
		int suma=0;
		
		for(int i:array)
			suma+=i;
		
		return suma;
		
	}
	
	private static int generarNrAleatorio(int min, int max){
		Random rdm = new Random();
		
		return min+rdm.nextInt(max);
	}

}
