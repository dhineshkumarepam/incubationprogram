package java8BifunctionalInterface;

	import java.util.function.BiFunction;

	class Task1 {
	    private String name;
	    private double price;
	    private String category;
	    private int grade;

	    public Task1(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
         @Override
	    public String toString() {
	        return "Product{" +
	                "name='" + name + '\'' +
	                ", price=" + price +
	                ", category='" + category + '\'' +
	                ", grade=" + grade +
	                '}';
	    }

	    public static void main(String[] args) {
	        BiFunction<String, Double, Task1> createProduct = (name, price) -> new Task1(name, price);

	        Task1 product = createProduct.apply("Example Product", 19.99);
	        System.out.println(product);
	    }
	}



