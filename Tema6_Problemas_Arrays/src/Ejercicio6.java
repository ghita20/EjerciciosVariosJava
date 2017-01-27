import java.util.Arrays;
import java.util.Random;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		float[][] matriz=new float[10][10];
		
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=(float)Math.rint((-5+rnd.nextFloat()*11) *100 )/100;
				
		System.out.println("**************Impresión de cada una de las filas**************");
		
		for(int i=0;i<matriz.length;i++){
			System.out.println("FILA NÚMERO " +i +":");
			for(int j=0;j<matriz[i].length;j++)
				System.out.print(matriz[i][j] +" | ");
			System.out.println();	
			System.out.println("****************************");	
		}
		
		System.out.println(); System.out.println();
		
		//**************Suma de cada una de las filas
		float sumaFil=0;
		
		for(int i=0;i<matriz[0].length;i++){
			sumaFil=0;
			for(int j=0;j<matriz[i].length;j++)
				sumaFil+=matriz[i][j];
			System.out.println("************** Suma de la fila "+i +" = " +(float)Math.rint(sumaFil*100)/100);
	
		}
		
		System.out.println(); System.out.println();
		
		//**************Suma de cada una de las columnas
		float sumaCol=0;
		
		for(int i=0;i<matriz[0].length;i++){
			sumaCol=0;
			for(int j=0;j<matriz.length;j++)
				sumaCol+=matriz[j][i];
			
			System.out.println("************** Suma de la columna "+i +" = " +(float)Math.rint(sumaCol*100)/100);
				
		}
		
		
		
		
		
	}

}
