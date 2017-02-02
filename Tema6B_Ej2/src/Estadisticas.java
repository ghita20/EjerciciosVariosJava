import java.util.Random;

public class Estadisticas {
	//*************CAMPOS
		private static Random rnd=new Random();
		//------datos[0-19][](id jugador) ---- datos[][0-n](número registros)
		private Registro[][] datos; 
	
	//*************CONSTRUCTOR
		public Estadisticas(int numeroRegistrosMinimos){
			//20 jugadores --- x registros cada uno
			datos=new Registro[20][];
			
			//Hay un mínimos de registros por cada jugador
			for(int i=0;i<20;i++)
				datos[i]=new Registro[numeroRegistrosMinimos+rnd.nextInt(5)];
			
			for(int i=0;i<datos.length;i++)
				for(int j=0;j<datos[i].length;j++)
					datos[i][j]=new Registro();
		}
	
	//*******MÉTODOS
		//---Calcula la media de bateos
		public float calcularMediaBateos(int id_jugador){
			float sumaAciertos=0,sumaGolpes=0,cantidad=0;
			
			if(id_jugador>=0 && id_jugador<datos.length){
				for(int i=0;i<datos[id_jugador].length;i++){
					//---Sumo los aciertos
					sumaAciertos+= datos[id_jugador][i].getAciertos();
					//Sumo los golpes
					sumaGolpes= datos[id_jugador][i].getAciertos() 
							+ datos[id_jugador][i].getSalidas();
				}
			
			}
					
			//devuelve 0 si el id es incorrecto ---- solo devuelve dos decimales
			return (float)(Math.rint( ((sumaAciertos/sumaGolpes)*100))/100);
			
		}
		
		//---Calcular el número de carreras
		public int calcularNumeroCarreras(int id_jugador){
			int sumaCarreras=0;
			
			if(id_jugador>=0 && id_jugador<datos.length){
				for(int i=0;i<datos[id_jugador].length;i++)
					//---Sumo las carreras
					sumaCarreras+= datos[id_jugador][i].getCarreras();			
			}//fin if
			
			//---Devuelve 0 si el id es inválido
			return sumaCarreras;
		}
		
		//---Imprimir Registros de todos los jugadores Jugador
		public void imprimirRegistros(){
			
			for(int i=0;i<datos.length;i++){
				System.out.println("JUGADOR CON ID: " +i);
				System.out.println("*********");
				
				for(int j=0;j<datos[i].length;j++){
					System.out.println(" Registro número " +(j+1) +" : " +datos[i][j].getAciertos()
							+" " +datos[i][j].getCarreras() +" "
									+ datos[i][j].getSalidas());
					
				}
				
				System.out.println("*********");
				System.out.println();
				
			}
			
		}
		//---Imprimir Registros de un jugador
		public void imprimirRegistros(int id_jugador){
			
			if(id_jugador>=0 && id_jugador<datos.length){
				System.out.println("JUGADOR CON ID: " +id_jugador);
				System.out.println("*********");
				
				for(int j=0;j<datos[id_jugador].length;j++){
					System.out.println(" Registro número " +(j+1) +" : " +datos[id_jugador][j].getAciertos()
							+" " +datos[id_jugador][j].getCarreras() +" "
									+ datos[id_jugador][j].getSalidas());
				}

				System.out.println("*********");
				System.out.println();
			}else
				System.out.println("Id no válido!");
			
		}
	
	
	
}
