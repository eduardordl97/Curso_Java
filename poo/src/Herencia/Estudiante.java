package Herencia;

public class Estudiante extends Persona{ //Estudiante hereda de Persona con extends
	private int codigoEstudiante;
	private float notaFinal;
	
	//Constructor de clase hija
	public Estudiante(String nombre, String apellidoString, int edad, int codigoEstudiante, float notaFinal ) {
		super(nombre, apellidoString, edad);
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
	
	//Metodos
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellido: "+getApelllido());
		System.out.println("Edad: "+getEdad());
		System.out.println("Codigo de estudiante: "+codigoEstudiante);
		System.out.println("Nota final: "+notaFinal);
	}

}
