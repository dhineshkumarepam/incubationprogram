package languageConstruct;

public class Task2 {
	 public static boolean isGreatNumber(int a, int b) {
	        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
	    }

	    public static void main(String[] args) {
	        int a = 5;
	        int b = 11;

	        boolean result = isGreatNumber(a, b);
	        System.out.println("Result: " + result);
	    }
}
