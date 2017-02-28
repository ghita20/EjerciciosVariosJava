
public class Main {
	static char[][] tab=new char[8][8];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero miT=new Tablero();
	
		/*
		for (int i = 0; i < tab.length; i++) 
			for (int j = 0; j < tab[i].length; j++) 
				tab[i][j]=' ';
		
		tab[0][0]='R';
		for (int i = 0; i < tab.length; i++) {
			System.out.println("\n   ----------------------------");
			for (int j = 0; j < tab[i].length; j++) 
				System.out.print(tab[i][j] +" | ");
		}
		*/
		
		miT.buscarSolucion();
		

	}
	public static boolean posicionSegura(int fila, int columna){
		//comprobar fila
	for (int i = 0; i < tab[fila].length; i++) {
		if(tab[fila][i]=='R')
			return false;
	}
		//comprobar columna
	for (int i = 0; i < tab.length; i++) {
		if(tab[columna][i]=='R')
			return false;
		
	}
	
		//comprobar diagonal izquierda
	int f=fila,c=columna;
	
	while(f>=0 && c>=0){
		if(tab[f][c]=='R')
			return false;
		f--;c--;
	}
	
		//comprobar diagonal derecha
	f=fila;c=columna;
	
	while(f>=0 && c<=tab.length-1){
		if(tab[f][c]=='R')
			return false;
		f--;c++;
	}
	
	
	
	
	
	return true;
	
}

}
