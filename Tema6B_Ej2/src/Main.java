import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Estadisticas est=new Estadisticas(3);
		byte opcion=1,idJugador=0;
		
		do{
			
			try{
			
				System.out.println("Introduce una opci�n"
						+ "\n1.Imprimir media de bateos."
						+ "\n2.Imprimir todos los Registros."
						+ "\n3.Imprimir Registros de un Jugador."
						+ "\n4.Imprimir n�mero de carreras."
						+ "\n0.Salir" );
				opcion=teclado.nextByte();
			
			}catch(Exception e){
				System.out.println();
				System.out.println("***********************");
				System.out.println("Valor no v�lido!");
				System.out.println("***********************");
				System.out.println();
				
				teclado.next();
				continue;
			}
			
			switch(opcion){
			case 0: 
				System.out.println();
				System.out.println("***********************");
				System.out.println("Hasta luego!"); 
				System.out.println("***********************");
				System.out.println();
			break;
			
			case 1:
				try{
					
					System.out.println("Introduce el id del jugador: ");
					idJugador=teclado.nextByte();
				
				}catch(Exception xd){
					System.out.println("Valor no v�lido!");
					teclado.next();
					
					continue;
				}
				if(idJugador>=0 && idJugador<20){

					System.out.println();
					System.out.println("***********************");
					System.out.println("La media del jugador " +idJugador +" es " +est.calcularMediaBateos(10));
					System.out.println("***********************");
					System.out.println();
				}else
					System.out.println("Id inv�lido!");
				break;
			case 2:
				est.imprimirRegistros(); break;
			case 3:
				try{
					System.out.println("Introduce el id del jugador: ");
					idJugador=teclado.nextByte();
				
				}catch(Exception xd){
					System.out.println("Valor no v�lido!");
					teclado.next();
					
					continue;
				}
				est.imprimirRegistros(idJugador); break;
			
			case 4:
				try{
					System.out.println("Introduce el id del jugador: ");
					idJugador=teclado.nextByte();
				
				}catch(Exception xd){
					System.out.println("Valor no v�lido!");
					teclado.next();
					continue;
				}
				
				if(idJugador>=0 && idJugador<20){

					System.out.println();
					System.out.println("***********************");
					System.out.println("El n�mero de carreras del jugador " +idJugador
							+" es " +est.calcularNumeroCarreras(idJugador)); 
					System.out.println("***********************");
					System.out.println();
				}else
					System.out.println("ID no v�lido!");
				break;
						
			default: 
				System.out.println("Opci�n no v�lida!");
			}
		
		}while(opcion!=0);
	}

}
