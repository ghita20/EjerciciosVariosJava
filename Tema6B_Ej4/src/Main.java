
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase miclase=new Clase();
		
		miclase.imprimirDatos();
		miclase.modificarNota(9, 0, 100);

		miclase.imprimirDatos();
		miclase.imprimirResumen();
		
		System.out.println("Media del alumno 9: " +miclase.calcularMediaAlumno(9));
	}

}
