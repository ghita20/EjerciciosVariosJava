//Calcula la desviaci�n media y la desviaci�n
//t�pica de un grupo de n�meros enteros

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrupoNumeros mi_grupo=new GrupoNumeros(10);
		
		mi_grupo.imprimirVector();
		
		System.out.println("Desviacion media: " 
					+mi_grupo.calcularDesviacionMedia());
		
		System.out.println("Desviacion t�pica: " 
				+mi_grupo.calcularDesviacionTipica());
	}

}
