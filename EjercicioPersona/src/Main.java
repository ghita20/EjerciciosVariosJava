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
		persona3.setDatos();
		
		//Generar dni a las 3 personas
		persona1.generarDni();
		persona2.generarDni();
		persona3.generarDni();
		
		//comprobar si están en su peso ideal
		persona1.calcularIMC();
		persona2.calcularIMC();
		persona3.calcularIMC();
		
		//comprobar si cada persona es mayor de edad
		
		if(persona1.esMayorDeEdad())
			System.out.println("Persona 1. Es mayor de edad.");
		else
			System.out.println("Persona 1. No es mayor de edad.");
		
		if(persona2.esMayorDeEdad())
			System.out.println("Persona 2. Es mayor de edad.");
		else
			System.out.println("Persona 2. No es mayor de edad.");
		
		if(persona3.esMayorDeEdad())
			System.out.println("Persona 3. Es mayor de edad.");
		else
			System.out.println("Persona 3. No es mayor de edad.");
		
		
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
		
		
		
	}

}
