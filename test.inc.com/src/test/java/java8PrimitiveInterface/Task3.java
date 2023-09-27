package java8PrimitiveInterface;

	import java.util.Random;
	import java.util.function.IntSupplier;

	class Task3 {
	    private String name;
	    private double price;
	    private String category;
	    private int grade;

	    public Task3(String name, double price, String category, int grade) {
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
	        IntSupplier randomIntBelow5000 = () -> new Random().nextInt(5000);
	       
	        int randomNumber = randomIntBelow5000.getAsInt();
	        System.out.println("Random Number below 5000: " + randomNumber);
	       
	        Task3 sampleProduct = new Task3("Sample Product", 25.99, "Electronics", 4);
	        System.out.println("Sample Product: " + sampleProduct);
	    }
	}



