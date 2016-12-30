
public class CuentaCorriente {
//CAMPOS	
	private String numCuenta;
	private double saldo;
	
//CONSTRUCTOR	
	public CuentaCorriente(String cuenta, double cantidad){
		numCuenta=cuenta;
		saldo=cantidad;
	}
	
//M�TODOS
	//Aumentar saldo
	public void ingresarEfectivo(double cantidad){
		saldo+=cantidad;
	}
	//Retirar saldo
	public boolean retirarEfectivo(double cantidad){
		
		//si la cantidad es maor que 0 y <= saldo se podr� retirar saldo 
		if(cantidad>0 && cantidad<=saldo){
			saldo-=cantidad;
			return true;
		} else
			return false;
		
	}
	
	//Visualizar el numCuenta y su saldo
	public void visualizar(){
		System.out.println("N�mero de cuenta: " +numCuenta +" --- Saldo: " +saldo +".");
	}

}
