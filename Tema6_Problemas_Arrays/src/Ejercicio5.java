import java.util.Arrays;
import java.util.Random;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		
		int[] vec1,vec2;
		vec1= new int[10];
		vec2= new int[10];
		
		int[] comprobados=new int[10];
		//rellenar vector
		for(int i=0;i<vec1.length;i++){
			vec1[i]=1+rnd.nextInt(5);
			vec2[i]=1+rnd.nextInt(5);
		}
		
		for(int i=0;i<vec1.length;i++)
			System.out.print(vec1[i] +" | ");

		System.out.println();
		
		for(int i=0;i<vec2.length;i++)
			System.out.print(vec2[i] +" | ");

		System.out.println();
		//calcular ocurrencias
		int k=0;
		
		for(int i=0;i<vec1.length;i++){
			
			//ordena el array
			Arrays.sort(comprobados);
			
			//si el valor no ha sido comprobado aún
			if(Arrays.binarySearch(comprobados, vec1[i])<0){
				int ocurrencias=0;
				
				for(int j=0;j<vec2.length;j++)
					if( vec1[i] == vec2[j] )
						ocurrencias++;
				
				//añado el valor a numeros comprobados
				comprobados[k++]=vec1[i];
				System.out.println("Valor " +vec1[i] +": " +ocurrencias);
			
			}//fin if
			
		}//fin for
		
		
	}

}
