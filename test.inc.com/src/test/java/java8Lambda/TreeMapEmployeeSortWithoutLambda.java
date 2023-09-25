package java8Lambda;

	import java.util.*;

	class Employee implements Comparable<Employee> {
	    private String name;
	    private int id;

	    public Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getId() {
	        return id;
	    }

	    @Override
	    public int compareTo(Employee other) {
	        return other.getName().compareTo(this.getName()); 
	    }

	    @Override
	    public String toString() {
	        return "Employee [name=" + name + ", id=" + id + "]";
	    }
	}

	public class TreeMapEmployeeSortWithoutLambda {
	    public static void main(String[] args) {
	        Set<Employee> employees = new HashSet<>();
	        employees.add(new Employee("John", 101));
	        employees.add(new Employee("Alice", 102));
	        employees.add(new Employee("Bob", 103));
	        employees.add(new Employee("Eva", 104));

	        TreeMap<Employee, Integer> treeMap = new TreeMap<>();
	        for (Employee employee : employees) {
	            treeMap.put(employee, employee.getId());
	        }

	        for (Map.Entry<Employee, Integer> entry : treeMap.entrySet()) {
	            System.out.println(entry.getKey());
	        }
	    }
	}


