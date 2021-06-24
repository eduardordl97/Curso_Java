package condicionales;

import javax.swing.JOptionPane;

public class Ej_Cajero {

	public static void main(String[] args) {
		// Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares
		/*
		 * Ingresar dinero
		 * retirar dinero
		 * salir
		 * */
		
		final int saldo_inicial = 1000;
		float saldo;
		int opcion;
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico \n"
				+ "1. Ingresar dinero \n"
				+ "2. Retirar dinero \n"
				+ "3. Salir"
				));
		
		switch (opcion) {
		case 1: 
			saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el saldo a ingresar"));
			
			saldo += saldo_inicial;
			
			JOptionPane.showMessageDialog(null, "Su saldo es "+ saldo);
			

		default:
			
		}
		

	}

}
