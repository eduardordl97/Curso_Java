package arreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Metodo_Burbuja {

	public static void main(String[] args) {
		// Metodo burbuja
		Scanner entrada = new Scanner(System.in);
		int arreglo[], nElementos,aux;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: "));
		arreglo = new int[nElementos];
		
		for(int i = 0; i < nElementos;i++) {
			System.out.println((i+1)+". Digite un nmero: ");
			arreglo[i] = entrada.nextInt();
		}
		
		//METODO BURBUJA
		for(int i=0; i<(nElementos-1);i++) {
			for(int j=0;j<(nElementos-1);j++) {
				if(arreglo[j]> arreglo[j+1]) { // si numero actual es mayor a numero siguiente
					aux = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = aux;
				}
			}
		}
		//Mostrar arreglo ordenado crecientemente
		for(int i:arreglo) {
			System.out.println(i);
		}
		//dececiente
		for(int i=(nElementos-1);i>=0;i--) {
			System.out.println(arreglo[i]);
		}

	}

}
