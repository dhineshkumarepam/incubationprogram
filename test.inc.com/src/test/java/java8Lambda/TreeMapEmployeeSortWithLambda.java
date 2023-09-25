package java8Lambda;

	import java.util.*;
import java.util.stream.Collectors;


	public class TreeMapEmployeeSortWithLambda {
	    public static void main(String[] args) {
	        Set<TreeMapEmployee> employees = new HashSet<>();
	        employees.add(new TreeMapEmployee("John", 101));
	        employees.add(new TreeMapEmployee("Alice", 102));
	        employees.add(new TreeMapEmployee("Bob", 103));
	        employees.add(new TreeMapEmployee("Eva", 104));

	        TreeMap<TreeMapEmployee, Integer> treeMap = employees.stream()
	                .collect(Collectors.toMap(
	                        employee -> employee,
	                        TreeMapEmployee::getId,
	                        (e1, e2) -> e1, // Merge function (keep the existing entry)
	                        () -> new TreeMap<>(Comparator.comparing(TreeMapEmployee::getName).reversed())
	                ));

	        treeMap.forEach((key, value) -> System.out.println(key));
	    }
	}


