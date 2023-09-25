package java8Lambda;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class SecondLargestWithoutLambda {
	    public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(5);
	        numbers.add(20);
	        numbers.add(15);
	        numbers.add(30);

	        Collections.sort(numbers, Collections.reverseOrder());
	        
	        if (numbers.size() >= 2) {
	            int secondLargest = numbers.get(1);
	            System.out.println("Second largest number is: " + secondLargest);
	        } else {
	            System.out.println("List does not have a second largest number.");
	        }
	    }
	}



