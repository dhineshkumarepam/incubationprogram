package java8Stream;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	class Task2Product {
	    private String name;
	    private double price;
	    private String category;
	    private int grade;

	    public Task2Product(String name, double price, String category, int grade) {
	        this.name = name;
	        this.price = price;
	        this.category = category;
	        this.grade = grade;
	    }

	    public String getCategory() {
	        return category;
	    }

	    @Override
	    public String toString() {
	        return "Product [name=" + name + ", price=" + price + ", category=" + category + ", grade=" + grade + "]";
	    }
	}

	



