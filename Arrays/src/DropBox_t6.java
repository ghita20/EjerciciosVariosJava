
public class DropBox_t6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] dato=new float[20];
		float suma=0,media;
		byte superiores=0,inferiores=0,iguales=0;
		
		for(int i=0;i<dato.length;i++){
			dato[i]=(float)Math.round(Math.random()*100)/10;
			suma+=dato[i];
		}
		
		media=suma/20;
		
		for(int i=0;i<dato.length;i++){
			if(dato[i]>media)
				superiores++;
			else if( dato[i] < media )
				inferiores++;
			else
				iguales++;
			
		}
		
		for(float i:dato)
			System.out.println(i);
		
		System.out.println("La media es: " +media);
		
		System.out.println("Datos superiores a la media: " +superiores
				+"\nDatos iguales a la media: " +iguales
				+"\nDatos inferiores a la media: " +inferiores);
	}






}