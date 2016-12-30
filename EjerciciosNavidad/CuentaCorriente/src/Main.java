/*Programa que dados dos objetos de la clase CuentaCorriente depliega un men�
que permite realizar operaciones con esos objetos*/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		CuentaCorriente cuenta_[]=new CuentaCorriente[2];
		cuenta_[0]=new CuentaCorriente("001",0);
		cuenta_[1]=new CuentaCorriente("002",0);
		
		byte opcion,numCuenta;
		double cantidad=0;
		
		do{
			System.out.println("1: Ingresar en la cuenta 001\n"
					+ "2: Ingresar en la cuenta 002\n"
					+ "3: Retirar de la cuenta 001\n"
					+ "4: Retirar de la cuenta 002\n"
					+ "5: Visualizar ambas cuentas\n"
					+ "0: Fin");
			opcion=teclado.nextByte();
			
			switch(opcion){
			//opcion para salir del men�
			case 0:
				System.out.println("Hasta luego!"); break;
			//ingresar efectivo
			case 1: case 2:
				System.out.println("Introduce la cantidad a ingresar: ");
				cantidad=teclado.nextDouble();
				
				//salto de linea del teclado para que no de error
				teclado.nextLine();
				
				//seg�n la opci�n elegida el n�mero de la cuenta ser� uno u otro
				numCuenta=opcion==1?(byte)0:(byte)1;
				
				//ingresa la cantidad a la cuenta elegida
				cuenta_[numCuenta].ingresarEfectivo(cantidad);
						
				break;
			
			case 3: case 4:
				System.out.println("Introduce la cantidad a retirar: ");
				cantidad=teclado.nextDouble();
				
				teclado.nextLine();
				
				numCuenta=opcion==3?(byte)0:(byte)1;
				
				//comprobamos el valor booleano devuelto por retirarEfectivo(cantidad)
				if(cuenta_[numCuenta].retirarEfectivo(cantidad))
					System.out.println("Cantidad retirada con �xtio.");
				else
					System.out.println("No se ha podido realizar la operaci�n.");
				
				break;
			
			case 5:
				//realiza el m�todo visualizar() a las cuentas creadas
				for(CuentaCorriente cuenta:cuenta_)
					cuenta.visualizar();
				
				break;
			
			default:
				System.out.println("Opci�n incorrecta.");
			}
			
		}while(opcion!=0);
		
		
		
	}

}
