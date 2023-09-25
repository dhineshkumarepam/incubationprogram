package java8Lambda;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	

	public class CollectionEmployeeSortingWithLambda {
	    public static void main(String[] args) {
	        List<CollectionEmployee> employees = new ArrayList<>();
	        employees.add(new CollectionEmployee("John"));
	        employees.add(new CollectionEmployee("Alice"));
	        employees.add(new CollectionEmployee("Bob"));
	        employees.add(new CollectionEmployee("Eve"));

	        
	        Collections.sort(employees, (e1, e2) -> e2.getName().compareTo(e1.getName()));

	       
	        employees.forEach(System.out::println);
	    }
	}

	

