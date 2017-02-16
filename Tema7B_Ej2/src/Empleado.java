
public class Empleado implements Interfaz {
	private String nombre;
	private static final float SUELDO_BASE=700.0f;
	private float sueldo;
	private int edad;
	
	public Empleado(String nombre, float sueldo, int edad){
		this.nombre=nombre;
		if(sueldo >= SUELDO_BASE)
			this.sueldo=sueldo;
		else
			this.sueldo=SUELDO_BASE;
		
		if( edad>0 )
			this.edad=edad;
		else
			edad=18;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public static float getSueldoBase() {
		return SUELDO_BASE;
	}
	
	public void visualizarTodosDatos(){
		System.out.println(
				"Nombre: " +getNombre() +" | edad: " +getEdad()
				+" | sueldo: " +getSueldo());
	}
	
	

}
