//Programa que permite extraer cartas de una baraja española (una carta no puede extraer dos veces) 
//hasta que se llega a 40 cartas (límite de la baraja)
import java.util.Scanner;

public class Main {

	static byte opcion;

	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baraja miBaraja=new Baraja();
		boolean extraida_correctamente=false;
		int[] posicion;
		
		menuPrincipal();
		
		while(opcion!=0 ){
			
			if(opcion==1)
				do{
					posicion=miBaraja.devolverPosicion();
					
					extraida_correctamente=false;
					
				    if(miBaraja.extraerCarta(posicion)){
				    	System.out.println("Has extraído " +miBaraja.datosCarta(posicion) );
				    	System.out.println();
				    	extraida_correctamente=true;	
				    	
				    	//compruebo si se han extraído las 40 cartas
				    } else if(miBaraja.numeroExtraidas()==40){
				    	System.out.println("Ya no puedes extraer más cartas.");
				    	extraida_correctamente=true;
				    }/*si no se han extraido las 40 cartas y al extraer la carta devuelve false significará que la carta ya habrá sido extraída
				     por tanto se repetirá el proceso con una nueva posición*/
				    	
				    
				}while( !extraida_correctamente );
				
			
			imprimirCartasExtraidas(miBaraja);
			menuPrincipal();
			
		}
		
		System.out.println("Hasta luego!");
		
		
	}
		
	static byte menuPrincipal(){
		
			System.out.print("Elige una opción:"
					+ "\n1.Extraer carta."
					+ "\n0.Abandonar el juego.");
			opcion=teclado.nextByte();
		
		
		return opcion;
		
	}
	
	static void imprimirCartasExtraidas(Baraja miBaraja){
		
		System.out.println("*********************************");
		System.out.println("Cartas extraídas hasta el momento: " +(miBaraja.numeroExtraidas()));
		System.out.println("*********************************");
		
		
	}

}
