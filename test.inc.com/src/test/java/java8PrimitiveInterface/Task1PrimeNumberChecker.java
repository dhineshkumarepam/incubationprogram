package java8PrimitiveInterface;

public class Task1PrimeNumberChecker {
    public static void main(String[] args) {
        
        int number = 17;
        if (Task1Product.isPrime.test(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}