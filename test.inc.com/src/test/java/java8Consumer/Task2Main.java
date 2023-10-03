package java8Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Task2Main {
	 public static void main(String[] args) {
	        List<Task2Product> productList = new ArrayList<>();
	        productList.add(new Task2Product("Iphone 15", 1500.0, "Category1", "Standard"));
	        productList.add(new Task2Product("Iphone 12", 800.0, "Category2", "Standard"));
	        productList.add(new Task2Product("Iphone 15 Pro Max", 2500.0, "Category3", "Standard"));

	        Consumer<Task2Product> updateGradeConsumer = product -> {
	            if (product.getPrice() > 1000) {
	                product.setGrade("Premium");
	            }
	        };
	        productList.forEach(updateGradeConsumer);
	        productList.forEach(System.out::println);
	    }

}
