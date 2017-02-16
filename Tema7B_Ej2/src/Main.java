import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		Administrativo[] administrativos;
		Maquinista[] maquinistas;
		Empleado[] otrosEmpleados;
		
		int numeroAdmin,numeroMaq,numeroOtrosEmple;
		String nombre,estudiosAcademicos;
		int edad,añosMaquina,numeroMaquinaAsignada,numeroOrdenador;
		float sueldo;
		
		do{
			System.out.println("Introduce el número de empleados que son Administrativos: ");
			numeroAdmin=teclado.nextInt();
		}while(!comprobarNumero(numeroAdmin));
		
		teclado.nextLine();
		administrativos=new Administrativo[numeroAdmin];
		
		for(int i=1;i<=administrativos.length;i++){
			
			System.out.println("Introduce el nombre del empleado " +i +" :");
			nombre=teclado.nextLine();
			
			System.out.println("Introduce la edad del empleado " +i +" :");
			edad=teclado.nextInt();
			
			teclado.nextLine();
			
			System.out.println("Introduce el sueldo del empleado " +i +" :");
			sueldo=teclado.nextFloat();
			
			teclado.nextLine();
			
			System.out.println("Introduce los estudios académicos del empleado " +i +" :");
			estudiosAcademicos=teclado.nextLine();
			
			System.out.println("Introduce el número de ordenador del empleado " +i +" :");
			numeroOrdenador=teclado.nextInt();
			
			teclado.nextLine();
			
			administrativos[i-1]=new Administrativo(nombre,
					sueldo,
					edad,
					estudiosAcademicos,
					numeroOrdenador);
			
			
		}//fin for Administrativos
		
		
		do{
			System.out.println("Introduce el número de empleados que son Maquinistas: ");
			numeroMaq=teclado.nextInt();
		}while(!comprobarNumero(numeroMaq));
		
		teclado.nextLine();
		maquinistas=new Maquinista[numeroMaq];
		
		for(int i=1;i<=maquinistas.length;i++){
			
			System.out.println("Introduce el nombre del empleado " +i +" :");
			nombre=teclado.nextLine();
			
			System.out.println("Introduce la edad del empleado " +i +" :");
			edad=teclado.nextInt();
			
			teclado.nextLine();
			
			System.out.println("Introduce el sueldo del empleado " +i +" :");
			sueldo=teclado.nextFloat();
			
			teclado.nextLine();
			
			System.out.println("Introduce el numero de Maquina del empleado " +i +" :");
			numeroMaquinaAsignada=teclado.nextInt();
			
			teclado.nextLine();
			
			System.out.println("Introduce el numero de años que de experiencia en la máquina del empleado " +i +" :");
			añosMaquina=teclado.nextInt();
			
			maquinistas[i-1]=new Maquinista(nombre,
					sueldo,
					edad,
					numeroMaquinaAsignada,
					añosMaquina);
			
			
		}//fin for Maquinistas
		
		
		
		do{
			System.out.println("Introduce el número de empleados que son de otro tipo: ");
			numeroOtrosEmple=teclado.nextInt();
		}while(!comprobarNumero(numeroOtrosEmple));
		
		teclado.nextLine();
		otrosEmpleados=new Empleado[numeroOtrosEmple];
		
		for(int i=1;i<=otrosEmpleados.length;i++){
			
			System.out.println("Introduce el nombre del empleado " +i +" :");
			nombre=teclado.nextLine();
			
			System.out.println("Introduce la edad del empleado " +i +" :");
			edad=teclado.nextInt();
			
			teclado.nextLine();
			
			System.out.println("Introduce el sueldo del empleado " +i +" :");
			sueldo=teclado.nextFloat();
			
			teclado.nextLine();
			
			otrosEmpleados[i-1]=new Empleado(nombre,
					sueldo,
					edad);
			
			
		}//fin for Administrativos
		
		System.out.println("Datos de empleados Administrativos: ");
		visualizarDatos(administrativos);
		
		System.out.println("Datos de empleados Maquinistas: ");
		visualizarDatos(maquinistas);
		
		System.out.println("Datos de Otros Empleados: ");
		visualizarDatos(otrosEmpleados);
		
		
	}
	
	static boolean comprobarNumero(int nr){
		if( nr > 0 )
			return true;
		return false;
	}
	
	static void visualizarDatos(Empleado[] a){
				
		for( int i=0;i<a.length;i++)
			a[i].visualizarTodosDatos();
	}

}
