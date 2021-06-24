package arreglos;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;




public class Llenar_arreglos {

	public static void main(String[] args) {
		// Llenar arreglos mediante input
		Scanner entrada = new Scanner(System.in);
		int elementos;
		
		elementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));
		
		
		char[] letras = new char[elementos];
		
		System.out.println("Digite los elementos del arreglo");
		for(int i = 0; i < elementos ; i++) {
			System.out.println((i+1)+". Digite un caracter");//iniciar el conteo desde 1
			
			letras[i] = entrada.next().charAt(0);
			
			
		}
		
		System.out.println("los caracteres del arreglo son");
		for (int i = 0; i < elementos; i++) {
			System.out.println(letras[i]+" ");
			
		}

	}

}
