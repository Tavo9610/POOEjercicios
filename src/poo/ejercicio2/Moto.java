package poo.ejercicio2;

public class Moto extends Vehiculo {
	
	//Metodo Constructor de Moto
	
	public Moto (String color, String anioFabricacion, Byte cantRuedas, String fabricante) {
		super(color, anioFabricacion, cantRuedas, fabricante);
	};
	
	//// Metodos implementados de los metodos abstractos
	
	public void acelerar () {
		System.out.println("Acelero de 0 a 100 en 5 Segundos.");
	};
	public void desacelerar () {
		System.out.println("Desacelero completamente de 100 a 0 en 3 Segundos.");
	};
	public void doblar () {
		System.out.println("Doblo inclinandome como un Motociclista.");
	};
	
	
	
	
}
