package arreglos;

import java.util.Scanner;

public class Ej_05 {

	public static void main(String[] args) {
		// Mezclar 2 arreglos
		
		Scanner entrada = new Scanner(System.in);
		
		int a[],b[],c[];
		
		a = new int[10];
		b = new int[10];
		c = new int[20];
		
		//Pedir arreglo a
		System.out.println("Digite el primer arreglo: ");
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1)+"Digite un numero: ");
			a[i] = entrada.nextInt();
		}
		//Pedir arreglo b
		System.out.println("Digite el segundo arreglo: ");
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1)+"Digite un numero: ");
			b[i] = entrada.nextInt();
		}
		
		//Mezclar arreglos en el arreglo c
		int j = 0;
		for(int i = 0; i < 10; i++) {
			c[j] = a[i];
			j++;
			c[j] = b[i];
			j++;
		}
		
		System.out.println("El tercer arreglo es");
		
		for(int i:c) {
			System.out.println(i);
		}
		

	}

}
