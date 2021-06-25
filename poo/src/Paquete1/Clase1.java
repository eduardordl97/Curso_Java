package Paquete1;

public class Clase1 {
	//Modificador de acceso
	//int atributo1; //Sin modificador por defecto es publico //Se puede acceder cualquiera del mismo paquete
	//public int atributo1; //Permite acceder a otros paquetes
	//private int atributo1; //Restringe mi atributo para que solo pueda utilizarse por metodos de la misma clase
	
//Encapsulamiento: Ocultar nuestros atributos o metodos para que solo sean accedidos desde la misma clase
	//Ocultar los datos para qe no cualquiera pueda acceder a ellos
	
	private int edad;
	private String nombre;
	
//Metodos accesores (Getters y Setters)
	
	//Setters: Set establecer
	
	public void setEdad(int edad) {  //Establecemos la edad
		this.edad = edad;
	}
	
	//Getter:Mostramos la edad
	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}



	
}
