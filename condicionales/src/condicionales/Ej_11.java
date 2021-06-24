package condicionales;

import javax.swing.JOptionPane;


public class Ej_11 {

	public static void main(String[] args) {
		// Simular calculadora suma resta producto division
		
		int numero1, numero2,suma;
		char operacion;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero"));
		
		operacion = JOptionPane.showInputDialog("Digite la operacion arealizar").charAt(0);
		
		switch (operacion) {
		case 's': 
		case 'S': suma = numero1+numero2;
					JOptionPane.showMessageDialog(null, "La suma es "+suma);
				break;
			
		//Falta terminar
		default:
			throw new IllegalArgumentException("Unexpected value: " + operacion);
		}


	}

}
