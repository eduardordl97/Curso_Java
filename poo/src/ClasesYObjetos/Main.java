package ClasesYObjetos;

//import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String [] args) {
		//Primer constructor
		Persona p1 = new Persona("Eduardo", 23);
		//Segundo constructor
		Persona p2 = new Persona("124567890");
		
		p1.correr();
		p2.correr(10);
		
		
		/*
		Persona p1 = new Persona("Eduardo", 23);
		p1.mostrarDatos();
		/*
		
		/*
		Operacion op1 = new Operacion();
		
		op1.leerNumeros();
		op1.sumar();
		op1.restar();
		op1.multiplicar();
		op1.dividir();
		op1.mostrarResultados();
		*/
		
		/*
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
		
		
		Operacion op1 = new Operacion();
		
		op1.sumar(n1,n2);
		op1.restar(n1, n2);
		op1.multiplicar(n1, n2);
		op1.dividir(n1, n2);
		op1.mostrarResultados();
		
		
		RetornoValores op1 = new RetornoValores();
		
		int suma = op1.sumar(n1,n2);
		int resta = op1.restar(n1, n2);
		int mult = op1.multiplicar(n1, n2);
		float div =  op1.dividir(n1, n2);
		
		
		op1.mostrarResultados(suma, resta, mult, div);
		
		//OTRA FORMA
		
		System.out.println("La suma es: "+ op1.sumar(n1,n2));
		
		*/
		
		
		
	}
}
