package java8BifunctionalInterface;

import java.util.Map;
import java.util.function.BiFunction;

public class Task2CartCostCalculator {

	    public static void main(String[] args) {
	        
	    	ProductTask2 product1 = new ProductTask2("Product 1", 10.0, "Category A", 4);
	    	ProductTask2 product2 = new ProductTask2("Product 2", 20.0, "Category B", 3);
	    	ProductTask2 product3 = new ProductTask2("Product 3", 30.0, "Category A", 5);

	        Map<ProductTask2, Integer> cart = Map.of(
	            product1, 2,   
	            product2, 3,  
	            product3, 1    
	        );

	        BiFunction<ProductTask2, Integer, Double> productCostCalculator = (product, quantity) ->
	            product.getPrice() * quantity;

	        double totalCost = cart.entrySet().stream()
	            .mapToDouble(entry -> productCostCalculator.apply(entry.getKey(), entry.getValue()))
	            .sum();

	        System.out.println("Total cost of the cart: " + totalCost);
	    }
	}

