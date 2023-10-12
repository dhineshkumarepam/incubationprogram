package java8Predicates;

public class Task1Main {
	
	    public static void main(String[] args) {
	    	Task1Product[] products = {
	            new Task1Product("Product A", 1200, "Electronics", "A+"),
	            new Task1Product("Product B", 900, "Clothing", "B"),
	            new Task1Product("Product C", 1500, "Electronics", "A"),
	            new Task1Product("Product D", 800, "Clothing", "B-")
	        };

	        for (Task1Product product : products) {
	            if (product.getPrice() > 1000) {
	                System.out.println("Name: " + product.getName() +
	                                   ", Price: " + product.getPrice() +
	                                   ", Category: " + product.getCategory() +
	                                   ", Grade: " + product.getGrade());
	            }
	        }
	    }
	}

