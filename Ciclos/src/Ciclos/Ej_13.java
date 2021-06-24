package Ciclos;

import javax.swing.JOptionPane;

public class Ej_13 {

	public static void main(String[] args) {
		/*
		 * Pedir 10 numeros, mostrar la media de los numeros positios, la media de los numeros 
		 * negativos y la cantidad de ceros 
		 */
		
		int numero, suma_positivos = 0, conteo_positivos = 0,suma_negativos = 0,conteo_negativos = 0,conteo_ceros = 0;
		float media_positivos, media_negativos;
		
		for(int i = 1; i <= 10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
			
			if(numero == 0) {
				conteo_ceros++; //aumenta en 1 el conteo de ceros
			}else if(numero > 0) {
				suma_positivos += numero;
				conteo_positivos++;
			}else {
				suma_negativos += numero;
				conteo_negativos++;
			}
			
		}
		//No finalizado
		
		
		

	}

}
