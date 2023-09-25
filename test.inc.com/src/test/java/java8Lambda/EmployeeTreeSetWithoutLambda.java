package java8Lambda;

	import java.util.*;

	

	public class EmployeeTreeSetWithoutLambda {
	    public static void main(String[] args) {
	        Set<EmployeeTree> employees = new TreeSet<>();
	        employees.add(new EmployeeTree("John"));
	        employees.add(new EmployeeTree("Alice"));
	        employees.add(new EmployeeTree("Bob"));
	        employees.add(new EmployeeTree("Charlie"));

	        for (EmployeeTree employee : employees) {
	            System.out.println(employee.getName());
	        }
	    }
	}

