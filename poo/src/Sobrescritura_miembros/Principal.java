package Sobrescritura_miembros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona = new Persona();
		Perro perro = new Perro();
		Animal animal = new Animal();
		
		persona.comer();
		perro.comer();
		animal.comer();

	}

}
