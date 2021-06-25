package Paquete1;

public class Persona {
	private final String nombre; //constante
	private int edad;
	
	//constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	//metodo mostrar datos
	public void mostrarDatos() {
		System.out.println("El nombre es: "+nombre);
		System.out.println("La edad es: "+edad);
	}
	//getter and setters
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	
	
	
	
	

}
