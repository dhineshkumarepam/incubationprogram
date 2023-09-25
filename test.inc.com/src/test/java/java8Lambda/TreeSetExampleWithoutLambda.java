package java8Lambda;

	import java.util.*;

	public class TreeSetExampleWithoutLambda {
	    public static void main(String[] args) {
	        Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 2, 9, 1, 8, 3));

	        TreeSet<Integer> reversedSet = new TreeSet<>(new Comparator<Integer>() {
	            @Override
	            public int compare(Integer a, Integer b) {
	                return b.compareTo(a);
	            }
	        });

	        reversedSet.addAll(numbers);

	        System.out.println("Numbers in reverse order: " + reversedSet);
	    }
	}

	
	

