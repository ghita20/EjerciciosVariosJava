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
				System.out.println("Elige una opción del menú:"
						+ "\n1.Crear nueva Baraja. (Máx. 3 Barajas)"
						+ "\n2.Cambiar de Baraja"
						+ "\n3.Extraer Carta"
						+ "\n4.Rellenar Baraja"
						+ "\n5.Ver id Baraja"
						+ "\n6.Ver cartas extraídas"
						+ "\n0.Salir");
				opcion=teclado.nextByte();
			
			}catch(Exception e){
				System.out.println("Valor no válido.".toUpperCase());
				//limpia el buffer
				teclado.next();
				
				//Vuelve al principio del bucle sin ejecutar ninguna sentencia más
				continue;
			}
			
			switch(opcion){
			case 1:
							
				if(barajasCreadas()<3){
					barajaActual = miBaraja[numeroBaraja++]=new Baraja();
					
					System.out.println();
					System.out.println("***********************");
					System.out.println("Baraja creada con éxito!".toUpperCase() +" ID: " +barajaActual.getId());
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
						System.out.println("Código incorrecto.".toUpperCase());
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
						System.out.println( "Has extraído: ".toUpperCase()
								+ "\n" +carta.getPalo() +" " +carta.getOcep());
						System.out.println("***********************");
						System.out.println();
					}else{

						System.out.println();
						System.out.println("***********************");
						System.out.println("Has alcanzado el número máximo de cartas a extraer.".toUpperCase());
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
					System.out.println("Has extraído ".toUpperCase()
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
				System.out.println("Opción incorrecta!".toUpperCase());
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
