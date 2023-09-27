package java8FunctionaInterface;

import java.util.ArrayList;
import java.util.List;

public class Task1Main {
	
	    public static void main(String[] args) {
	        List<Task1Product> products = new ArrayList<>();
	        products.add(new Task1Product("Laptop", 999.99, "Electronics", "A"));
	        products.add(new Task1Product("Headphones", 49.99, "Electronics", "B"));
	        products.add(new Task1Product("Book", 12.99, "Books", "A"));

	        double totalCost = products.stream()
	                .mapToDouble(Task1Product::getPrice)
	                .sum();

	        System.out.println("Total Cost of Products: " + totalCost);
	    }
	}

