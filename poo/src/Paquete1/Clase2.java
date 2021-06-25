package Paquete1;

public class Clase2 {
	
	public static void main(String [] args) {
	
		Clase1 objeto1 = new Clase1();
		
		objeto1.setEdad(10); //Metodo setter
		System.out.println("La edad es:"+objeto1.getEdad());
		objeto1.setNombre("Eduardo");
		String nombre = objeto1.getNombre();
		System.out.println("El nombre es:"+nombre);
	}

}
