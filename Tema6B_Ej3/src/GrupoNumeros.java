import java.util.EmptyStackException;
import java.util.Random;


public class GrupoNumeros {
	//***********CAMPOS
		private static Random rnd=new Random();
		//grupo de números enteros
		private int[] numero;
		
	//************CONSTRUCTOR
		public GrupoNumeros(int cantidadNumeros){
			if(cantidadNumeros>0){
				numero=new int[cantidadNumeros];
				
				for(int i=0;i<numero.length;i++)
					numero[i]= rnd.nextInt(20)   ;
			}else
				//si la cantidad es menor que 0 devuelve una excepcion
				throw new EmptyStackException();
			
		}
		
	//*************MÉTODOS
		//Desviación media
		public float calcularDesviacionMedia(){
			float sumaEnteros=0;
			
			for(int i=0;i<numero.length;i++)
				sumaEnteros+=numero[i];
			
			return (float)Math.round( (sumaEnteros/(float)numero.length)*100 )/100;
	
		}
		
		//Desviación típica
			public float calcularDesviacionTipica(){
					
				float desviacionMedia=calcularDesviacionMedia(),result=0;
					
				for(int i=0;i<numero.length;i++)
					result+= (float) Math.pow(numero[i]-desviacionMedia, 2);
					
				float cociente=result/(numero.length-1);
					
				return (float)Math.round( (float)Math.sqrt(cociente) *100)/100;
			
			}
				
		//Imprimir vector
			public void imprimirVector(){
				System.out.println("VALORES DEL VECTOR");
				for(int i=0;i<numero.length;i++)
					System.out.print(numero[i] +" | ");
				
				System.out.println();
				System.out.println();
			}
		

}
