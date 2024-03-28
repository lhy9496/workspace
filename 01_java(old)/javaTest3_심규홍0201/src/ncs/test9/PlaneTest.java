package ncs.test9;

public class PlaneTest {

	public static void main(String[] args) {
		Plane airplane = new Airplane("L757", 1000);
		Plane cargoplane = new Cargoplane("C40", 1000);
		
		System.out.println("Plane fuelSize");
		System.out.println("-----------------------------");
		System.out.println(airplane.toString());
		System.out.println(cargoplane.toString());
		
		System.out.println();
		
		System.out.println("100 운항");
		System.out.println("Plane fuelSize");
		System.out.println("-----------------------------");
		airplane.flight(100);
		cargoplane.flight(100);		
		System.out.println(airplane.toString());
		System.out.println(cargoplane.toString());
		
		System.out.println();
		
		System.out.println("200 주유");
		System.out.println("Plane fuelSize");
		System.out.println("-----------------------------");
		airplane.refuel(200);
		cargoplane.refuel(200);
		System.out.println(airplane.toString());
		System.out.println(cargoplane.toString());
	}
}
