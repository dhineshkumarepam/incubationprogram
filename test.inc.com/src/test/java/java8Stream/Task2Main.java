package java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2Main {
	    public static void main(String[] args) {
	        List<Task2Product> products = new ArrayList<>();
	        products.add(new Task2Product("Laptop", 999.99, "Electronics", 4));
	        products.add(new Task2Product("Smartphone", 499.99, "Electronics", 5));
	        products.add(new Task2Product("Book", 19.99, "Books", 4));
	        products.add(new Task2Product("TV", 899.99, "Electronics", 4));

	        List<Task2Product> electronicsProducts = products.stream()
	                .filter(product -> "Electronics".equals(product.getCategory()))
	                .collect(Collectors.toList());

	        electronicsProducts.forEach(System.out::println);
	    }
	}

