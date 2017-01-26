import java.util.*;
public class FrecuenciaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rdm=new Random();
		int[] nota=new int[10000];
		int[] numero={1,2,3,4,5,6,7,8,9,10};
		int[] frecuencia=new int[10];
		
		for(int i=0;i<nota.length;i++)
			nota[i]=(int)(1+rdm.nextInt(10));
		
		
		for(int a:nota)
			System.out.print(a+", ");
		
		System.out.println();
		//posicion numero
		int j=0;
			
	
		
		
		for(int i=0;i<numero.length;i++)
			System.out.println("El numero "+numero[i] +" tiene una frecuencia de " +frecuencia[i]);
	}

}
