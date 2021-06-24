package condicionales;

import javax.swing.JOptionPane;

public class condicionales {

	public static void main(String[] args) {
		// Condicionales if else
		/*
		int numero,dato = 5;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
		// != diferente  
		// > < mayor, menor
		//>=  <=  mayor o igual, menor o igual
		if(numero == dato) {
			JOptionPane.showMessageDialog(null, "El numero es 5");
			
		}else{
			JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
		
		}
		*/
		
		//Condicionales multiples (switch)
		
		int dato;
		
		dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 1 al 5"));
		
		switch(dato) {
			case 1: JOptionPane.showMessageDialog(null, "El numero es uno");
					break;
			case 2: JOptionPane.showMessageDialog(null, "El numero es dos");
				break;
			case 3: JOptionPane.showMessageDialog(null, "El numero es tres");
				break;
			case 4: JOptionPane.showMessageDialog(null, "El numero es cuatro");
				break;
			case 5: JOptionPane.showMessageDialog(null, "El numero es cinco");
				break;
			default: JOptionPane.showMessageDialog(null, "El numero no esta en el rango");
			
		}
		
	
	
		

	}

}
