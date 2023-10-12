package java8Predicates;

public class Task5Main {
	public static void main(String[] args) {
		Task5Product[] products = {
            new Task5Product("Product A", 1200, "Electronics", "A+"),
            new Task5Product("Product B", 50, "Electronics", "B"),
            new Task5Product("Product C", 1500, "Electronics", "A"),
            new Task5Product("Product D", 80, "Clothing", "B-")
        };

        for (Task5Product product : products) {
            if (product.getPrice() < 100 && "Electronics".equals(product.getCategory())) {
                System.out.println("Name: " + product.getName() +
                                   ", Price: " + product.getPrice() +
                                   ", Category: " + product.getCategory() +
                                   ", Grade: " + product.getGrade());
            }
        }
    }
}
