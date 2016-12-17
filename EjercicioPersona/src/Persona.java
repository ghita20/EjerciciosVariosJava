
import java.util.*;
public class Persona {
		
		//Declaro variables
		private Scanner teclado=new Scanner(System.in); 
		private String nombre,dni;
		private int edad;
		private char sexo;
		private float peso,altura;
		
		//Valores por defecto
		private final String NOMBRE_DEFECTO="";
		private final int EDAD_DEFECTO=0;
		private final char SEXO_DEFECTO='H';
		private final float PESO_DEFECTO=0,ALTURA_DEFECTO=0;
		
		//Constructor por defecto
		public Persona(){
			
			nombre=NOMBRE_DEFECTO;
			edad=EDAD_DEFECTO;
			sexo=SEXO_DEFECTO;
			peso=PESO_DEFECTO;
			altura=ALTURA_DEFECTO;
		}
		
		//Constructor con nombre, edad y sexo. Resto por defecto
		public Persona(String nombre, int edad, char sexo){
			this.nombre=nombre;
			this.edad=edad;
			this.sexo=sexo;
			peso=PESO_DEFECTO;
			altura=ALTURA_DEFECTO;
		}
		
		//Constructor con todos los parámetros
		public Persona(String nombre, int edad, char sexo, float peso, float altura){
			this.nombre=nombre;
			this.edad=edad;
			this.sexo=sexo;
			this.peso=peso;
			this.altura=altura;
		}
		
		//Calcular indice de masa corporal
		public String calcularIMC(){
			float pesoIdeal=peso/(float)(Math.pow(altura, 2));
			int resultado;
			final byte SOBREPESO=1,PESO_IDEAL=0,POR_DEBAJO=-1;
			
			if(peso>pesoIdeal)
				resultado = SOBREPESO;
			else if(peso == pesoIdeal)
				resultado = PESO_IDEAL;
			else
				resultado = POR_DEBAJO;
			
			switch(resultado){
			case -1:
				System.out.println(nombre +" tiene un peso por debajo del ideal."); break;
			case 0:
				System.out.println(nombre +" tiene un peso ideal.");
			case 1:
				System.out.println(nombre +" tiene sobrepeso."); break;
			
			}
			
			return "IMC calculado correctamente.";
			
		}
		
		//calcular si es mayor de edad
		public boolean esMayorDeEdad(){
			if(edad>=18)
				return true;
			else
				return false;
		}
		
		//comprobar que sexo es correcto
		public boolean comprobarSexo(char sexo){
			if(sexo=='H' || sexo=='h' || sexo=='M' || sexo=='m')
				return true;
			else{
				this.sexo=SEXO_DEFECTO;
				return false;
				}
		}
		
		//Devolver toda la información en un String
		public String toString(){
			String patron="%s tiene %d años, su dni es %s, tiene como sexo %c.\nSu peso es de %f kilogramos y su altura es %f metros.";
			String resultado=String.format(patron, nombre,edad,dni,sexo,peso,altura);
		
			return resultado;
		}
		
		//generar DNI
		public String generarDni(){
			final String LETRA_DNI="TRWAGMYFPDXBNJZSQVHLCKE";
			String dniGenerado="";
			
			Random md=new Random();
			int numeroAleatorio;
			
			for(int i=1;i<=8;i++){
				numeroAleatorio=md.nextInt(9);
				dniGenerado+="" +numeroAleatorio;
			}
			
			dniGenerado+=LETRA_DNI.charAt(Integer.parseInt(dniGenerado)%23);
			
			return dni=dniGenerado;
			
		}
		
		//introducir datos persona
		public String setDatos(){
			String nombre; char sexo; int edad; float peso; float altura;
			System.out.println("Introduce el nombre de la persona: ");
			this.nombre=nombre=teclado.nextLine();
			
			System.out.println("Introduce la edad: ");
			this.edad=edad=teclado.nextInt();
			teclado.nextLine();
			
			System.out.println("Introduce el sexo: ");
			this.sexo=sexo=teclado.next().charAt(0);
			
			System.out.println("Introduce el peso: ");
			this.peso=peso=teclado.nextFloat();
			
			System.out.println("Introduce la altura: ");
			this.altura=altura=teclado.nextFloat();
			
			teclado.nextLine();
			
			return "Realizado correctamente.";
			
		}
		
		
		
		
		
		
		
		
	
	
	
}
