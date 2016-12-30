
public class Hora {
//CAMPOS	
	private int hora,minutos,segundos;

//CONSTRUCTORES
	
	//Defecto
	public Hora(){
		hora=0;
		minutos=0;
		segundos=0;
	}
	
	//Con parámetros
	public Hora(int hora,int minutos,int segundos){
		this.hora=hora;
		this.minutos=minutos;
		this.segundos=segundos;
		
		analizarTiempo();
	}
	
//MÉTODOS
	
	//SumarHora *incrementa la hora x segundos
	public void sumarSegundos(int segundos){
		
		this.segundos+=segundos;
		analizarTiempo();
		
	}
	
	//RestarHora *restará la hora x segundos
	public void restarSegundos(int segundos){
		this.segundos-=segundos;
		analizarTiempo();
		
	}
	
	//Getters
	public int getHora(){
		return hora;
	}
	
	public int getMinutos(){
		return minutos;
	}
	
	public int getSegundos(){
		return segundos;
	}
	
	//Setters
	public void setHora(int cantidad){
		hora+=cantidad;
		analizarTiempo();
	}
	
	public void setMinutos(int cantidad){
		minutos+=cantidad;
		analizarTiempo();
	}
	public void setSegundos(int cantidad){
		segundos+=cantidad;
		analizarTiempo();
	}
	
	
	//comprobar que los valores de los campos sean correctos
	public void analizarTiempo(){
		//comprueba que el valor es positivo
		if(hora<0)
			hora=0;
		else if(minutos<0)
			minutos=0;
		else if(segundos<0)
			segundos=0;
		
		//comprueba que el valor sea menor que 60
		if(segundos>=60){
			minutos+=segundos/60;
			segundos%=60;
		}
		
		if(minutos>=60){
			hora+=minutos/60;
			minutos%=60;
		}
		
		if(hora>=24)
			hora%=24;
		
	}
	
	//Visualizar la hora completa
	public void imprimirHora(){
		System.out.println(hora +":" +minutos +":" +segundos);
	}
	
	
	
}
