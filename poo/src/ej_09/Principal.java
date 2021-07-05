package ej_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();//Arreglo dinamico 
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		//llenar un poligono
		llenarPoligono();
		
		//mostrar datos y area de cada poligono
		
		mostrarResutados();

	}
	
	public static void llenarPoligono() {
		int opcion;
		char respuesta;
		do {
			
			do {
				System.out.println("Digite que opcion de poligono desea: ");
				System.out.println("1. Triangulo");
				System.out.println("2. Rectangulo");
				System.out.print("Opcion: ");
				opcion = entrada.nextInt();
				
			} while (opcion < 1 || opcion > 2);
			
			switch (opcion) {
			case 1: //Llenar un triangulo
				llenarTriangulo();
				break;
			case 2: //Llenar un rectanulo
				llenarRectangulo();
				break;
			
			}
			System.out.print("\n ¿Desea introducir otro poligono?(s/n)");
			respuesta = entrada.next().charAt(0);
			
			
		}while(respuesta == 's' || respuesta == 'S');
	}
	
	public static void llenarTriangulo() {
		double lado1, lado2, lado3;
		
		System.out.print("Digite el lado 1 del triangulo: ");
		lado1 = entrada.nextDouble();
		System.out.print("Digite el lado 2 del triangulo: ");
		lado2 = entrada.nextDouble();
		System.out.print("Digite el lado 3 del triangulo: ");
		lado3 = entrada.nextDouble();
		
		Triangulo triangulo = new Triangulo(3, lado1, lado2, lado3);
		
		//Guardamos el triangulo dentro del arreglo de poligonos usa polimorfismo
		poligonos.add(triangulo);
	}
	
	public static void llenarRectangulo() {
		double lado1, lado2;
		
		System.out.print("Digite el lado 1 del rectangulo: ");
		lado1 = entrada.nextDouble();
		System.out.print("Digite el lado 2 del rectangulo: ");
		lado2 = entrada.nextDouble();
		
		
		Rectangulo rectangulo = new Rectangulo(2, lado1, lado2);
		
		//Guardamos el triangulo dentro del arreglo de poligonos usa polimorfismo
		poligonos.add(rectangulo);
		
	}
	
	public static void mostrarResutados() {
		//Recorriendo el arreglo de poligonos
		for(Poligono poli:poligonos) {
			System.out.println(poli.toString()); //imprime el metodo toString dependiendo la clase
			System.out.println("Area: "+poli.area());
			System.out.println("");
		}
	}

}
