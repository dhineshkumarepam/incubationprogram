package java8Lambda;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;


	public class CollectionEmployeeSortingWithoutLambda {
	    public static void main(String[] args) {
	        List<CollectionEmployee> employees = new ArrayList<>();
	        employees.add(new CollectionEmployee("John"));
	        employees.add(new CollectionEmployee("Alice"));
	        employees.add(new CollectionEmployee("Bob"));
	        employees.add(new CollectionEmployee("Eve"));

	        Collections.sort(employees, new Comparator<CollectionEmployee>() {
	            @Override
	            public int compare(CollectionEmployee e1, CollectionEmployee e2) {
	                return e2.getName().compareTo(e1.getName());
	            }
	        });

	        for (CollectionEmployee employee : employees) {
	            System.out.println(employee);
	        }
	    }
	}


