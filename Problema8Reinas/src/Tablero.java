
public class Tablero {
	private int[][] tablero;
	
	public Tablero(){
		tablero=new int[8][8];
		
		//tablero
		for(int i=0;i<tablero.length;i++)
			for(int j=0;j<tablero[i].length;j++)
				tablero[i][j]=' ';
	}
	
	public boolean colocarReina(int fila,int columna){
		
		if(comprobarPosicion(fila,columna)==false){
			
			return false;
		}
		else{
			
			tablero[fila][columna]='R';
			return true;
		}
		
	}
	
	
	public void colocarTodasLasReinas(int columna){
	/*	int f=0,c=0;
	
		if(comprobarPosicion(f,c)){
				colocarReina(f, c);
				c++;
				boolean correcto=false;
				
				do{
					if(comprobarPosicion(f,c)){
						colocarReina(f,c);
						c++;
						correcto=true;
					}else
						f++;
				}while(!correcto);
		}
	*/
		for (int i = 0; i < tablero.length; i++) {
			if(comprobarPosicion(i, columna)){
				colocarReina(i, columna);
				if(columna==tablero.length-1)
					imprimirTablero();
				else
					colocarTodasLasReinas(columna+1);
				tablero[i][columna]=' ';
			}
		}
			
		
	}
	
	public boolean comprobarPosicion(int fila, int columna){
		
		//comprobar horizontal
		for(int i=0;i<tablero[fila].length;i++)
				if(tablero[fila][i]=='R')
					return false;
			
		//comprobar vertical
		for(int i=0;i<tablero.length;i++)
				if(tablero[i][columna]=='R')
					return false;
				
		
		int f=fila,c=columna;		
		
		//diagonal derecha arriba
				f=fila-1;c=columna+1;
				while(f>=0 && c<tablero.length){
					if(tablero[f][c]=='R')
						return false;
						
					f--;c++;
				}
				
		//diagonal izquierda arriba	
				f=fila;c=columna;
				while(f>=0 && c>=0){
					if(tablero[f][c]=='R')
						return false;
								
					f--;c--;
				}
				
				
		//diagonal izquierda abajo	
				f=fila;c=columna;
				while(f<tablero.length && c>=0){
					if(tablero[f][c]=='R')
						return false;
					
					f++;c--;
				}
				
				
		//diagonal derecha abajo	
				f=fila;c=columna;
				while(f<tablero.length && c<tablero.length){
					if(tablero[f][c]=='R')
						return false;
					
					f++;c++;
				}		
		
		return true;
		
	}
	
	public void imprimirTablero(){
		System.out.println();
		for(int i=0;i<tablero.length;i++){
			System.out.println();
			for(int j=0;j<tablero[i].length;j++)
				System.out.print((char)tablero[i][j] +" | ");
			System.out.print("\n--------------------------------");
		}
	}

}
