package java8Lambda;
import java.util.*;

public class EmployeeTreeSetWithLambda {
	
	    public static void main(String[] args) {
	        Set<EmployeeTree> employees = new TreeSet<>((e1, e2) -> e1.getName().compareTo(e2.getName()));
	        employees.add(new EmployeeTree("John"));
	        employees.add(new EmployeeTree("Alice"));
	        employees.add(new EmployeeTree("Bob"));
	        employees.add(new EmployeeTree("Charlie"));

	        employees.forEach(employee -> System.out.println(employee.getName()));
	    }
	}

