package java8Lambda;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	

	public class InterfaceEmployeeListSortWithLambda {
	    public static void main(String[] args) {
	        List<InterfaceEmployee> employees = new ArrayList<>();
	        employees.add(new InterfaceEmployee("John"));
	        employees.add(new InterfaceEmployee("Alice"));
	        employees.add(new InterfaceEmployee("Bob"));
	       
	        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));

	        
	        for (InterfaceEmployee employee : employees) {
	            System.out.println(employee.getName());
	        }
	    }
	}

	

