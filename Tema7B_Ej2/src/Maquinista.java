
public class Maquinista extends Empleado implements Interfaz{
	private int numeroMaquinaAsignada,numeroAñosMaquina;

	
	public Maquinista(String nombre, float sueldo, int edad,
			int numeroMaquinaAsignada, int numeroAñosMaquina){
		
		super(nombre,sueldo,edad);
		this.numeroMaquinaAsignada=numeroMaquinaAsignada;
		this.numeroAñosMaquina=numeroAñosMaquina;
	}
	
	public int getNumeroMaquinaAsignada() {
		return numeroMaquinaAsignada;
	}

	public void setNumeroMaquinaAsignada(int numeroMaquinaAsignada) {
		this.numeroMaquinaAsignada = numeroMaquinaAsignada;
	}

	public int getNumeroAñosMaquina() {
		return numeroAñosMaquina;
	}

	public void setNumeroAñosMaquina(int numeroAñosMaquina) {
		this.numeroAñosMaquina = numeroAñosMaquina;
	}
	
	public void visualizarTodosDatos(){
		System.out.println(
				"Nombre: " +getNombre() +" | edad: " +getEdad()
				+" | sueldo: " +getSueldo() +" | numeroMaquinaAsignada: " +getNumeroMaquinaAsignada()
				+" | numeroAñosMquina: " +getNumeroAñosMaquina());
	}
	
	

}
