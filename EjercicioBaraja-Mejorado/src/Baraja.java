import java.util.Random;

public class Baraja {
	private Carta[] cartas;
	private Random rnd=new Random();
	
	public Baraja(){
		cartas=new Carta[40];
		
		//coloca las cartas
		int i=0;		
		for(int j=0;j<4;j++)
			for(int k=0;k<10;k++)
				cartas[i++]=new Carta(k,j);	
	}
	
	public Carta extraerCarta(){
		if(numeroExtraidas()>=40)
			return null;
		int i=0;
		
		int nrExt=rnd.nextInt(40);
		Carta aExtraer=cartas[nrExt];
				
		while(aExtraer==null){
			nrExt=rnd.nextInt(40);
			aExtraer=cartas[nrExt];
		}
		
		cartas[nrExt]=null;
		
		return aExtraer;
		
	}
	
	public int numeroExtraidas(){
		int numeroExt=0;
		for(int i=0;i<cartas.length;i++)
			if(cartas[i]==null)
				++numeroExt;
		return numeroExt;
	}

}
