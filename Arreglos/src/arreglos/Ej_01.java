package arreglos;

import java.util.Scanner;

public class Ej_01 {

	public static void main(String[] args) {
		// Leer 5 numero, guardarlos en un arreglo y mostrarlos en el orden introducido
		Scanner entradaScanner = new Scanner(System.in);
		
		float numeros[] = new float[5];
		
		System.out.println("Guardando los datos en el arreglo");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print((i+1)+". Digite un numero: ");
			numeros[i] = entradaScanner.nextFloat();
		}
		System.out.println("los numeros son: ");
		for(float i:numeros) {
			System.out.println(i);
		}
		
		

	}

}
