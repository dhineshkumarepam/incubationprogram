package java8Lambda;
import java.util.*;

	public class TreeMapDescendingWithLambda {
	    public static void main(String[] args) {
	        
	        TreeSet<Integer> treeSet = new TreeSet<>((o1, o2) -> o2.compareTo(o1));

	        // Add values to the TreeSet
	        treeSet.add(5);
	        treeSet.add(2);
	        treeSet.add(9);
	        treeSet.add(1);
	        treeSet.add(7);

	        treeSet.forEach(System.out::println);
	    }
	}


