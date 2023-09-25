package java8Lambda;

	public class RotationCheckWithLambda {
	    interface RotationChecker {
	        boolean check(String str1, String str2);
	    }

	    public static void main(String[] args) {
	        RotationChecker areRotations = (str1, str2) -> {
	            if (str1.length() != str2.length()) {
	                return false;
	            }
	            
	            String concatenated = str1 + str1;
	            return concatenated.contains(str2);
	        };

	        String str1 = "abcde";
	        String str2 = "cdeab";

	        if (areRotations.check(str1, str2)) {
	            System.out.println("The strings are rotations of each other.");
	        } else {
	            System.out.println("The strings are not rotations of each other.");
	        }
	    }
	}



