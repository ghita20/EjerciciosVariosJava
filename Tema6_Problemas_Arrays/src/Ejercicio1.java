import java.util.Random;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		//instancia el vector
		int[] numero=new int[20];
		
		//se rellena con numeros aleatorios entre -10 y 10
		for(int i=0;i<numero.length;i++)
			numero[i]=-10+rnd.nextInt(21);
		
		int suma=0;
		
		//suma los valores del vector
		for(int x:numero)
			suma+=x;
		
		//calcula la media
		int media=suma/numero.length;
		System.out.println("La media es: " +media);
		
		int superiores_media=0,inferiores_media=0,iguales_media=0;
		
		//calcula si son inferiores, superiores o iguales a la media
		for(int i=0;i<numero.length;i++)
			if(numero[i]>media)
				superiores_media++;
			else if(numero[i]==media)
				iguales_media++;
			else
				inferiores_media++;
		
		//Imprimo el vector
		for(int x:numero)
			System.out.print(x +" | ");
		
		System.out.println();
		
		System.out.println("Superiores a la media: " +superiores_media +"\n"
				+ "Iguales a la media: " +iguales_media +"\n"
						+ "Inferiores a la media: "+inferiores_media);
	}

}
