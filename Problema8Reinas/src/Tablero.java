
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
		boolean valido=true;
		
		//comprobar horizontal
		for(int i=0;i<tablero[fila].length && valido;i++)
				if(tablero[fila][i]=='R')
					valido=false;
			
		//comprobar vertical
		for(int i=0;i<tablero.length && valido;i++)
				if(tablero[i][columna]=='R')
					valido=false;
				
		
		int f=fila,c=columna;		
		
		//diagonal derecha arriba
				f=fila-1;c=columna+1;
				while(f>=0 && c<tablero.length && valido){
					if(tablero[f][c]=='R')
						valido=false;
						
					f--;c++;
				}
				
		//diagonal izquierda arriba	
				f=fila;c=columna;
				while(f>=0 && c>=0 && valido){
					if(tablero[f][c]=='R')
						valido=false;
								
					f--;c--;
				}
				
				
		//diagonal izquierda abajo	
				f=fila;c=columna;
				while(f<tablero.length && c>=0 && valido){
					if(tablero[f][c]=='R')
						valido=false;
					
					f++;c--;
				}
				
				
		//diagonal derecha abajo	
				f=fila;c=columna;
				while(f<tablero.length && c<tablero.length && valido){
					if(tablero[f][c]=='R')
						valido=false;
					
					f++;c++;
				}		
		
		return valido;
		
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
