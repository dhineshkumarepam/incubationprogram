package java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

	public class Task1Main {
	    public static void main(String[] args) {
	        List<Task1Product> productList = new ArrayList<>();
	        productList.add(new Task1Product("Product A", 1500.0, "Category 1", 4));
	        productList.add(new Task1Product("Product B", 800.0, "Category 2", 3));
	        productList.add(new Task1Product("Product C", 1200.0, "Category 1", 5));
	        productList.add(new Task1Product("Product D", 900.0, "Category 3", 2));
	        
	        List<Task1Product> expensiveProducts = productList.stream()
	                .filter(product -> product.getPrice() > 1000.0)
	                .collect(Collectors.toList());

	        expensiveProducts.forEach(System.out::println);
	    }
	}

