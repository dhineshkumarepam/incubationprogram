package java8Lambda;

public class PalindromeWithLambda {

	    public static void main(String[] args) {
	        String input = "racecar"; // Replace with your input string

	        boolean isPalindrome = isPalindrome(input);

	        String result = isPalindrome ? "The string is a palindrome." : "The string is not a palindrome.";
	        System.out.println(result);
	    }

	    
	    public static boolean isPalindrome(String str) {
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
	    }
	}

