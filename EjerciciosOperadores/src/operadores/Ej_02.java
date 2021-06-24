package operadores;

import java.util.Scanner;

public class Ej_02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Guillermo tiene N dolares.
		//Luis tiene la mitad de lo que poseen Guillermo 
		//Juan tiene la mitad de lo que poseen luis y guillermo juntos
		//Calcular la cantidad de dinero que tienen entre los 3
		
		float Guillermo, Luis, Juan, total;
		
		System.out.println("Digite la cantidad de dinero de Guillermo");
		
		Guillermo = entrada.nextFloat();
		
		Luis = Guillermo/2;
		Juan = (Luis+Guillermo)/2;
		total = Guillermo + Juan + Luis;
		
		System.out.println("Guillermo tiene:$"+Guillermo);
		System.out.println("Luis tiene:$"+Luis);
		System.out.println("Juan tiene:$"+Juan);
		System.out.println("En total tienen:$"+total);
		
		
		
		
		
		
		

	}

}
