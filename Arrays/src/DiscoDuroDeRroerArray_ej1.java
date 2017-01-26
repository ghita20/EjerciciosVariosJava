import java.lang.reflect.Array;
import java.util.Scanner;
public class DiscoDuroDeRroerArray_ej1 {
	
	static Scanner teclado=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[10];
	
		rellenarArray(array);
		mostarValoresArray(array);
		
	}
	
	static public void rellenarArray(int array[]){
		
		for(int i=0;i<array.length;i++){
			System.out.println("Introduce el valor para la posicion " +i +": ");
			array[i]=teclado.nextInt();
			
		}
			
	}
	
	static public void mostarValoresArray(int array[]){
		for(int i:array)
			System.out.print(i +", ");
		
	}

}
