
public class TragaBolas {
	//Patron para imprimir el método Visualizar() *está static porque es independiente del objeto
	private static final String patron="Color: %s --- BolasComidas= %d --- CantidadMáxBolas= %d";
	
	//miembros del objeto
	private String color;
	private int bolasComidas,maxBolas;
	
	//colores permitidos
	private static final String COLORES_PERMITIDOS[]={"verde","amarillo","rojo"};
	
	
	//CONSTRUCTORES
	public TragaBolas(String color, int maxBolas){
		bolasComidas=0;
		this.color=color;
		this.maxBolas=maxBolas;
	}
	
	
	//_____________________________________________________
	
	//MÉTODOOOOOOS
	
	//Visualizar
	public void visualizar(){
		//imprimo el color , bolasComidas, maxBolas
		System.out.println(String.format(patron, color,bolasComidas,maxBolas));
	}
	
	//comer
	public void comer(){
		//compruebo que las bolas comidas son inferiores al nr de máxBolas
		if(bolasComidas<maxBolas){
			++bolasComidas;
			System.out.println("He comido una bola.");
		} else
			System.out.println("Ya he comido demasiadas bolas.");
	}
	
	//trotar
	public void trotar(){
		if(bolasComidas>=1){
			--bolasComidas;
			System.out.println("Estoy trotando,");
		}else
			System.out.println("No puedo trotar.");
		
	}
	
	//dormir
	public void dormir(){
		if(bolasComidas==maxBolas){
			System.out.println("Tripa llena. ZZZZZZZ");
			bolasComidas/=2;
		} else
			System.out.println("No quiero dormir.");
	}
	
	//comprobar que el color es correcto
	public static boolean colorPermitido(String color){
		boolean color_permitido=false;
		
		//comrpuebo si el color es igual a alguno de los colores permitidos
		for(String color_perm: COLORES_PERMITIDOS)
			if(color_perm.equals(color.toLowerCase()))
				color_permitido=true;
		
		//si es igual a algún color permitido devuelvo true
		if(color_permitido)
			return true;
		else
			return false;
	}
	
	
	
	
}
