//Generar  dos vectores de LONGITUD  10 y comprobar para los 
//elementos  del primer vector cuántas veces están en el segundo vector.

public class OcurrenciasDatoVector1EnVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector1=new int[10],vector2=new int[10],ocurrencias=new int[10];
		
		//Rellenar con numeros random entre 0-10
		for(int i=0;i<vector1.length;i++){
			vector1[i]=(int)Math.round(Math.random()*10);
			vector2[i]=(int)Math.round(Math.random()*10);
		}
		
		//Calcular las ocurrencias
		for(int i=0;i<vector1.length;i++)
			for(int dato2:vector2)
				if(vector1[i]==dato2)
					ocurrencias[i]++;
		
		
		System.out.print("VECTOR 1: ");
		for(int dato1:vector1)
			System.out.print(dato1 +", ");
		
		System.out.println();
		System.out.print("VECTOR 2: ");
		for(int dato2:vector2)
			System.out.print(dato2 +", ");
		
		System.out.println();
		
		for(int i=0;i<ocurrencias.length;i++)
			System.out.println("Elemento " +(i+1) +": " +ocurrencias[i] +" veces");
	}

}
