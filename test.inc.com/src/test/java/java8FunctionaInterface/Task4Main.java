package java8FunctionaInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

	public class Task4Main {
	    public static void main(String[] args) {
	        List<Task4Product> products = new ArrayList<>();

	        
	        products.add(new Task4Product("Laptop", 1200.0, "Electronics", 4));
	        products.add(new Task4Product("Smartphone", 800.0, "Electronics", 5));
	        products.add(new Task4Product("Television", 1500.0, "Electronics", 4));
	        products.add(new Task4Product("Book", 15.0, "Books", 4));

	        List<Task4Product> filteredProducts = products.stream()
	                .filter(product -> product.getPrice() > 1000 && product.getCategory().equals("Electronics"))
	                .collect(Collectors.toList());

	        filteredProducts.forEach(product -> System.out.println(product.getName()));
	    }
	}


