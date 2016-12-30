
public class Indicador {

//CAMPOS
	private int valor;
	private String tipo;
	
	//valores que puede contener el campo tipo
	private final int VALOR_DEFECTO=0;
	private static final String[] TIPOS={"nivel","velocidad","peso"};
	private static final String[] REPR_TIPOS={"metros","km/h","kilogramos"};
	
//CONSTRUCTORES
	
	//por defecto
	public Indicador(){
		valor=VALOR_DEFECTO;
		tipo=TIPOS[1];
	}
	
	//con parámetros
	public Indicador(String tipo, int valor){
		this.valor=valor;
		this.tipo=tipo;
	}
	
	
//MÉTODOS
	
	//getters
	public int getValor(){
		return valor;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	
//setters
	
	//modificar el valor
	public void setValor(int valor){
		this.valor=valor;
	}
	//modificar el tipo
	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	
	//incrementar valor
	public void incrementarValor(){
		++valor;
	}
	
	public void incrementarValor(int valor){
		this.valor+=valor;
	}
	
	
	//disminuir valor
	public void disminuirValor(){
		--valor;
	}
	
	public void disminuirValor(int valor){
		this.valor-=valor;
	}
	
	
	//Visualizar el valor  el tipo
	
	public void imprimirDatos(){
		//patron que se utilizará para imprimir los datos
		String patron="%d %s";
		//variable para comprobar que el tipo es un tipo que tiene representación
		boolean encontrado=false;
	
		
		//si el tipo introducido está en los tipos que tienen representación
		//imprimirá el valor y su representación si no, imprime el valor y tipo
		
		int i=0;
		while(i<TIPOS.length && !encontrado){
			if(tipo.equals(TIPOS[i]))
				encontrado=true;
			else
				i++;
		}
		
		System.out.println(String.format(patron, valor,encontrado?REPR_TIPOS[i]:tipo));
		
	}
	
	
	

}
