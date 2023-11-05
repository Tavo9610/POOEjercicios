package poo.ejercicios;

public class CajaDeAhorro {

	//Atributos privados de la clase (Encapsulamiento)
	
	private float Saldo;
	
	//Metodos Get y Set (Set es un metodo de tipo "Void" porque no retorna ninguna valor permite solo setearlo)
	
	public void setSaldo (float saldo) {
		this.Saldo = saldo;	
	}
	public float getSaldo (float saldo) {
		return saldo;
	}
	
	//Metodos publicos propios que cree de la clase 
	
	public void depositarSaldo (float monto) {
		Saldo = Saldo + monto;
	}
	public void extraerSaldo (float monto) {
		Saldo = Saldo - monto;
	}
	public void verSaldo () {
		System.out.println("El nuevo saldo disponible de la cuenta es es  : " + (Saldo) + " U$S");
	}
	
	//Metodo Constructor de la clase solo como ejemplo
	public CajaDeAhorro () {
		
	};
	
	
}

