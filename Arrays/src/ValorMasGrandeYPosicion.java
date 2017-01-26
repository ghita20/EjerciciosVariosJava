//Generar una matriz de 5x5  (numérica entera) e imprimir el valor más grande
//y el más pequeño y los lugares donde se encuentran.
public class ValorMasGrandeYPosicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] vector=new int[5][5];
		
		for(int i=0;i<vector.length;i++)
			for(int j=0;j<vector.length;j++)
					vector[i][j]=(int)Math.round(Math.random()*100);
		
		int menor=vector[0][0],mayor=vector[0][0];
		
		int i=0,j=0;
		int[] posicion_menor={0,0},posicion_mayor={0,0};
		
		for(int[] num_vec:vector){
			j=0;
			for(int array:num_vec){
				if(array<menor){
					menor=array;
					posicion_menor[0]=i;
					posicion_menor[1]=j;
				}
				
				if(array>mayor){
					mayor=array;
					posicion_mayor[0]=i;
					posicion_mayor[1]=j;
					
				}
				
				j++;
			}
		i++;
		}
		
		for(int[] num_vec:vector){
				for(int array:num_vec)
					System.out.print(array +", ");
		
				System.out.println();
		}
			
		System.out.println("El mayor es: " +mayor +" en la posicion " +posicion_mayor[0] +":" +posicion_mayor[1] 
				+"\nEl menor es: " +menor +" en la posicion " +posicion_menor[0] +":" +posicion_menor[1]);	
			
			
		
	}

}
