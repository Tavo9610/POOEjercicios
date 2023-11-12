package poo.ejercicio2;

import java.util.List;

public class AppConcesionaria {

	public static void main(String[] args) {
		
		Vehiculo moto = new Moto ("Amarillo", "2015", Byte.valueOf("2"), "Yamaha");
		Vehiculo auto1 = new Auto ("Rojo" , "2020", Byte.valueOf("4"), "Ferrari", 2);
		Vehiculo auto2 = new Auto ("Gris" , "2022", Byte.valueOf("4"), "Mercedes Benz", 4);
		Avion avion1= new Avion ("Blanco", "1999", Byte.valueOf("8"), "Boeing");
		
		moto.acelerar();
		moto.desacelerar();
		System.out.println("=========");
		auto1.acelerar();
		auto1.desacelerar();
		avion1.acelerar(); //Metodo que aplica el Polimorfismo porque utiliza el metodo "Acelerar" pero de forma distinta al Auto y Moto
		avion1.volar();
		
		/////////////////////////////////////////////////////////
		
		Moto moto1 = new Moto ("Roja" , "2012", Byte.valueOf("2"), "Honda");
		Moto moto2 = new Moto ("Verde" , "2011", Byte.valueOf("2") , "Yamaha");
		Moto moto3 = new Moto ("Negra", "2009", Byte.valueOf("2"), "Suzuki");
		
		pintarMoto(List.of(moto1,moto2,moto3)); //Metodo que depende de implementacion (Mal practica)
		pintarVehiculo(List.of(moto, auto1, auto2, moto, moto1, moto2,moto3)); // Metodo que depende de la abstraccion (Buena practica)
		

	}

	//Metodo que depende de la implementacion de la Clase Moto (Mala practica)
	
	static public void pintarMoto (List<Moto> listaMoto) {
		for(Moto moto: listaMoto) {
			System.out.println(moto.getFabricante());
		}
	}
	static public void pintarVehiculo (List<Vehiculo> listaVehiculo) {
		for(Vehiculo vehiculo: listaVehiculo) {
			System.out.println(vehiculo.getFabricante());
		}
	}
	
	
}
