package condicionales;

import javax.swing.JOptionPane;

public class Ej_01 {

	public static void main(String[] args) {
		// Mostrar que un numero es menor que 10
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		if(numero%10 == 0) {
			JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
		}else {
			JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10");
		}

	}

}
