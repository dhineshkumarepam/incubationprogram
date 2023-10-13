package builderPattern;

public class BicycleDemo {
	 public static void main(String[] args) {
	        Bicycle bicycle = new Bicycle.Builder()
	            .addGears()
	            .addDoubleStand()
	            .addCarrier()
	            .build();

	        System.out.println("Bicycle features:");
	        System.out.println("Gears: " + bicycle.hasGears());
	        System.out.println("Double Stand: " + bicycle.hasDoubleStand());
	        System.out.println("Double Seat: " + bicycle.hasDoubleSeat());
	        System.out.println("Carrier: " + bicycle.hasCarrier());
	    }
	}

