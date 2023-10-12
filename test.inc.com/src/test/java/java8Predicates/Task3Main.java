package java8Predicates;

public class Task3Main {
	public static void main(String[] args) {
		Task3Product[] products = {
            new Task3Product("Product A", 1200, "Electronics", "A+"),
            new Task3Product("Product B", 900, "Clothing", "B"),
            new Task3Product("Product C", 1500, "Electronics", "A"),
            new Task3Product("Product D", 800, "Clothing", "B-")
        };

        for (Task3Product product : products) {
            if (product.getPrice() > 100 && "Electronics".equals(product.getCategory())) {
                System.out.println("Name: " + product.getName() +
                                   ", Price: " + product.getPrice() +
                                   ", Category: " + product.getCategory() +
                                   ", Grade: " + product.getGrade());
            }
        }
}
}