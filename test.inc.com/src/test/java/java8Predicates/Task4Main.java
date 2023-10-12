package java8Predicates;

public class Task4Main {
	 public static void main(String[] args) {
		 Task4Product[] products = {
	            new Task4Product("Product A", 1200, "Electronics", "A+"),
	            new Task4Product("Product B", 900, "Clothing", "B"),
	            new Task4Product("Product C", 1500, "Electronics", "A"),
	            new Task4Product("Product D", 800, "Clothing", "B-")
	        };

	        for (Task4Product product : products) {
	            if (product.getPrice() > 100 || "Electronics".equals(product.getCategory())) {
	                System.out.println("Name: " + product.getName() +
	                                   ", Price: " + product.getPrice() +
	                                   ", Category: " + product.getCategory() +
	                                   ", Grade: " + product.getGrade());
	            }
	        }
	    }

}
