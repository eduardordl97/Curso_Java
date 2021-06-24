package ClasesYObjetos;

public class RetornoValores {

	//Metodos
	
	//SUMA
	public int sumar(int numero1, int numero2) {
		int suma = numero1+numero2;
		return suma;
	}
	
	//RESTA
	public int restar(int numero1, int numero2) {
		int resta = numero1-numero2;
		return resta;
	}
	
	//MULTIPLICACION
	public int multiplicar(int numero1, int numero2) {
		int multiplicacion = numero1*numero2;
		return multiplicacion;
	}

	//DIVISON
	public float dividir(int numero1, int numero2) {
		float division = (float)numero1/numero2;
		return division;
	}
	
	//Metodo para mostrar resultados
	public void mostrarResultados(int suma, int resta, int multiplicacion, float division) {
		
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("La multiplicacion es: "+multiplicacion);
		System.out.println("La division es: "+division);
	}
}
