import java.util.Arrays;

//Ordenamiento de burbuja array..xddddddddd
public class OrdenamientoBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={23,6,78,9,2,15,7,1};
		
		for(int i=1;i<array.length;i++){
			
			for(int j=0;j<array.length-1;j++){
				int residuo;
				//los numeros menores se desplazarán a la izquierda
				if(array[j]>array[j+1]){
					residuo=array[j+1];
					array[j+1]=array[j];
					array[j]=residuo;
				}
			}//fin for
		}//fin for
		
		for(int dato:array)
		System.out.print(dato+", ");
		
		//Otra forma de imprimir un array
		System.out.println();
		System.out.println(Arrays.toString(array));
	}

}
