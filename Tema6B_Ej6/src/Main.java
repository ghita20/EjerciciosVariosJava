import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Tablero tab=null;
		String jugador1,jugador2;
		int turno,pos1,pos2;
		boolean posicion_correcta=false;
		
		byte menu_principal=1,menu_juego=1;
		
		do{
			
			try{
			System.out.println("1.Nueva partida"
					+ "\n0.Salir");
			menu_principal=teclado.nextByte();
			}catch(Exception e){
				System.out.println();
				System.out.println("Valor no válido!");
				System.out.println();
				
				teclado.next();
				continue;
			}
			
			teclado.nextLine();
			
			switch(menu_principal){
			case 1:
				System.out.println("Introduce el nombre del jugador 1: ");
				jugador1=teclado.nextLine();
				
				System.out.println("Introduce el nombre del jugador 2: ");
				jugador2=teclado.nextLine();
				tab=new Tablero(jugador1, jugador2);
				
				bucle2:
				do{
					turno=tab.getTurno()%2==0?2:1;
					
					System.out.println("******************************");
					System.out.println("Turno del jugador " + turno );
					System.out.println("******************************");
					tab.imprimirTablero();
					
					System.out.println();
					//comprueba que los numeros son correctos
					boolean posicionCorrecta=true;
					try{
						do{
							
							System.out.println("Introduce posicion vertical: ");
							pos1=teclado.nextInt();
							
							System.out.println("Introduce posicion horizontal: ");
							pos2=teclado.nextInt();
							
							if(pos1<0 || pos1>2 || pos2<0 || pos2>2){
								posicionCorrecta=false;
								System.out.println();
								System.out.println("La posicion no es correcta");
								System.out.println();
							}else
								posicionCorrecta=true;
							
						}while ( !posicionCorrecta);
						
					}catch(Exception e){
						System.out.println();
						System.out.println("Valor no válido!");
						System.out.println();
						
						teclado.next();
						continue bucle2;
						
					}
					
					posicion_correcta=false;
					
					if( tab.colocarPosicion(pos1, pos2, turno-1) ){
						System.out.println("Bien!");
						posicion_correcta=true;	
					}
					else
						System.out.println("Posición ocupada!");
					
				}while( !tab.comprobarTablero(turno-1) || !posicion_correcta);
				
			
			if(tab.comprobarTablero(turno-1)){
				tab.imprimirTablero();
				System.out.println();
				System.out.println("Enhorabuena ".toUpperCase() +tab.getJugador(turno-1).getNombre().toUpperCase() +" has ganado!".toUpperCase());
				System.out.println();
			}
			
			
			}
			
			
		}while( menu_principal!=0);
		
		
		
		
		tab.colocarPosicion(0, 2, 0);
		tab.colocarPosicion(1, 2, 0);
		tab.colocarPosicion(2, 2, 0);
		tab.imprimirTablero();
		
		if( tab.comprobarTablero(0))
			System.out.println("Has ganado");
		else
			System.out.println("xd");
	}

}
