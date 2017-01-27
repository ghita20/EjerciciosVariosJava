
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector=new int[20];
		
		for(int i=0;i<vector.length;i++)
			vector[i]=(int)(Math.random()*10+1);
		
		int menor=0,posicion_menor=0,mayor=0,posicion_mayor=0;
		
		for(int i=0;i<vector.length;i++){
			if(i==0){
				menor=vector[i];
				posicion_menor=i;
				mayor=vector[i];
				posicion_mayor=vector[i];
			}else
				if(vector[i]>mayor){
					mayor=vector[i];
					posicion_mayor=i;		
				}else //comprobar mayor
				     if(vector[i]<menor){
						menor=vector[i];
						posicion_menor=i;
				}//comprobar menor
	
		}//fin for
		
		//imrpimo el vector
		for(int x:vector)
			System.out.print(x +" | ");
		
		System.out.println();
	
		System.out.println("El mayor es " +mayor +" en la posición " +posicion_mayor 
				+"\nEl menor es " +menor +" en la posición: " +posicion_menor);
		
			
		
	}

}
