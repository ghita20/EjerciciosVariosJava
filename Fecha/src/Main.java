import java.util.*;
class Fecha {
		//Campos
		private int dia,mes,año;
		
		//Constructores
		public Fecha(){
			dia=10;
			mes=1;
			año=2017;
		}
		
		public Fecha(int dia, int mes, int año ){
			this.dia=dia;
			this.mes=mes;
			this.año=año;
		}
		
		//Getters
		public int getDia(){
			return dia;
		}
		
		public int getMes(){
			return mes;
		}
		
		public int getAño(){
			return año;
		}
		
		public String mostrarFecha(){
			return dia+"/"+mes+"/"+año;
		}
		
		//Setters
		public void setDia(int dia){
			if(esCorrecta(dia,mes,año))
				this.dia=dia;
		}
		public void setMes(int mes){
			if(esCorrecta(dia,mes,año))
				this.mes=mes;
		}
		public void setAño(int año){
			if(esCorrecta(dia,mes,año))
				this.año=año;
		}
		
		
		//comprobar año bisiesto
		public boolean esBisiesto(int año){
			boolean bisiesto= año%4==0 && (año%100!=0 || año%400==0);
						
			return bisiesto;
		}
		
		//comprobar fecha correcta
		public boolean esCorrecta(int dia, int mes, int año){
			boolean correcto=true;
			
			switch(mes){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				correcto= dia>0 && dia<=31?true:false; 
				break;
				
			case 2: 
				if(esBisiesto(año))
					correcto= dia>0 && dia<=29?true:false; 
				else
					correcto= dia>0 && dia<29?true:false;
				break;
				
			case 4: case 6: case 9: case 11:
				correcto= dia>0 && dia<31?true:false;
				break;
			
			default:
				correcto=false;
			
			}
			
			return correcto;
		}
		
	
		
				
		//Método static
		public static String FechaActual(){
			Calendar fechaActual=new GregorianCalendar();
			return fechaActual.get(Calendar.DAY_OF_MONTH) +"/" +fechaActual.get(Calendar.MONTH)+1 +"/" +fechaActual.get(Calendar.YEAR);
		}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha miFecha=new Fecha(10,10,2000);
		
		miFecha.setMes(2);
		miFecha.setDia(29);
		
		System.out.println(miFecha.mostrarFecha());
		
		
	}
}
	