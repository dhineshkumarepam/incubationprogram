package java8Predicates;

public class Task5Product {
	 private String name;
	    private double price;
	    private String category;
	    private String grade;

	    public Task5Product(String name, double price, String category, String grade) {
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

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public double getPrice() {
	        return price;
	    }

	    public String getCategory() {
	        return category;
	    }
}
