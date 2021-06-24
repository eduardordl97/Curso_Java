package ClasesYObjetos;



public class Operacion {
	
	//Atributos
	int suma;
	int resta;
	int multiplicacion;
	double division;
	
	//Metodos
	
	//Metodo para pedirle al usuario 2 numeros
	
	
	//Metodo para sumar ambos numeros
	public void sumar(int numero1, int numero2) {
		
		suma = numero1+numero2;
		
	}
	
	//Metodo para restar
	public void restar(int numero1, int numero2) {
		
		resta = numero1-numero2;
		
	}
	//Metodo para multiplicar
	public void multiplicar(int numero1, int numero2) {
		
		multiplicacion = numero1*numero2;
		
	}
	//Metodo para dividir
	public void dividir(int numero1, int numero2) {
		
		division = (double)numero1/numero2;
		
	}
	
	//Metodo para mostrar resultados
	public void mostrarResultados() {
		
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("La multiplicacion es: "+multiplicacion);
		System.out.println("La division es: "+division);
	}
	
	

}
