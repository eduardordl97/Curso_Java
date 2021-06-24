package condicionales;

import java.util.Scanner;

public class Ej_02 {
	

	public static void main(String[] args) {
		// Mostrar que un numero es menor que 10
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.println("Digite el primer numero");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite el segundo numero");
		numero2 = entrada.nextInt();
		
		if(numero1 < numero2) {
			System.out.println(numero1+" es menor que "+numero2);
		}else if(numero1 == numero2){
			System.out.println(numero1+" es igual que "+numero2);
		}else if(numero1 > numero2) {
			System.out.println(numero1+" es mayor que "+numero2);
		}
		
		
		

	}

}
