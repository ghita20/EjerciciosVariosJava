import java.util.Random;
public class Baraja {
	//campos
	private static final Random rnd=new Random();
	private static final String[] OCEP={"ORO","COPAS","ESPADAS","BASTOS"};
	private static final String[] NAIPE={"1","2","3","4","5","6","7","SOTA","CABALLO","REY"};
	private int[][] cartas_extraidas={ //se asignará un 1 a cada carta extraída
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0}
	};
	
	
	//*********Métodos*********
	
	//Devuelve un array con la posición de la carta
	public int[] devolverPosicion(){
		int[] posicion=new int[2];
		
		posicion[0]=rnd.nextInt(4);
		posicion[1]=rnd.nextInt(10);
		
		
		return  posicion;
	}
	
	//Extraer la carta
	public boolean extraerCarta(int[] posicion){
		
		if( !haSidoExtraida(posicion) && numeroExtraidas()<40){
			cartas_extraidas[posicion[0]][posicion[1]]=1;
			return true;
		}else
			return false;
	}
	
	//Devuelve el número de cartas extraídas
	public int numeroExtraidas(){
		int numero_cartas_extraidas=0;
		
		for(int i=0;i<cartas_extraidas.length;i++)
			for(int j=0;j<cartas_extraidas[i].length;j++)
				numero_cartas_extraidas+=cartas_extraidas[i][j]==1?1:0;
		
		return numero_cartas_extraidas;
	}
	
	//comprobar si ha sido extraída la carta según la posición
	public boolean haSidoExtraida(int[] posicion){
		
		if( cartas_extraidas[posicion[0]][posicion[1]]==1 )
			return true;
		else
			return false;
		
	}
	
	
	public String datosCarta(int[] posicion){
		
		return OCEP[posicion[0]] +" "  +NAIPE[posicion[1]];
	}
	
	
	
	
	
}
