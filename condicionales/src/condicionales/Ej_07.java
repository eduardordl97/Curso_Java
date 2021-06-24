package condicionales;

import java.util.Scanner;

public class Ej_07 {

	public static void main(String[] args) {
		// Pedir 3 numeros y ordenarlos de mayor a menor
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite sus 3 numeros");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		numero3 = entrada.nextInt();
		
		if((numero1 > numero2)&&(numero2 > numero3)) {
			System.out.println(numero1+numero2+numero3);
			
		}
		else if((numero1>numero3)&&(numero3>numero2)) {
			System.out.println(numero1+numero3+numero2);
			
		}
		//Pendiente por terminar
		

	}

}
