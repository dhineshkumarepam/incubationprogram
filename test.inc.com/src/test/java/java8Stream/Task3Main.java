package java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3Main {
	 public static void main(String[] args) {
	        List<Task3Product> products = Arrays.asList(
	            new Task3Product("Laptop", 1200.0, "Electronics", 5),
	            new Task3Product("Mobile Phone", 800.0, "Electronics", 4),
	            new Task3Product("Refrigerator", 1500.0, "Electronics", 4),
	            new Task3Product("Camera", 300.0, "Electronics", 3),
	            new Task3Product("Toaster", 30.0, "Kitchen", 2)
	        );

	        List<String> filteredProductNames = products.stream()
	            .filter(product -> product.getPrice() > 1000.0 && product.getCategory().equals("Electronics"))
	            .map(product -> product.getName().toUpperCase())
	            .collect(Collectors.toList());

	        System.out.println("Filtered Product Names (in CAPS): " + filteredProductNames);
	    }
}
