package Ciclos;

import javax.swing.JOptionPane;

public class Ej_03 {

	public static void main(String[] args) {
		// Leer n?meros hasta que se introduzca un 0. para cada uno indicar si es par o impar
		
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introdzca un numero"));
		
		while(numero != 0) {
			if(numero%2 == 0) {
				JOptionPane.showMessageDialog(null, "El n?mero:"+numero+" es par");
			
			}else {
				JOptionPane.showMessageDialog(null, "El n?mero:"+numero+" es impar");
				
			}
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introdzca otro numero"));
		}
		

	}

}
