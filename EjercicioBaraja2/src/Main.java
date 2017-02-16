import java.util.Random;
import java.util.Scanner;

public class Main {
	static byte opcion,numeroBaraja=0;
	static String id;
	static Carta carta;
	static Baraja miBaraja[]=new Baraja[3];
	static Baraja barajaActual=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		Scanner teclado=new Scanner (System.in);
		
		miBaraja[0]=null;
		miBaraja[1]=null;
		miBaraja[2]=null;

		do{
			
			try{
				System.out.println("Elige una opci�n del men�:"
						+ "\n1.Crear nueva Baraja. (M�x. 3 Barajas)"
						+ "\n2.Cambiar de Baraja"
						+ "\n3.Extraer Carta"
						+ "\n4.Rellenar Baraja"
						+ "\n5.Ver id Baraja"
						+ "\n6.Ver cartas extra�das"
						+ "\n0.Salir");
				opcion=teclado.nextByte();
			
			}catch(Exception e){
				System.out.println("Valor no v�lido.".toUpperCase());
				//limpia el buffer
				teclado.next();
				
				//Vuelve al principio del bucle sin ejecutar ninguna sentencia m�s
				continue;
			}
			
			switch(opcion){
			case 1:
							
				if(barajasCreadas()<3){
					barajaActual = miBaraja[numeroBaraja++]=new Baraja();
					
					System.out.println();
					System.out.println("***********************");
					System.out.println("Baraja creada con �xito!".toUpperCase() +" ID: " +barajaActual.getId());
					System.out.println("***********************");
					System.out.println();
					
				
				} break;
				
			case 2:
				
				if(barajasCreadas()>1){

					System.out.println();
					System.out.println("***********************");
					System.out.println("Introduce el id: ".toUpperCase());
					System.out.println("***********************");
					System.out.println();
					id=teclado.next();
					
					teclado.nextLine();
					
					boolean correcto=false;
					
					for(int i=0;i<miBaraja.length;i++)
						if( miBaraja[i]!=null && id.equals(miBaraja[i].getId())){
							correcto=true;
							barajaActual=miBaraja[i];	
						}
							
					if(correcto){

						System.out.println();
						System.out.println("***********************");
						System.out.println("Has cambiado de baraja.".toUpperCase());
						System.out.println("***********************");
						System.out.println();
					}
					else{

						System.out.println();
						System.out.println("***********************");
						System.out.println("C�digo incorrecto.".toUpperCase());
						System.out.println("***********************");
						System.out.println();	
					}
				}else{

					System.out.println();
					System.out.println("***********************");
					System.out.println("Debes crear al menos dos barajas.".toUpperCase());
					System.out.println("***********************");
					System.out.println();
				}
					
				break;
				
			case 3:
				if(barajasCreadas()>0)
					if(barajaActual.numeroExtraidas()<40){
						carta = barajaActual.extraerCarta();
						

						System.out.println();
						System.out.println("***********************");
						System.out.println( "Has extra�do: ".toUpperCase()
								+ "\n" +carta.getPalo() +" " +carta.getOcep());
						System.out.println("***********************");
						System.out.println();
					}else{

						System.out.println();
						System.out.println("***********************");
						System.out.println("Has alcanzado el n�mero m�ximo de cartas a extraer.".toUpperCase());
						System.out.println("***********************");
						System.out.println();
					}
				else{

					System.out.println();
					System.out.println("***********************");
					System.out.println("Debes crear una baraja.".toUpperCase());
					System.out.println("***********************");
					System.out.println();
				}
				
				break;
			
			case 4:
				if(barajasCreadas()>0){
					
					barajaActual.rellenarBaraja(); 
					
					System.out.println();
					System.out.println("***********************");
					System.out.println("Baraja rellenada correctamente!".toUpperCase());
					System.out.println("***********************");
					System.out.println();
				}else{

					System.out.println();
					System.out.println("***********************");
					System.out.println("Debes crear una baraja.".toUpperCase());
					System.out.println("***********************");
					System.out.println();
				}
				
				break;
			
			case 5:
				if(barajasCreadas()>0){
					System.out.println();
					System.out.println("***********************");
					System.out.println(barajaActual.getId()); 
					System.out.println("***********************");
					System.out.println();
				}else{

					System.out.println();
					System.out.println("***********************");
					System.out.println("Debes crear una baraja.".toUpperCase());
					System.out.println("***********************");
					System.out.println();
				}
				
				break;
				
			case 6: 
				if(barajasCreadas()>0){
					
					System.out.println();
					System.out.println("***********************");
					System.out.println("Has extra�do ".toUpperCase()
							 +barajaActual.numeroExtraidas() +" cartas.".toUpperCase());
					System.out.println("***********************");
					System.out.println();
				
				}else{

					System.out.println();
					System.out.println("***********************");
					System.out.println("Debes crear una baraja.".toUpperCase());
					System.out.println("***********************");
					System.out.println();
				}
				break;
						 
			case 0:

				System.out.println();
				System.out.println("***********************");
				System.out.println("Hasta luego!".toUpperCase()); 
				System.out.println("***********************");
				System.out.println();
				
				break;
				
			default:

				System.out.println();
				System.out.println("***********************");
				System.out.println("Opci�n incorrecta!".toUpperCase());
				System.out.println("***********************");
				System.out.println();
					
			}
			
		
		
		}while(opcion != 0);

		
	}
	
	static byte barajasCreadas(){
		byte barajasCreadas=0;
		
		for(int i=0;i<miBaraja.length;i++)
			if(miBaraja[i]!=null)
				barajasCreadas++;
		return barajasCreadas;
	}
	

}
