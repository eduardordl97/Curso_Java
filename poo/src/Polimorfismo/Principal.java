package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0] = new Vehiculo("HOLA", "Ferrari", "A89");
		misVehiculos[1] = new VehiculoTurismo("HJGO", "Mercedes", "Combi", 4);
		misVehiculos[2] = new VehiculoDeportivo("JGKF", "toyota", "kj8", 500);
		misVehiculos[3] = new VehiculoFurgoneta("OIRE", "Mercdes", "J9", 2000);
		
		for(Vehiculo vehiculos: misVehiculos ) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}
		

	}

}
