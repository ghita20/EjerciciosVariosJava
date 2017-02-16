
public class Maquinista extends Empleado implements Interfaz{
	private int numeroMaquinaAsignada,numeroA�osMaquina;

	
	public Maquinista(String nombre, float sueldo, int edad,
			int numeroMaquinaAsignada, int numeroA�osMaquina){
		
		super(nombre,sueldo,edad);
		this.numeroMaquinaAsignada=numeroMaquinaAsignada;
		this.numeroA�osMaquina=numeroA�osMaquina;
	}
	
	public int getNumeroMaquinaAsignada() {
		return numeroMaquinaAsignada;
	}

	public void setNumeroMaquinaAsignada(int numeroMaquinaAsignada) {
		this.numeroMaquinaAsignada = numeroMaquinaAsignada;
	}

	public int getNumeroA�osMaquina() {
		return numeroA�osMaquina;
	}

	public void setNumeroA�osMaquina(int numeroA�osMaquina) {
		this.numeroA�osMaquina = numeroA�osMaquina;
	}
	
	public void visualizarTodosDatos(){
		System.out.println(
				"Nombre: " +getNombre() +" | edad: " +getEdad()
				+" | sueldo: " +getSueldo() +" | numeroMaquinaAsignada: " +getNumeroMaquinaAsignada()
				+" | numeroA�osMquina: " +getNumeroA�osMaquina());
	}
	
	

}
