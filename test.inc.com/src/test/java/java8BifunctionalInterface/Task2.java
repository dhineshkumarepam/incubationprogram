package java8BifunctionalInterface;

	import java.util.Map;
	import java.util.function.BiFunction;

	class ProductTask2 {
	    private String name;
	    private double price;
	    private String category;
	    private int grade;

	    public ProductTask2(String name, double price, String category, int grade) {
	        this.name = name;
	        this.price = price;
	        this.category = category;
	        this.grade = grade;
	    }

	    public double getPrice() {
	        return price;
	    }
	}

	



