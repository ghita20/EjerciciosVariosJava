import java.util.Scanner;
import java.util.Random;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		Scanner teclado=new Scanner(System.in);
		byte fila,fila2;
		
		int[][] matriz=new int[5][5];
		
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=-10+rnd.nextInt(21);
		
		//Imprimir matriz
		for(int i=0;i<matriz.length;i++){
			System.out.println("FILA NÚMERO " +i +":");
			for(int j=0;j<matriz[i].length;j++)
				System.out.print(matriz[i][j] +" | ");
			System.out.println();	
			System.out.println("****************************");	
		}//fin for
		
		do{
			System.out.println("Introduce el número de la fila: ");
			fila=teclado.nextByte();
			
			System.out.println("Introduce el número de la otra fila: ");
			fila2=teclado.nextByte();
		
		}while( (fila<0 || fila>4) || (fila2<0 || fila2>4) );
		
		
		int[] residuo_fila_uno=new int[matriz[fila].length];
		
		//guardo el valor del vector de la fila 1
		for(int i=0;i<matriz[fila].length;i++)
			residuo_fila_uno[i]=matriz[fila][i];
		
		//relleno la fila1 por los de la fila2
		for(int i=0;i<matriz[fila].length;i++)
			matriz[fila][i]=matriz[fila2][i];
		
		//relleno la fila2 por los del residuo
		for(int i=0;i<matriz[fila2].length;i++)
			matriz[fila2][i]=residuo_fila_uno[i];
		
		
		System.out.println(); System.out.println(); System.out.println();
		
		System.out.println("DESPUÉS DE HACER EL INTERCAMBIO");
		System.out.println(); System.out.println();
		
		//Imprimir matriz
				for(int i=0;i<matriz.length;i++){
					System.out.println("FILA NÚMERO " +i +":");
					for(int j=0;j<matriz[i].length;j++)
						System.out.print(matriz[i][j] +" | ");
					System.out.println();	
					System.out.println("****************************");	
				}//fin for
				
		
		
	}

}
