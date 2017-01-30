import java.util.Random;

public class Baraja {
	//************CAMPOS
		public Random rnd=new Random();
		private String id_baraja;
		private Carta[] carta;
		private boolean[] extraida;
	
	
	
	//************CONSTRUCTORES
		public Baraja(){
			id_baraja=obtenerId();
			
			//rellenamos la baraja con objetos tipo Carta
			rellenarBaraja();	
		}

	//*************GETTERS
		public String getId(){
			return id_baraja;
		}
		
	//************MÉTODOS
		
		
		//rellenar baraja
		public void rellenarBaraja(){
			int[] posicion={0,0};
			
			carta=new Carta[40];
			
			for(int i=0;i<carta.length;i++){
				
				carta[i]=new Carta(posicion);	
				posicion[1]++;
				
				if( posicion[1] == 10){
					++posicion[0];
					posicion[1]=0;
				}
			
			}
			
			extraida=new boolean[40];
			
			for(int i=0;i<extraida.length;i++)
				extraida[i]=false;
				
		}
		
		//extraer Carta
		public Carta extraerCarta(){
			int posicionAleatoria;
			
			if( numeroExtraidas()<40 ){
				do{
					posicionAleatoria=rnd.nextInt(40);
					
				}while(	extraida[posicionAleatoria] );
					
				Carta cartaExtraida= carta[   posicionAleatoria   ];
				extraida[posicionAleatoria]=true;
				
				return cartaExtraida;
				
			}else
				return null;
			
		}
		
		public int numeroExtraidas(){
			int extraidas=0;
			
			for(int i=0;i<extraida.length;i++)
				if( extraida[i] )
					extraidas++;
			
			return extraidas;
		}
		
		
		//Obtener id
		private String obtenerId(){
			String id="";
			
			for(int i=0;i<9;i++){
				
				boolean opcion= rnd.nextBoolean();
				
				if(opcion)
					id+=(char)( 48+rnd.nextInt(10) );
				else
					id+=(char) ( 65+rnd.nextInt(26) );
				
			}
			
			return id;		
				
		}
		
		
}
