/*
 Programa que calcule e imprima la suma de las calificaciones de los estudiantes
 */
package operadores;

import java.util.Scanner;

public class Ej_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float nota1,nota2,nota3,suma;
		
		System.out.println("Digita tus 3 calificaciones \n");
		
		//guardamos las calificaciones
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();
		
		suma = nota1 + nota2+ nota3;
		
		System.out.println("La suma es: "+suma);
		

	}

}
