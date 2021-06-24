package condicionales;

import javax.swing.JOptionPane;

public class Ej_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horasTrabajadas;
		float salarioTotal;
		
		horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digita el total de horas trabajadas"));
		
		if(horasTrabajadas <= 40) {
			salarioTotal  = horasTrabajadas*16;
		}else {
			salarioTotal = (40*16) + ((horasTrabajadas-40)*20);
		}
		
		JOptionPane.showMessageDialog(null, "El salario total es "+salarioTotal);
		
	}

}
