package java8Lambda;
import java.util.function.Predicate;

public class PalindromeWithLambda {

	    public static void main(String[] args) {
	        String input = "racecar";

	        Predicate<String> isPalindrome = str -> {
	            str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	            int left = 0;
	            int right = str.length() - 1;

	            while (left < right) {
	                if (str.charAt(left) != str.charAt(right)) {
	                    return false;
	                }
	                left++;
	                right--;
	            }
	            return true;
	        };

	        boolean result = isPalindrome.test(input);

	        String message = result ? "The string is a palindrome." : "The string is not a palindrome.";
	        System.out.println(message);
	    }
	}

	

	

