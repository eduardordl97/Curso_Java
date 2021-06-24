package operadores;

import java.util.Scanner;

public class Ej_04 {

	public static void main(String[] args) {
		/*
		 Una compañia de venta de carros usados paga a su personal de ventas un salario
		 de 1000 mensuales, mas una comision de 150 por cada carro vendido, mas el 5%
		 del valor de la venta por el carro. Cada mes el capturista de la empresa ingresa en
		 la computadora los datos pertinentes.
		 Hacer un programa que calcule e imprima el salario mensual
		 de un vendedor dado
		 */
		Scanner entrada = new Scanner(System.in);
		
		double salario,vendidos,salario_t,ventas,bono;
		
		System.out.println("Digite carros vendidos");
		vendidos = entrada.nextDouble();
		System.out.println("digite el valor de sus ventas");
		
		ventas = entrada.nextDouble();
		
		
		bono = (ventas)* .05;
		salario = (vendidos * 150)+1000;
		salario_t = bono + salario;
		
		System.out.println("El salario del empleado es:"+salario_t);
		
		
	}

}
