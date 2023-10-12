package java8Predicates;

public class Task2Main {
	 public static void main(String[] args) {
	    	Task2Product[] products = {
	            new Task2Product("Product A", 1200, "Electronics", "A+"),
	            new Task2Product("Product B", 900, "Clothing", "B"),
	            new Task2Product("Product C", 1500, "Electronics", "A"),
	            new Task2Product("Product D", 800, "Clothing", "B-")
	        };

	        for (Task2Product product : products) {
	            if ("Electronics".equals(product.getCategory())) {
	                System.out.println("Name: " + product.getName() +
	                                   ", Price: " + product.getPrice() +
	                                   ", Category: " + product.getCategory() +
	                                   ", Grade: " + product.getGrade());
	            }
	        }
	    }
}
