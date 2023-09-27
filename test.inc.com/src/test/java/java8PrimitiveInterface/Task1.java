package java8PrimitiveInterface;

	import java.util.function.IntPredicate;
	import java.util.stream.IntStream;

	class Task1Product {
	    private String name;
	    private double price;
	    private String category;
	    private int grade;

	    public Task1Product(String name, double price, String category, int grade) {
	        this.name = name;
	        this.price = price;
	        this.category = category;
	        this.grade = grade;
	    }


	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    public int getGrade() {
	        return grade;
	    }

	    public void setGrade(int grade) {
	        this.grade = grade;
	    }

	    public static IntPredicate isPrime = n -> {
	        if (n <= 1) {
	            return false;
	        }
	        if (n <= 3) {
	            return true;
	        }
	        if (n % 2 == 0 || n % 3 == 0) {
	            return false;
	        }
	        for (int i = 5; i * i <= n; i += 6) {
	            if (n % i == 0 || n % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    };
	}

	



