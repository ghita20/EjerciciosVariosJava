
public class Tablero {
	private char[][] tablero;
	
	public Tablero(){
		tablero=new char[8][8];
		
		for (int i = 0; i < tablero.length; i++) 
			for (int j = 0; j < tablero[i].length; j++) 
				tablero[i][j]=' ';
		}
	
	public void buscarSolucion(){
		int f=0,c=0,contSoluciones=0;;
		int[] posReina={0,0,0,0,0,0,0,0};
		boolean solucionEncontrada=false;
		
		while(f<tablero.length && !solucionEncontrada){
			
			while(c<tablero.length && !solucionEncontrada){
				//System.out.println("fila: " +f +" ----- columna: " +c   +".... posicionsegura: " +posicionSegura(f, c) +" valor: " +tablero[f][c]);
				if(posicionSegura(f, c)){
					tablero[f][c]='R';
					posReina[f]=c;
					if(f==tablero.length-1){
						System.out.println("\n\nSolución encontrada!!! solución numero: " +(++contSoluciones));
						imprimirTablero();
						//solucionEncontrada=true;
						
						//hago como si la solución hubiese sido incorrecta para seguir buscando soluciones
						tablero[f][c]=' ';
						posReina[f]=0;
						--f;
						tablero[f][posReina[f]]=' ';
						c=posReina[f]+1;
						posReina[f]=0;
					}
					else{
						++f;c=0;}
				}else{
					c++;
					
					
				}
			}//fin while c
			
			if(c==tablero.length && !solucionEncontrada){
				//System.out.println("vuelta atrás fila actual:" +f +"   ----col actual: "+c);
				--f;
				tablero[f][posReina[f]]=' ';
				c=posReina[f]+1;
				posReina[f]=0;
				//System.out.println("estoy en la fila: " +f +" en columna: " +c);
			}
			
			
		}
		
		
	}
	
		//fila = posicion de cada reina
	public boolean posicionSegura(int fila, int columna){
			//comprobar fila
		for (int i = 0; i < tablero[fila].length; i++) {
			if(tablero[fila][i]=='R')
				return false;
		}
			//comprobar columna
		for (int i = 0; i < tablero.length; i++) {
			if(tablero[i][columna]=='R')
				return false;
			
		}
		
			//comprobar diagonal izquierda
		int f=fila,c=columna;
		
		while(f>=0 && c>=0){
			if(tablero[f][c]=='R')
				return false;
			f--;c--;
		}
		
			//comprobar diagonal derecha
		f=fila;c=columna;
		
		while(f>=0 && c<=tablero.length-1){
			if(tablero[f][c]=='R')
				return false;
			f--;c++;
		}
		
		
		
		
		
		return true;
		
	}
	
	public void imprimirTablero(){
		for (int i = 0; i < tablero.length; i++) {
			System.out.println("\n-------------------------------");
			for (int j = 0; j < tablero[i].length; j++) 
				System.out.print(tablero[i][j] +" | ");
		}
			
		
	}
}
