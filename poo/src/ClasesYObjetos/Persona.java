package ClasesYObjetos;

public class Persona {
	//Atributos 
	String nombre;
	int edad;
	String dni;

	
	//Metodos
	
	//Sobrecarga de constructores
	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}


	public Persona(String dni) {
		
		this.dni = dni;
	}
	
	//Sobrecarga de metodos
	//se diferencian por los parametros el tipo o la cantidad de datos
	public void correr() {
		System.out.println("Soy "+nombre+" mi edad es "+edad+" y estoy corriendo una maraton");
	}
	
	public void correr(int km) {
		System.out.println("He corrido "+km+"km.");
	}
	
	
	/*
	//Metodo constructor
	
	public Persona(String nombre, int edad){
		//nombre = _nombre;
		//edad = _edad;
		
		this.nombre = nombre; //this indica que es el atributo
		this.edad = edad;
		
		
		
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre es: "+nombre);
		System.out.println("La edad es: "+edad);
	}
	*/

}
