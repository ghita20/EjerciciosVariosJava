
public class Administrativo extends Empleado implements Interfaz {
	private String estudiosAcademicos;
	private int numeroOrdenador;
	
	public Administrativo(String nombre, float sueldo, int edad,
			String estudiosAcademicos,int numeroOrdenador){
		
		super(nombre,sueldo,edad);
		this.estudiosAcademicos=estudiosAcademicos;
		this.numeroOrdenador=numeroOrdenador;
	}
	
	public String getEstudiosAcademicos() {
		return estudiosAcademicos;
	}
	public void setEstudiosAcademicos(String estudiosAcademicos) {
		this.estudiosAcademicos = estudiosAcademicos;
	}
	public int getNumeroOrdenador() {
		return numeroOrdenador;
	}
	public void setNumeroOrdenador(int numeroOrdenador) {
		this.numeroOrdenador = numeroOrdenador;
	}
	
	public void visualizarTodosDatos(){
		System.out.println(
				"Nombre: " +getNombre() +" | edad: " +getEdad()
				+" | sueldo: " +getSueldo() +" | estudiosAcademicos: " +getEstudiosAcademicos()
				+" | numeroOrdenador: " +getNumeroOrdenador());
	}

}
