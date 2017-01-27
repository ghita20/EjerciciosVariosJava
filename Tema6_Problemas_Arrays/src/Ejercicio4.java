import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		int[][] matriz=new int[5][5];
		
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=-100+rnd.nextInt(201);
		
		int menor=0,mayor=0;
		int[] posicion_menor,posicion_mayor;
		posicion_menor=new int[2];
		posicion_mayor=new int[2];
		
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++){
				if(i==0){
					menor=matriz[i][j];
					posicion_menor[0]=i;
					posicion_menor[1]=j;
					
					mayor=matriz[i][j];
					posicion_mayor[0]=i;
					posicion_mayor[1]=j;
					
				
				} else if(matriz[i][j]>mayor){
					mayor=matriz[i][j];
					posicion_mayor[0]=i;
					posicion_mayor[1]=j;
				} else if(matriz[i][j]<menor){
					menor=matriz[i][j];
					posicion_menor[0]=i;
					posicion_menor[1]=j;
				}
				
			}//fin for j
		
		
		for(int i=0;i<matriz.length;i++){
			System.out.print("Fila " +i +"| ");
			for(int j=0;j<matriz[i].length;j++)
				System.out.print(matriz[i][j] +" | ");
			
			System.out.println();
		}
		
		System.out.println();

		System.out.println("El valor mas grande es " +mayor +" en la fila " +posicion_mayor[0] +" columna " +posicion_mayor[1]);
		System.out.println("El valor menor es " +menor +" en la fila " +posicion_menor[0] +" columna " +posicion_menor[1]);

	}

}
