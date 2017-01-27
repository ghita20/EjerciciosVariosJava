import java.util.Random;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		Scanner teclado=new Scanner(System.in);
		// datos[0] = alumno -- datos[1] = asignatura -- datos[2] = nota
		int[][][] datos=new int[10][10][1];
	
		//Rellenamos las notas con nrs aleatorios de 1-10
		for(int i=0;i<datos.length;i++)
			for(int j=0;j<datos[i].length;j++)
				for(int k=0;k<datos[i][j].length;k++)
					datos[i][j][k]=1+rnd.nextInt(10);
		
		//imprimir datos 		
		for(int i=0;i<datos.length;i++){
			System.out.println("Alumno " +i );
			for(int j=0;j<datos[i].length;j++){
				System.out.print(" --- Asignatura " +j +" : ");
				for(int k=0;k<datos[i][j].length;k++)
					System.out.print(datos[i][j][k]);
				System.out.println();
				
			}}
		
		byte opcion;
		
		do{
			System.out.println("***********************************");
			System.out.println("Cómo quieres calcular la media?"
					+ "\nPor número de alumno ( opción 1)"
					+ "\nPor número de asignatura ( opción 2 )");
			System.out.println("***********************************");
			opcion=teclado.nextByte();
			
		}while( !(opcion==1 || opcion==2) );
		
		String texto_opcion="";
		
		switch(opcion){
			case 1:
				texto_opcion=" del alumno: "; break;
			case 2:
				texto_opcion=" de asignatura: "; break;
		}
		
		byte numero;
		
		do{
			System.out.println("***********************************");
			System.out.println("Introduce el número" +texto_opcion);
			System.out.println("***********************************");
			numero=teclado.nextByte();
			
		}while(numero<0 || numero>9);
		
		int suma=0,i,media;
		switch(opcion){
			case 1: i=numero; //número del alumno
			
					for(int j=0;j<datos[i].length;j++)
						for(int k=0;k<datos[i][j].length;k++)
							suma+=datos[i][j][k];			
			 break;
			
			case 2: i=numero; //número de la asignatura
				
					for(int j=0;j<datos.length;j++)
						for(int k=0;k<datos[j][i].length;k++)
							suma+=datos[j][i][k];
			break;
			
		}
		
		media=suma/10;
		
		System.out.print("La media" +texto_opcion +" " +numero +" es " +media +" .");
		
		
		
		
		
		
		
	}

}
