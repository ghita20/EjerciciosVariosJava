
public class Tablero {
	private char[][] tablero;
	private Jugador[] jugador;
	private int turno;
	
	
	public Tablero(String nombreJugador1,String nombreJugador2){
		//Instancia los Jugadores
		jugador=new Jugador[2];
		jugador[0]=new Jugador(nombreJugador1,'o');
		jugador[1]=new Jugador(nombreJugador2,'x');
		
		//Instancia el tablero de inicio
		tablero = new char[3][3];
		for(int i=0;i<tablero.length;i++)
			for(int j=0;j<tablero[i].length;j++)
				tablero[i][j]=' ';
		
		//Turno
		turno=1;
	}
	
	//si la posición está disponible devuelve true
	public boolean colocarPosicion(int pos1,int pos2,int id_jugador){
		
		if(  tablero[pos1][pos2]==' '    ){
			tablero[pos1][pos2]= jugador[id_jugador].getSkin();
			turno++;
			return true;
		}else
			return false;
	}
	
	public boolean comprobarTablero(int id_jugador){
		boolean correcto=false;
		
		//comprobar las filas horizontales
		for(int i=0;i<tablero.length && !correcto;i++){
			int secuencia=0;
			for(int j=0;j<tablero[i].length && !correcto;j++){
				if ( tablero[i][j]==jugador[id_jugador].getSkin() )
					++secuencia;
				if(secuencia==3)
					correcto=true;
			}
			
		}
		//comprobar las filas diagonales ( si en las horizontales no hay combinacion ganadora )
		if( !correcto ){
			int secuencia=0;
		
			for(int i=0;i<tablero.length;i++)
				if ( tablero[i][i]==jugador[id_jugador].getSkin() )
					++secuencia;
				if(secuencia==3)
					correcto=true;
				
			if( ! correcto ){
				secuencia=0; int cont=tablero.length-1;
				
				for(int i=0;i<tablero.length;i++){
					
					if ( tablero[i][cont--]==jugador[id_jugador].getSkin() )
						++secuencia;
					if(secuencia==3)
						correcto=true;
				
				}				
			}
				
			
		}
		//comprobar las filas verticales
		if( !correcto ){
			for(int j=0;j<tablero[0].length && !correcto;j++){
				int secuencia=0;
				for(int i=0;i<tablero[j].length && !correcto;i++)
					if ( tablero[i][j]==jugador[id_jugador].getSkin() )
						++secuencia;
					if(secuencia==3)
						correcto=true;	
			}
		}
		
		return correcto;
	}
	
	public void imprimirTablero(){
		for(int i=0;i<tablero.length;i++){
			System.out.println();
			for(int j=0;j<tablero[i].length;j++)
				System.out.print(tablero[i][j] +" | ");		
		}
	}
	
	public int getTurno(){
		return turno;
	}
	
	public Jugador getJugador(int id_jugador){
		return jugador[id_jugador];
	}
	
	
	
}
