package Ciclos;

import javax.swing.JOptionPane;

public class Ej_05 {

	public static void main(String[] args) {
		/* Realizar un juego para adivinar un numero.para ello generar un numero aleatorio entre 0 y 100
		 *  y luego ir pidiendo numeros indicando es mayor o es menor segun sea con respecto a n
		 *  El proceso termina cuando el usuario acierta y mostrar el numero de intentos
		 * 
		 * */
		
		int numero,aleatorio, contador = 0;
		
		
		aleatorio = (int)(Math.random()*100);
		
		do{
			numero= Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
			
			if(aleatorio > numero) {
				System.out.println("Digita un numero mayor");
			}else {
				System.out.println("digita un numero menor");
			}
			contador++;
		}while(numero != aleatorio);
		
		System.out.println("advininaste el nummero en estos intentos" +contador);
				

	}

}
