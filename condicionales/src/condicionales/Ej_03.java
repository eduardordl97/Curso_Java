package condicionales;

import javax.swing.JOptionPane;

public class Ej_03 {

	public static void main(String[] args) {
		// Hacer un progra,a que lea un caracter por teclado y compruebe si es una letra mayuscula
		
		char letra;
		
		letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
		
		if(Character.isUpperCase(letra)){
			JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
			
		}else {
			JOptionPane.showMessageDialog(null, "Es una letra minuscula");
		}

	}

}
