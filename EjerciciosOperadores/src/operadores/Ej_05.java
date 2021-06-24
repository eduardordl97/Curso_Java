package operadores;

import java.util.Scanner;

public class Ej_05 {

	public static void main(String[] args) {
		/*
		 La calificacion final de un estudiante de informatica se calcula
		 con base a las calificaciones de cuatro aspectos de su rendimiento academico:
		 participacion,primer examen parcial,segundo examen parcial y examen final.
		 Sabiendo que las calificaciones anteriores entran a la calificacion final con ponderaciones de 
		 10% 25% 25% y 40% Hacer un programa que calcule e imprima la calificacion final obtenida.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		float participacion,examen1,examen2,examenf,nota_final;
		
		System.out.println("Digite la nota de participacion");
		participacion = entrada.nextFloat();
		System.out.println("Digite la nota del primer examen");
		examen1 = entrada.nextFloat();
		System.out.println("Digite la nota del segundo examen");
		examen2 = entrada.nextFloat();
		System.out.println("Digite la nota del examen final");
		examenf = entrada.nextFloat();
		
		participacion *= 0.10f;
		examen1 *= 0.25f;
		examen2 *= 0.25f;
		examenf *= 0.40f;
		
		nota_final = participacion+examen1+examen2+examenf;
		
		System.out.print("La calificacion es:"+nota_final);
		

	}

}
