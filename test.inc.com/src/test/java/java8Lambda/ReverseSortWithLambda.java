package java8Lambda;

	import java.util.ArrayList;
	import java.util.Collections;
import java.util.Comparator;
import java.util.List;

	public class ReverseSortWithLambda {
	    public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(5);
	        numbers.add(2);
	        numbers.add(8);
	        numbers.add(1);
	        numbers.add(9);

	        Comparator<Integer> comparator = (num1, num2) -> num2.compareTo(num1); // Reverse order

	        Collections.sort(numbers, comparator);

	        for (Integer number : numbers) {
	            System.out.println(number);
	        }
	    }
	}



