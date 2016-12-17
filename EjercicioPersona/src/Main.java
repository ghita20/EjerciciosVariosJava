import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String nombre;
		char sexo;
		int edad,pesoPersona;
		float altura,peso;
		
		System.out.println("Introduce el nombre de la persona: ");
		nombre=teclado.nextLine();
		
		System.out.println("Introduce la edad: ");
		edad=teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Introduce el sexo: ");
		sexo=teclado.next().charAt(0);
		
		System.out.println("Introduce el peso: ");
		peso=teclado.nextFloat();
		
		System.out.println("Introduce la altura: ");
		altura=teclado.nextFloat();
		
		teclado.nextLine();
		
		//crear 3 personas
		Persona persona1=new Persona(nombre,edad,sexo,peso,altura);
		Persona persona2=new Persona(nombre,edad,sexo);
		Persona persona3=new Persona();
		
		//introducir datos de la persona 3
		persona3.setNombre("Manolo");
		persona3.setEdad(23);
		persona3.setSexo('H');
		persona3.setAltura((float)1.90);
		persona3.setPeso((float)90.5);
		
		//Generar dni a las 3 personas
		persona1.generarDni();
		persona2.generarDni();
		persona3.generarDni();
		
		//comprobar si están en su peso ideal
		persona1.calcularIMC();
		System.out.println("     ");
		persona2.calcularIMC();
		System.out.println("     ");
		persona3.calcularIMC();
		System.out.println("     ");
		
		//comprobar si cada persona es mayor de edad
		persona1.imprimirMayorEdad(persona1.esMayorDeEdad());
		System.out.println("     ");
		persona2.imprimirMayorEdad(persona2.esMayorDeEdad());
		System.out.println("     ");
		persona3.imprimirMayorEdad(persona3.esMayorDeEdad());
		
		
		//imprimir datos completos
		System.out.println(persona1.toString());
		System.out.println("     ");
		
		System.out.println(persona2.toString());
		System.out.println("     ");
		
		System.out.println(persona3.toString());
		
		
		
	}

}
