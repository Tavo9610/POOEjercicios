package poo.ejercicio2;

public abstract class Vehiculo {
	
	//Atributos de la clase abstracta
	
	private String color;
	private String anioFabricacion;
	private Byte cantRuedas;
	private String fabricante;
	
	//Metodo Constructor no para instanciar la Clase Vehiculo ya que no se puede porque es Abstracta, pero es util para llamar al constructor en sus clases Hijas.
	//Esto seria para evitar llamar a los setters dentro de clases hijas.
	
	public Vehiculo (String color, String anioFabricacion, Byte cantRuedas, String fabricante) {
	this.color = color;
	this.anioFabricacion = anioFabricacion;
	this.cantRuedas = cantRuedas;
	this.fabricante = fabricante;
	};
	
	//
	
	//Metodos Abstractos de la clase (Serian los metodos abstractos que comparten todas las clases)
	
	abstract void acelerar ();
	abstract void desacelerar ();
	abstract void doblar ();
	
	// Getters & Setters
	
	public void setColor (String color) {
		this.color = color;
	}
	public String getColor () {
		return this.color;
	}
	public void setAnioFabricacion (String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getAnioFabricacion () {
		return this.anioFabricacion;
	}
	public void setCantRuedas (Byte cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
	public Byte getCantRuedas () {
		return this.cantRuedas;
	}
	public void setFabricante (String fabricante) {
		this.fabricante = fabricante;
	}
	public String getFabricante () {
		return this.fabricante;
	}
	
	//////////////////////////
	
	
	
	
}
