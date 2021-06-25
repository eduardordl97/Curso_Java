package Ejercicios;

import javax.swing.JOptionPane;

public class MainCuadrilatero {
	public static void main(String [] args) {
		Cuadrilatero c1;
		
		float lado1, lado2;
		
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1 del cuadrilatero"));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2 del cuadrilatero"));
		
		if(lado1 == lado2) {
			c1 = new Cuadrilatero(lado1);
		}else {
			c1 = new Cuadrilatero(lado1, lado2);
			
		}
		
		System.out.println("El perimetro es:"+ c1.getPerimetro());
		System.out.println("El area es:"+c1.getArea());
	}
}
