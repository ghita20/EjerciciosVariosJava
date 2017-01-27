import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0=ORO 1=COPA 2=ESPADA 3=BASTOS
		Random rnd=new Random();
		Scanner teclado=new Scanner(System.in);
		
		byte opcion;
		String[] ocep={"ORO","COPAS","ESPADAS","BASTOS"};
		String[] naipe={"1","2","3","4","5","6","7","SOTA","CABALLO","REY"};
		
		do{
			System.out.print("Elige una opción:"
					+ "\n1.Extraer carta."
					+ "\n0.Abandonar el juego.");
			opcion=teclado.nextByte();
			
			if(opcion==1){
				int[] posicion= {rnd.nextInt(3),rnd.nextInt(9)};
				String[] carta_extraida={"",""};
				
				carta_extraida[0]="" +naipe[posicion[1]];
				carta_extraida[1]=ocep[posicion[0]];
				
				System.out.println("Has extraído la carta: " +carta_extraida[0] +" "  +carta_extraida[1]);
		
			}//fin if
			
			System.out.println();
		
		}while(opcion==1 || opcion!=0);
		
		System.out.println("Hasta luego!");
	}

}
