import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		Scanner teclado=new Scanner(System.in);
		byte opcion=0;
		
		Baraja miB=new Baraja();
		
		do{
			System.out.println("Elige una opción: "
					+"\n1.Extraer una carta."
					+"\n0.Salir");
			opcion=teclado.nextByte();
			
			switch(opcion){
			case 0: System.out.println("Hasta luego!"); break;
			
			case 1:
				if(miB.numeroExtraidas()<40){
					Carta extraida=miB.extraerCarta();
					extraida.imprimirDatos();
					}
				else
					System.out.println("Numero máximo de extracciones alcanzado.");
				
				break;
			
			default: System.out.println("Opcion no valida.");
			
			}
		
			
		}while(opcion!=0);
		
		
		
		
	}

}
