//Juego del TragaBolas con la clase TragaBolas
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		//opcion del menú
		byte opcion;
		
		//variables necesarias para crear un TragaBolas
		String color;
		int maxBolas;
		
		//variable para comprobar que se ha creado un TragaBolas
		boolean tbCreado=false;
		
		//lo pongo nulo para que no de error el switch
		TragaBolas tb1=null;
		
		do{
			System.out.println("1: Crear tragaBolas.\n"
					+ "2: Darle de comer.\n"
					+ "3: Hacerle dormir.\n"
					+ "4: Ver estado.\n"
					+ "5: Trotar.\n"
					+ "0: Fin.");
			opcion=teclado.nextByte();
			
			teclado.nextLine();
			
			
			//si no se ha creado un objeto TragaBolas no dejamos que se utilice ninguna opción del
			//menú excepto la 0 que es = a "Fin"
			
			if(opcion == 1){
				//pido color y compruebo que sea un color permitido
				do{
					
					System.out.println("Introduce el color: ");
					color=teclado.nextLine();
					
					if(!TragaBolas.colorPermitido(color))
						System.out.println("Color NO PERMITIDO.");
						
						
				}while(!TragaBolas.colorPermitido(color));
				
				//pido la cantMax de bolas
				System.out.println("Intrduce la cantidad máxima de bolas: ");
				maxBolas=teclado.nextInt();
				
				//creo un nuevo objeto TB
				tb1=new TragaBolas(color, maxBolas);
				
				//Indico que se ha creado un objeto TB
				tbCreado=true;
				System.out.println("Tragabolas creado con éxtio!");
				
			} else if(tbCreado)
						switch(opcion){
							
							case 2:
								tb1.comer(); break;
							case 3:
								tb1.dormir(); break;
							case 4:
								tb1.visualizar(); break;
							case 5:
								tb1.trotar(); break;
							case 0:
								System.out.println("Gracias por jugar. Hasta luego!"); break;
			
							}//fin switch
			else if(opcion!=0)
				System.out.println("Tienes que crear antes.");

		
		}while( !(opcion==0) );//mientras la opcion sea diferente de 0
		
		System.out.println("GAME OVER.");
	}

}
