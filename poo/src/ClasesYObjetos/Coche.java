package ClasesYObjetos;

public class Coche {
	//Atribtos
	String color;
	String marca;
	int km;
	
	//Metodo
	public static void main(String [] args) {
		//Crear objeto
		Coche coche1 = new Coche();
		Coche coche2 = new Coche();
		//Rellenar atributos del objeto
		coche1.color = "blanco";
		coche1.marca = "audi";
		coche1.km = 0;
		
		coche2.color = "Rojo";
		coche2.marca = "Ferrari";
		coche2.km = 100;
		
		System.out.println("El color del coche1 es: "+coche1.color);
		System.out.println("La marca del coche1 es: "+coche1.marca);
		System.out.println("El kilometraje del coche1 es: "+coche1.km);
		
		System.out.println("El color del coche1 es: "+coche2.color);
		System.out.println("La marca del coche1 es: "+coche2.marca);
		System.out.println("El kilometraje del coche1 es: "+coche2.km);
		
	}

}
