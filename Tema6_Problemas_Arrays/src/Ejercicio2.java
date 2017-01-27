import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		int[] vec1,vec2,vec3;
		
		vec1=new int[10];
		vec2=new int[10];
		vec3=new int[10];
		
		//rellena vec1
		for(int i=0;i<vec1.length;i++){
			System.out.println("Introduce el valor de la posicion " +(i+1) +" : ");
			vec1[i]=read.nextInt();
		}
		
		//rellena vec2
		for(int i=0;i<vec1.length;i++){
			System.out.println("Introduce el valor de la posicion " +(i+1) +" : ");
			vec2[i]=read.nextInt();
		}
		
		//rellena el vec3 con la suma de los anteriores
		for(int i=0;i<vec3.length;i++)
			vec3[i]=vec1[i]+vec2[i];
		
		//imprime vec3
		for(int i:vec3)
			System.out.print(i+" | ");
		
		System.out.println();
		
		Arrays.sort(vec3);
		//ordenado
		for(int i:vec3)
			System.out.print(i+" | ");
		
	}

}
