package Ciclos;

import java.util.Scanner;

public class Ej_01 {

	public static void main(String[] args) {
		// Leer un numero y mostrar su cuadrado, repetir hasta que se introduzca un negativo
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, cuadrado;
		
		System.out.println("Digita un numero");
		
		numero = entrada.nextShort();
		
		while (numero >= 0) {
			cuadrado = (int)Math.pow(numero, 2);
			
			System.out.println("el "+numero+" elevado al cuadrado es: "+cuadrado);
			
			System.out.println("Digita otro numero");
			numero = entrada.nextShort();
		}

	}

}
