package java8FunctionaInterface;

import java.util.ArrayList;
import java.util.List;

public class Task3Main {

	    public static void main(String[] args) {
	        List<Task3Product> products = new ArrayList<>();
	        products.add(new Task3Product("Laptop", 999.99, "Electronics", 5));
	        products.add(new Task3Product("Smartphone", 499.99, "Electronics", 4));
	        products.add(new Task3Product("Toaster", 39.99, "Kitchen Appliances", 4));

	        
	        double totalElectronicCost = products.stream()
	                .filter(product -> "Electronics".equals(product.getCategory()))
	                .mapToDouble(Task3Product::getPrice)
	                .sum();

	        System.out.println("Total cost of electronic products: $" + totalElectronicCost);
	    }
	}

