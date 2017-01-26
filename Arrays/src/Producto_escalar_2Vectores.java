//La escala vectorial de dos vectores es = a sumar (vector1[i]*vector1[i])
// i=0 hasta--> vector1.length-1

public class Producto_escalar_2Vectores {
	
	public static void main(String[] args) {
		int[] vector1={10,20,22};
		int[] vector2={14,43,29};
		
		int escala=0;
		
		for(int i=0;i<vector1.length;i++)
			escala+=vector1[i]*vector2[i];
		
		System.out.println("La escala vectorial de los dos vectores es = " +escala);
	
	}

}
