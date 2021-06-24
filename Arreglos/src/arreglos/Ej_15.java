package arreglos;

import java.util.Scanner;

public class Ej_15 {

	public static void main(String[] args) {
		// TLeer 10 enteros ordenados crecientemente 
		//leer N y buscarlo en la tabla.Se debe mostrar la posicion en que se encuentra
		//si no está,indicarlo con un mensaje
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo[],numero;
		boolean creciente = true;
		
		arreglo = new int[10];
		
		do {
			//Pedimos el arreglo
			System.out.println("Rellene el arreglo: ");
			for(int i = 0; i < 10; i++) {
				System.out.print((i+1)+". Digite un numero");
				arreglo[i] = entrada.nextInt();
			}
			//Verificar si el arreglo está ordenado
			for(int i=0;i<9;i++) {
				if(arreglo[i] < arreglo[i+1]) {
					creciente = true;
					
				}
				if(arreglo[i] > arreglo[i+1]) {
					creciente = false;
					break;
				}
				
			if(creciente == false) {
				System.out.println("El arreglo no es creciente");
			}
				
				
			}
		}while(creciente == false);
		
		//numero a buscar
		System.out.print("Digite el numero a buscar en el arreglo: ");
		numero = entrada.nextInt();
		
		//Buscamos el numero en el arreglo
		int i = 0;
		//
		while(i<10 && arreglo[i]<numero) {
			i++;
			
		}
		///// no finalizado
		

	}

}
