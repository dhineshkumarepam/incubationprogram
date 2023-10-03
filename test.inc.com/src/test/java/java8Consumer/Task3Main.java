package java8Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Task3Main {
	public static void main(String[] args) {
        List<Task3Product> productList = new ArrayList<>();
        productList.add(new Task3Product("Iphone 14", 1500.0, "Category1", "Standard"));
        productList.add(new Task3Product("Iphone 15 pro max", 3500.0, "Category2", "Standard"));
        productList.add(new Task3Product("Iphone 15", 2500.0, "Category3", "Standard"));

        Consumer<Task3Product> updateNameConsumer = product -> {
            if (product.getPrice() > 3000) {
                product.setName(product.getName() + "*");
            }
        };
        productList.forEach(updateNameConsumer);
        productList.forEach(System.out::println);
    }
}
