package Ejercicio3;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private float precio;
	
	//constructor
	public Vehiculo(String marca, String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}


	
	//metodos
	
	public float getPrecio() {
		return precio;
	}
	
	public String mostrarDatos() {
		return "Marca: "+marca+ "\n Modelo: "+modelo+ "\n Precio: $"+precio+"\n";
	}
	
	
	
}
