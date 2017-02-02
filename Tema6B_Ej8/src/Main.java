import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Isla isla=new Isla();
		Scanner teclado=new Scanner(System.in);
		int opcion=1;
		
		isla.imprimirIsla();
		
		do{
			try{
				System.out.println("6.Mover a la derecha"
						+ "\n4.Mover a la izquierda"
						+ "\n8.Mover arriba"
						+ "\n2.Mover abajo"
						+ "\n9.Ver número movimientos"
						+ "\n7.Ver la Isla"
						+ "\n0.Salir");
				opcion=teclado.nextInt();
			}catch(Exception e){
				System.out.println();
				System.out.println("**********************************");
				System.out.println("Valor incorrecto!");
				System.out.println("**********************************");
				System.out.println();
				
				teclado.next();
				continue;
			}
			
			switch(opcion){
			case 6:
				isla.moverDerecha(); 
				isla.incrementarMovimientos(); 
				isla.imprimirIsla(); break;
			case 4:
				isla.moverIzquierda(); 
				isla.incrementarMovimientos();  
				isla.imprimirIsla(); break;
			case 8:
				isla.moverArriba(); 
				isla.incrementarMovimientos(); 
				isla.imprimirIsla(); break;
			case 2:
				isla.moverAbajo();
				isla.incrementarMovimientos();
				isla.imprimirIsla(); break;
			case 9:
				System.out.println();
				System.out.println("**********************************");
				System.out.println("Número de movimientos " +isla.getMovimientos());
				System.out.println("**********************************");
				System.out.println(); break;
			case 7:
				isla.imprimirIsla(); break;
			case 0:
				System.out.println("Hasta luego!"); break;
			default:
				System.out.println("Opcion incorrecta!");
			}
			
		}while(opcion!=0 && !isla.puenteEncontrado() && !isla.enAgua() && isla.getMovimientos()<10);
		
		if(isla.puenteEncontrado()){
			System.out.println();
			System.out.println("**********************************");
			System.out.println("Has encontrado el puente! \n ENHORABUENAAA!");
			System.out.println("**********************************");
			System.out.println();
			
		}
		if(isla.enAgua()){
			System.out.println();
			System.out.println("**********************************");
			System.out.println("Has caído al agua!!");
			System.out.println("**********************************");
			System.out.println();
			
		}
		if(isla.getMovimientos()==10 && !isla.puenteEncontrado()){
			System.out.println();
			System.out.println("**********************************");
			System.out.println("Has llegado al máximo de movimientos!");
			System.out.println("**********************************");
			System.out.println();
		}
		
	}

}
