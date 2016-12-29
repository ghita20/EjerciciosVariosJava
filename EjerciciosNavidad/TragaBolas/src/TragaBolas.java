
public class TragaBolas {
	//Patron para imprimir el método Visualizar()
	private static String patron="Color: %s --- BolasComidas= %d --- CantidadMáxBolas= %d";
	
	//miembros del objeto
	private String color;
	private int bolasComidas,maxBolas;
	
	//colores permitidos
	private static final String COLORES_PERMITIDOS="verde,amarillo,rojo";
	
	
	//CONSTRUCTORES
	public TragaBolas(String color, int maxBolas){
		bolasComidas=0;
		this.color=color;
		this.maxBolas=maxBolas;
	}
	
	
	//_____________________________________________________
	
	//MÉTODOOOOOOS
	
	//Visualizar
	public void Visualizar(){
		//imprimo el color , bolasComidas, maxBolas
		System.out.println(String.format(patron, color,bolasComidas,maxBolas));
		
	}
	
	//comer
	public void Comer(){
		if(bolasComidas<maxBolas){
			++bolasComidas;
			System.out.println("He comido una bola.");
		} else
			System.out.println("Ya he comido demasiadas bolas.");
	}
	
	//trotar
	public void Trotar(){
		if(bolasComidas>=1){
			--bolasComidas;
			System.out.println("Estoy trotando,");
		}else
			System.out.println("No puedo trotar.");
		
	}
	
	//dormir
	public void Dormir(){
		if(bolasComidas==maxBolas){
			System.out.println("Tripa llena. ZZZZZZZ");
			bolasComidas/=2;
		} else
			System.out.println("No quiero dormir.");
	}
	
	//comrpobar que el color es correcto
	public static boolean ColorPermitido(String color){
		if(COLORES_PERMITIDOS.indexOf(color.toLowerCase())<0)
			return false;
		else
			return true;
	}
	
	
	
	
}
