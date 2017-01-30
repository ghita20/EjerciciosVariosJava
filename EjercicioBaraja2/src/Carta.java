
public class Carta {
	//************CAMPOS
		private String ocep;
		private String palo;
	
		//************VALORES QUE PUEDE TENER UNA CARTA
			private final String[] OCEP={"OROS","COPAS","ESPADAS","BASTOS"};
			private final String[] PALO={"1","2","3","4","5","6","7","SOTA","CABALLO","REY"};
		
		//************CONSTRUCTOR
			//      int[0]= posición OCEP --- int[1]= posicion PALO
			public Carta(int[] posicion){
				ocep=OCEP[posicion[0]];
				palo=PALO[posicion[1]];
			}
			
		//************GETTERS
			public String getOcep(){
				return ocep;
			}
			
			public String getPalo(){
				return palo;
			}	
			
	
}
