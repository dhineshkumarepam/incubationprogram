package java8PrimitiveInterface;

	
	import java.util.function.IntConsumer;

	class Task2 {
	    private String name;
	    private double price;
	    private String category;
	    private int grade;

	    public Task2(String name, double price, String category, int grade) {
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
	        
	    	Task2 product = new Task2("Example Product", 19.99, "Electronics", 5);
	        System.out.println(product);

	        IntConsumer squarePrinter = num -> System.out.println("Square of " + num + " is " + (num * num));

	        squarePrinter.accept(5);
	    }
	}



