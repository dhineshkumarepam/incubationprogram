package languageConstruct;

public class Task6 {
	 public static boolean shareDigit(int a, int b) {
	        int aLeftDigit = a / 10;
	        int aRightDigit = a % 10;
	        int bLeftDigit = b / 10;
	        int bRightDigit = b % 10;

	        return (aLeftDigit == bLeftDigit || aLeftDigit == bRightDigit || aRightDigit == bLeftDigit || aRightDigit == bRightDigit);
	    }

	    public static void main(String[] args) {
	        System.out.println(shareDigit(12, 23)); 
	        System.out.println(shareDigit(12, 43)); 
	        System.out.println(shareDigit(12, 44)); 
	    }
}
