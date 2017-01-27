import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		Scanner teclado=new Scanner(System.in);
		byte opcion;
		int numero_cartas_extraidas=0;
		boolean extraida;
		int[] posicion=new int[2];
		String[] ocep={"ORO","COPAS","ESPADAS","BASTOS"};
		String[] naipe={"1","2","3","4","5","6","7","SOTA","CABALLO","REY"};
		int[][] cartas_extraidas={
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		
		do{
			System.out.print("Elige una opción:"
					+ "\n1.Extraer carta."
					+ "\n0.Abandonar el juego.");
			opcion=teclado.nextByte();
			
			if(opcion==1){
				
				do{
					
				posicion[0]=rnd.nextInt(4);
				posicion[1]=rnd.nextInt(10);
				
				extraida= cartas_extraidas[posicion[0]][posicion[1]]==1?true:false;
				
				numero_cartas_extraidas=0;
				
				for(int i=0;i<cartas_extraidas.length;i++)
					for(int j=0;j<cartas_extraidas[i].length;j++)
						numero_cartas_extraidas+=cartas_extraidas[i][j]==1?1:0;
				
				if(numero_cartas_extraidas==40)
					extraida=false;
				
				}while( extraida  );
				
				if(numero_cartas_extraidas<40){
					String[] carta_extraida={"",""};
					
					carta_extraida[0]="" +naipe[posicion[1]];
					carta_extraida[1]=ocep[posicion[0]];
					
					System.out.println();
					System.out.println("Has extraído la carta: ".toUpperCase() +carta_extraida[0] +" "  +carta_extraida[1]);
					
					cartas_extraidas[posicion[0]][posicion[1]]=1;
					
					System.out.println();
					System.out.println("*********************************");
					System.out.println("Cartas extraídas hasta el momento: " +(numero_cartas_extraidas+1));
					System.out.println("*********************************");
					
				} else
					System.out.println("Ya has extraido todas las cartas.");
				
				
			}//fin if
			
			
			System.out.println();
		
		}while(opcion==1 || opcion!=0);
		
		System.out.println("Hasta luego!");
	}

}
