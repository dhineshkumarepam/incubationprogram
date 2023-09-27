package java8FunctionaInterface;

import java.util.ArrayList;
import java.util.List;

public class Task2Main {
	
	    public static void main(String[] args) {
	        
	        List<Task2Product> products = new ArrayList<>();
	        products.add(new Task2Product("Product A", 1200.0, "Category 1", 4));
	        products.add(new Task2Product("Product B", 800.0, "Category 2", 3));
	        products.add(new Task2Product("Product C", 1500.0, "Category 1", 5));
	        products.add(new Task2Product("Product D", 900.0, "Category 3", 2));

	        double totalCost = products.stream()
	                .filter(product -> product.getPrice() > 1000)
	                .mapToDouble(Task2Product::getPrice)
	                .sum();

	        System.out.println("Total cost of products with prices > 1000: " + totalCost);
	    }
	}



