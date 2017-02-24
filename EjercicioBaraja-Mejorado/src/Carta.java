
public class Carta {
	private char naipe;
	private String ocep;
	
	private static final char[] NAIPE={'1','2','3','4','5','6','7','A','B','C'};
	private static final String[] OCEP={"OROS","COPAS","ESPADAS","BASTOS"};
	
	public Carta(int posicionNaipe,int posicionOcep){
		if(posicionNaipe>=0 && posicionNaipe<NAIPE.length)
			naipe=NAIPE[posicionNaipe];
		
		if(posicionOcep>=0 && posicionOcep<OCEP.length)
			ocep=OCEP[posicionOcep];
	}
	
	public boolean equals(Carta carta){
		naipe=carta.getNaipe();
		ocep=carta.getOcep();
		
		if(this.naipe==naipe && this.ocep==ocep)
			return true;
		
		return false;
				
	}

	public char getNaipe() {
		return naipe;
	}

	public void setNaipe(char naipe) {
		this.naipe = naipe;
	}

	public String getOcep() {
		return ocep;
	}

	public void setOcep(String ocep) {
		this.ocep = ocep;
	}
	
	public void imprimirDatos(){
		System.out.println("\n" +naipe +" de " +ocep +"\n");
	}
	
	
	

}
