
public class HayDatosIguales_enDosVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] datos1={10,53,2,7,9};
		int[] datos2={9,2,7,0,8};
		
		byte datos_iguales=0;
		
		for(int dato1:datos1)
			for(int dato2:datos2)
				if(dato1==dato2)
					datos_iguales++;
		
		System.out.println("Hay  "+datos_iguales +" datos iguales.");

	}

}
