import java.util.Random;

public class Examen {
	//***************Campos
		private static Random rnd = new Random();
		private int nota;
	
	//***************Constructor	
		public Examen(){
			nota=generarNota();
		}
	
	//Metodos
		public int generarNota(){
			return rnd.nextInt(101);
		}
		public int getNota(){
			return nota;
		}
		public void setNota( int nota){
			if(nota>=0 && nota<=100)
				this.nota=nota;
		}
	
}
