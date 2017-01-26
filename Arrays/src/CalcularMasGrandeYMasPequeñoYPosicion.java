//Encontrar el dato mayor y menor de un vector
public class CalcularMasGrandeYMasPequeñoYPosicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] datos={4,2,334,4,-14,6,7,8,9,10};
		
		int menor=0,mayor=0;
		
		for(int i=0;i<datos.length;i++){
			
			if(i==0){
				menor=datos[i];
				mayor=datos[i];}
			
			if(menor>datos[i])
				menor=datos[i];
			
			if(mayor<datos[i])
				mayor=datos[i];	
		}
		
		System.out.println("El dato mayor es: " +mayor +"\nEl dato menor es: " +menor);
	}

}
