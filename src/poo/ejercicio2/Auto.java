package poo.ejercicio2;

public class Auto extends Vehiculo {
	
	//Atributo Nuevo de Clase Auto
		
	    private Integer cantPuertas;
	    
	//Metodo Constructor de Auto
	
		public Auto (String color, String anioFabricacion, Byte cantRuedas, String fabricante, Integer cantPuertas) {
			super(color, anioFabricacion, cantRuedas, fabricante);
			this.cantPuertas = cantPuertas;
		};
		
		//// Metodos implementados de los metodos abstractos
		
		public void acelerar () {
			System.out.println("Acelero de 0 a 100 en 30 Segundos por ser un auto de 1.6 Litros.");
		};
		public void desacelerar () {
			System.out.println("Desacelero completamente de 100 a 0 en 50 Segundos porque es un auto sin ABS.");
		};
		public void doblar () {
			System.out.println("Doblo girando el Volante como un Auto");
		};
	
		
		public void setCantPuertas (Integer cantPuertas) {
			this.cantPuertas = cantPuertas;
		}
		public Integer getCantPuertas () {
			return this.cantPuertas;
		}
		
		
		
	
}
