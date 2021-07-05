package Ejercicio3;

import java.util.Scanner;


public class Main {
	
	/*
	public static int cocheBarato(Vehiculo coches[]) {
		float precio;
		int indice = 0;
		precio = coches[0].getPrecio();
		r
	}
	*/
	
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		String marca, modelo;
		float precio;
		int numeroVehiculos;
		
		System.out.println("Digite la cantidad de vehiculos");
		
		numeroVehiculos = entrada.nextInt();
		
		//Creamos los objetos para los coches
		Vehiculo coches[] = new Vehiculo[numeroVehiculos];
		
		for(int i = 0;i < coches.length;i++) {
			System.out.println("Digite las caracteristicas del coche"+(i+1)+":");
			System.out.println("introduzca la marca:");
			marca = entrada.nextLine();
			System.out.println("introduzca el modelo:");
			modelo = entrada.nextLine();
			System.out.println("introduzca el precio:");
			precio = entrada.nextFloat();
			
			
			coches[i] = new Vehiculo(marca, modelo, precio);
			
		}
		
		
		
		
		
		
		
		
	}

}
