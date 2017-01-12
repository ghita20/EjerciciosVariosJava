
public class Fecha {
	//Campos
	private int dia,mes,a�o;
	
	
	//Constructor
	Fecha(int dia,int mes, int a�o){
		this.dia=dia;
		this.mes=mes;
		this.a�o=a�o;
	}
	
	//Getters
	public int getDia(){
		return dia;
	}
	public int getMes(){
		return mes;
	}
	public int getA�o(){
		return a�o;
	}
	
	
	//Setters
	public void setDia(int dia){
		this.dia=dia;
	}
	public void setMes(int mes){
		this.dia=mes;
	}
	public void setA�o(int a�o){
		this.dia=a�o;
	}
	
	//M�todos
	public boolean esBisiesto(){
		return a�o%4==0?true:false;
	}
	
	public boolean esCorrecta(){
		boolean correcto=true;
		
		switch(mes){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			correcto= dia>0 && dia<=31?true:false; 
			break;
			
		case 2: 
			if(esBisiesto())
				correcto= dia>0 && dia<=29?true:false; 
			else
				correcto= dia>0 && dia<29?true:false; 
			
			break;
			
		case 4: case 6: case 9: case 11:
			correcto= dia>0 && dia<31?true:false;
			break;
		
		}
		
		return correcto;
		
	}
	

	
}
