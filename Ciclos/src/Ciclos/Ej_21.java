package Ciclos;

import javax.swing.JOptionPane;

public class Ej_21 {

	public static void main(String[] args) {
		// Pedir 10 numeros y mostrar al final si se ha introducido alguno negativo
		
		int numero;
		boolean hay_negatvos = false;
		
		for(int i = 1; i <= 10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
			
			if(numero < 0) {
				hay_negatvos = true;
			}
		}
		
		if(hay_negatvos) {
			System.out.println("Si  existe al menos un negativo");
			
		}else {
			System.out.println("No hay un negativo");
		}

	}

}
