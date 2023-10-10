package java8Stream;

import java.util.ArrayList;
import java.util.List;


	public class Task4Main {
	
		public static class Main {
		    public static void main(String[] args) {
		        List<Task4Product> products = new ArrayList<>();

		        products.add(new Task4Product("Laptop", 999.99, "Electronic", 5));
		        products.add(new Task4Product("Smartphone", 499.99, "Electronic", 4));
		        products.add(new Task4Product("Toaster", 49.99, "Kitchen", 3));
		        products.add(new Task4Product("TV", 799.99, "Electronic", 4));
		        products.add(new Task4Product("Coffee Maker", 79.99, "Kitchen", 4));

		        long electronicProductCount = products.stream()
		                .filter(product -> "Electronic".equals(product.getCategory()))
		                .count();

		        System.out.println("Count of electronic products: " + electronicProductCount);
		    }
		}
		}


