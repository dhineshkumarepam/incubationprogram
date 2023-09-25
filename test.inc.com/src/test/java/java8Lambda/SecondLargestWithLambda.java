package java8Lambda;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestWithLambda {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(30);

        if (numbers.size() >= 2) {
            int secondLargest = numbers.stream()
                .sorted((a, b) -> b.compareTo(a))
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(-1);

            if (secondLargest != -1) {
                System.out.println("Second largest number is: " + secondLargest);
            } else {
                System.out.println("List does not have a second largest number.");
            }
        } else {
            System.out.println("List does not have a second largest number.");
        }
    }
}

