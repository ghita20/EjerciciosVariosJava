
public class Raton {
	private int[] posicion;
	
	public Raton(int[] posicion){
		this.posicion=new int[2];
		this.posicion[0]=posicion[0];
		this.posicion[1]=posicion[1];
	}
	
	public int[] getPosicion(){
		return posicion;
	}
	public void setPosicion(int[] posicion){
		this.posicion[0]=posicion[0];
		this.posicion[1]=posicion[1];
	}
	
}
