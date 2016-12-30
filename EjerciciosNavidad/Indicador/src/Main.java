/*Programa que realiza operaciones con una clase Indicador que puede tomar 
diferentes valores según el tipo indicado.*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Indicador miIndicador=new Indicador("peso",20);
		
		miIndicador.incrementarValor(20);
		miIndicador.disminuirValor(10);
		miIndicador.imprimirDatos();
	
		
		
		miIndicador.setValor(900000);
		miIndicador.incrementarValor();
		miIndicador.setTipo("velocidad");
		miIndicador.imprimirDatos();
	}

}
