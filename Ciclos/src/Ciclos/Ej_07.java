package Ciclos;

import javax.swing.JOptionPane;


public class Ej_07 {

	public static void main(String[] args) {
		//Pedir numeros hasta que se introduzca uno negativo y calcular la media
		
		int numero, elementos = 0,suma = 0;
		float media;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("digita un numero"));
		
		while(numero >= 0) {
			suma += numero; //suma iterativa
			elementos++; //aumentamos 1 a elementos
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("digita un numero"));
			
		}
		
		if(elementos == 0) {
			JOptionPane.showMessageDialog(null, "No has digitado elementos validos");
		}else {
			media = (float)suma/elementos;
			JOptionPane.showMessageDialog(null, "La media es: "+media);
			
		}
		

	}

}
