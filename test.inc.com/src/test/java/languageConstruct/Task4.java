package languageConstruct;

public class Task4 {
	public static int evaluateTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10) {
            return 10; 
        } else if (a + b == b + c + 10 || a + b == a + c + 10) {
            return 5; 
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int a = 2; 
        int b = 8; 
        int c = 3; 

        int result = evaluateTicket(a, b, c);
        System.out.println("Result: " + result);
    }
}
