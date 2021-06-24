package operadores;

import java.util.Scanner;

public class Ej_07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 Construir un programa que dado un numero total de horas devuelve el numero
		 de semanas, dias y horas equivalentes. Por ejemplo, dado un total de 1000 horas
		 debe mostrar 5 semanas,6 días y 16 horas.
		  
		*/
				
		int horasTotales, semanas, dias, horas;
		
		System.out.print("Digite el numero de horas");
		
		horasTotales = entrada.nextInt();
		
		semanas = horasTotales/168;
		dias = horasTotales%168/24;
		horas = horasTotales%24;
		
		System.out.print("las semanas son: "+semanas+"\n");
		System.out.print("los días son: "+dias+"\n");
		System.out.print("las horas son: "+horas+"\n");

	}

}
