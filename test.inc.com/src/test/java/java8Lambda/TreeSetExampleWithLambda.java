package java8Lambda;
import java.util.*;

public class TreeSetExampleWithLambda {
	

	    public static void main(String[] args) {
	        Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 2, 9, 1, 8, 3));

	        TreeSet<Integer> reversedSet = new TreeSet<>((a, b) -> Integer.compare(b, a));

	        reversedSet.addAll(numbers);

	        System.out.println("Numbers in reverse order: " + reversedSet);
	    }
	}


