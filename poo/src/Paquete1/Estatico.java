package Paquete1;

public class Estatico {
	//Atributos
	//Miembros estaticos
	private static String frase = "Primera frase"; // atributo estatico le pertenece a lac lase
	
	
	public static void main(String [] args) {
		Estatico obj1 = new Estatico();
		Estatico obj2 = new Estatico();
		
		//Todos los objetos van a tener esta frase
		//Si yo cambio el atributo de un objeto, va cambiar para todos porque ahora le pertenece a la clase
		
		obj2.frase = "segunda frase";
		
		System.out.println(obj1.frase);
		System.out.println(obj2.frase);
		
		//EJEMPLO (ya no hace falta instanciar objetos)
		
		System.out.println(Estatico.frase); // ahora la clase es dueña del atributo(no hace falta generar objetos)
		
		//Metodo estatico (ya no hace falta instanciar el objeto)
		
		System.out.println(Estatico.sumar(5, 5));
		
	}
	//Metodo estatico
	//Ahora le pertenece a la clase
	public static int sumar(int n1, int n2) {
		int suma =n1 + n2;
		return suma;
		
	}

}
