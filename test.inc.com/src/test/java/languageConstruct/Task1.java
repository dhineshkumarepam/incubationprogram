package languageConstruct;

public class Task1 {
	 public static int caughtSpeeding(int speed, boolean isBirthday) {
	        if (isBirthday) {
	            speed -= 5;  
	        }

	        if (speed <= 60) {
	            return 0;
	        } else if (speed >= 61 && speed <= 80) {
	            return 1;
	        } else {
	            return 2;
	        }
	    }

	    public static void main(String[] args) {
	        int speed = 65;  
	        boolean isBirthday = false; 

	        int result = caughtSpeeding(speed, isBirthday);
	        System.out.println("Result: " + result);
	    }

}
