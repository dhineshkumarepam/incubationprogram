package java8Lambda;

public class CollectionEmployee {
	
	    private String name;

	    public CollectionEmployee(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "name='" + name + '\'' +
	                '}';
	    }
	
}
