/*Programa que realiza operaciones con un objeto de tipo Hora*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora miHora=new Hora(24,60,59);
		
		miHora.imprimirHora();
		
		miHora.setHora(25);
		miHora.sumarSegundos(302);
		
		System.out.println("Hora: " +miHora.getHora());
		System.out.println("Minutos: " +miHora.getMinutos());
		System.out.println("Segundos: " +miHora.getSegundos());
	
		
		
	}

}
