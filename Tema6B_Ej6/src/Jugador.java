
public class Jugador {
	private String nombre;
	private char skin;
	
	public Jugador(String nombre,char skin){
		this.nombre=nombre;
		this.skin=skin;
	}
	
	public char getSkin(){
		return skin;
	}
	public String getNombre(){
		return nombre;
	}
}
