//Calcula la desviación media y la desviación
//típica de un grupo de números enteros

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrupoNumeros mi_grupo=new GrupoNumeros(10);
		
		mi_grupo.imprimirVector();
		
		System.out.println("Desviacion media: " 
					+mi_grupo.calcularDesviacionMedia());
		
		System.out.println("Desviacion típica: " 
				+mi_grupo.calcularDesviacionTipica());
	}

}
