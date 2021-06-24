package condicionales;

import java.util.Scanner;

public class Ej_04 {

	public static void main(String[] args) {
		// En MegaPlaza se hace un 20% de descuento a los clientes cuya compra es mayor
		// a 300¿cual sera la cantidad que pagara cada persona por su compra
		
		Scanner entrada = new Scanner(System.in);
		
		float pagar,total = 0;
		
		System.out.println("Digite el precio a pagar");
		
		pagar = entrada.nextFloat();
		total = pagar - (pagar*0.2f) ;
		if(pagar > 300) {
			
			System.out.println(total);
		}else {
			System.out.println(pagar);
		}
	}

}
