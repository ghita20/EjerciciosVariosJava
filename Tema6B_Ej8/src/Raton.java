
public class Raton {
	private int[] posicion;
	private char aspecto;
	
	public Raton(int[] posicion,char aspecto){
		this.posicion=new int[2];
		this.posicion[0]=posicion[0];
		this.posicion[1]=posicion[1];
		
		this.aspecto=aspecto;
	}
	
	public int[] getPosicion(){
		return posicion;
	}
	public void setPosicion(int[] posicion){
		this.posicion[0]=posicion[0];
		this.posicion[1]=posicion[1];
	}
	public char getAspecto(){
		return aspecto;
	}
	
}
