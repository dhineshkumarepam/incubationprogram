package languageConstruct;

public class Task10 {
	public static int sumNumbers(String str) {
        int sum = 0;
        StringBuilder numStr = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                numStr.append(c);
            } else if (numStr.length() > 0) {
                sum += Integer.parseInt(numStr.toString());
                numStr.setLength(0); 
            }
        }

        if (numStr.length() > 0) {
            sum += Integer.parseInt(numStr.toString());
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));  
        System.out.println(sumNumbers("aa11b33"));    
        System.out.println(sumNumbers("7 11"));  
    }
}
