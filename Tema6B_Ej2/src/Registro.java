import java.util.Random;

public class Registro {
	//********Campos
		private static Random rnd=new Random();
		//------Tendrá longitud 3 | [0]=Aciertos [1]=Carreras [2]=Salidas 
		private int[] dato;
		
	//********Constructores
		public Registro(){
			dato=new int[3];
			asignarDatos();
		}
		
	//Getters
		public int getAciertos(){
			return dato[0];
		}
		public int getCarreras(){
			return dato[1];
		}
		public int getSalidas(){
			return dato[2];
		}
	
	//Métodos
		//---Asigna datos aleatorios 
		public void asignarDatos(){
			for(int i=0;i<dato.length;i++)
				dato[i]= rnd.nextInt(4);
		}
		
}
