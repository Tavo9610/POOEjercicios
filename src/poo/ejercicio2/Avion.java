package poo.ejercicio2;

public class Avion extends Vehiculo implements VehiculoAereo{
	
	public Avion (String color, String anioFabricacion, Byte cantRuedas, String fabricante) {
		super(color, anioFabricacion, cantRuedas, fabricante);
	};
	
	//// Metodos implementados de los metodos abstractos
	
	public void acelerar () {
		System.out.println("Acelero de 0 a 400 Km/h para iniciar el vuelo");
	};
	public void desacelerar () {
		System.out.println("Desacelero de 400 Km/h para detener el vuelo");
	};
	public void doblar () {
		System.out.println("Me inclino utilizando los Spoilers y el Timon de cola");
	};
	public void volar () {
		System.out.println("Estoy volando a altitud crucero de 20.000 ft");
	};
	
	
	
}
