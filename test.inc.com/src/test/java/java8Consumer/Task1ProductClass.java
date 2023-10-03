package java8Consumer;

	class Task1ProductClass {
	    private String name;
	    private double price;
	    private String category;
	    private int grade;

	    public Task1ProductClass(String name, double price, String category, int grade) {
	        this.name = name;
	        this.price = price;
	        this.category = category;
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
	}



