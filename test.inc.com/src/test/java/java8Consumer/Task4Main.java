package java8Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Task4Main {
	 public static void main(String[] args) {
	        List<Task4Product> productList = new ArrayList<>();
	        productList.add(new Task4Product("Fan", 1500.0, "Category1", "Standard"));
	        productList.add(new Task4Product("AC", 3500.0, "Category2", "Premium"));
	        productList.add(new Task4Product("Fridge", 2500.0, "Category3", "Premium"));
	        productList.add(new Task4Product("Led TV", 4200.0, "Category4", "Premium"));

	        Consumer<Task4Product> printPremium= product -> {
	            if ("Premium".equalsIgnoreCase(product.getGrade())) {
	                System.out.println(product.getName() + "*");
	            }
	        };
	        productList.forEach(printPremium);
	    }
}
