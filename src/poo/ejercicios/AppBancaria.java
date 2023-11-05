package poo.ejercicios;

public class AppBancaria {
	public static void main (String [] args) {
	
		CajaDeAhorro Caja1 = new CajaDeAhorro (); //Objeto Instanciado de la Clase "CajaDeAhorro"
		
		Caja1.setSaldo(7000f);              //Metodo para setear saldo desde 0
		Caja1.depositarSaldo(1500f);		//Metodo para depositar "x" monto de Saldo nuevo
		Caja1.extraerSaldo(550f);			//Metodo para extraer saldo
		Caja1.verSaldo();					//Metodo para ver el nuevo saldo disponible
		
		
		
		
		
	
	


	}		
		
}
