
public class Isla {
	//********CAMPOS
		private char[][] isla;
		private Raton raton;
		private int[][] posicion_puente;
		private boolean en_agua=false;
		private int movimientos;
		
	//********CONSTRUCTOR
		public Isla(){
			isla=new char[10][10];
			generarIsla();
			movimientos=0;
		}
		
		public void generarIsla(){
			
			//inicializa todas las variables a 0
			for(int i=0;i<isla.length;i++)
				for(int j=0;j<isla[i].length;j++)
					isla[i][j]=' ';
			//coloca los bordes
			for(int i=0;i<isla.length;i++){
				isla[i][0]='*';
				isla[i][isla[i].length-1]='*';
				isla[0][i]='*';
				isla[isla[0].length-1][i]='*';
			}
			
			//posiciones de salida ( puentes )
			posicion_puente=new int[2][2];
			//posicion del puente 1
			posicion_puente[0][0]=5;
			posicion_puente[0][1]=isla.length-1;
			//posicion del puente 2
			posicion_puente[1][0]=isla.length-1;
			posicion_puente[1][1]=5;
			
			isla[ posicion_puente[0][0] ][ posicion_puente[0][1] ]='-';
			isla[ posicion_puente[1][0]  ][ posicion_puente[1][1] ]='-';
			
			//posición de inicio del Ratón
			
			int[] posicion_raton=new int[2];
			posicion_raton[0]=5;
			posicion_raton[1]=5;
			
			raton=new Raton(posicion_raton);
			isla[raton.getPosicion()[0]][raton.getPosicion()[1]]='r';
		}
		
		//Imprime la isla en pantalla
			public void imprimirIsla(){
				
				System.out.println();		System.out.println();		System.out.println();
				for(int i=0;i<isla.length;i++){
					System.out.println();
					for(int j=0;j<isla[i].length;j++)
						System.out.print(isla[i][j] +" ");
				}
				System.out.println();		System.out.println();		System.out.println();
				
			}
		
		//Actualizar la isla con la nueva posicion del raton
			public void actualizarIsla(int[] posicion){
				int[] posicion_raton=raton.getPosicion();
				
				//reemplazamos la posicion antigua del raton a ' '
				isla[ posicion_raton[0] ][ posicion_raton[1] ] =' ';
				//asignamos la nueva posicion al raton
				posicion_raton[0]=posicion[0];
				posicion_raton[1]=posicion[1];
				
				raton.setPosicion(posicion_raton);
				//colocamos en la isla al raton
				isla[ posicion_raton[0] ][ posicion_raton[1] ] ='r';
			}
		
		//Mover Derecha
			public boolean moverDerecha(){
				int[] posicion={raton.getPosicion()[0],raton.getPosicion()[1]+1};
				//comprueba que sea una posicion correcta en el array	
				if(comprobarPosicion(  posicion    )){
					actualizarIsla(posicion);
					return true;
				}else
					return false;
			}
		
		//Mover Izquierda
			public boolean moverIzquierda(){
					int[] posicion={raton.getPosicion()[0],raton.getPosicion()[1]-1};
				//comprueba que sea una posicion correcta en el array	
					if(comprobarPosicion(  posicion    )){
						actualizarIsla(posicion);
						return true;
					}else
						return false;
				}
		
		//Mover Arriba
			public boolean moverArriba(){
					int[] posicion={raton.getPosicion()[0]-1,raton.getPosicion()[1]};
				//comprueba que sea una posicion correcta en el array
					if(comprobarPosicion(  posicion    )){
						actualizarIsla(posicion);
						return true;
					}else
						return false;
				}
		//Mover Abajo	
			public boolean moverAbajo(){
				int[] posicion={raton.getPosicion()[0]+1,raton.getPosicion()[1]};
				
				//
				if(comprobarPosicion(  posicion    )){
					actualizarIsla(posicion);
					return true;
				}else
					return false;
			}

		//si la posición existe en el array ( es una posición correcta) devuelve true
			public boolean comprobarPosicion(int[] posicion){
				if( isla[ posicion[0] ][ posicion[1] ]=='-' 
						|| isla[ posicion[0] ][ posicion[1] ]==' ')
					return true;
				//si la la posición a comprobar en la isla es igual a '*' modifica la varibale en_agua
				else if(isla[ posicion[0] ][ posicion[1] ]=='*' ){
						en_agua=true;
						return true;
					}else		
						return false;	
			}
		//Si el raton está en la posición del puente devuelve true
		public boolean puenteEncontrado(){
			if(raton.getPosicion()[0] == posicion_puente[0][0] && raton.getPosicion()[1]==posicion_puente[0][1]
					|| raton.getPosicion()[0] == posicion_puente[1][0] && raton.getPosicion()[1]==posicion_puente[1][1])
				return true;
			else
				return false;
		}
		
		//coprueba la variable en_agua
		public boolean enAgua(){
			if(  en_agua     )
				return true;
			else
				return false;
		}
		
		//incrementa movimientos en 1
		public void incrementarMovimientos(){
			movimientos++;
		}
		public int getMovimientos(){
			return movimientos;
		}
}
