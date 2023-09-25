package java8Lambda;

	
	import java.util.Scanner;

	public class PalindromeWithoutLambda {
		
		    public static void main(String[] args) {
		        String input = "racecar";
		        boolean isPalindrome = isPalindrome(input);

		        if (isPalindrome) {
		            System.out.println("The string is a palindrome.");
		        } else {
		            System.out.println("The string is not a palindrome.");
		        }
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




