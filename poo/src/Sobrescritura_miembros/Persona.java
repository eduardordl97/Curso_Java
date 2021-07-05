package Sobrescritura_miembros;

public class Persona extends Animal {

	@Override //sobreescribe el metodo
	public void comer() {
		System.out.println("Estoy comiendo sentado y con cubiertos");
	}
}
