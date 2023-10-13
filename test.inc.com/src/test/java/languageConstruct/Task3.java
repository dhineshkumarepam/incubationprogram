package languageConstruct;

public class Task3 {
	public static int party(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0; 
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        } else {
            return 1; 
        }
    }

    public static void main(String[] args) {
        int tea = 5;   
        int candy = 10; 

        int outcome = party(tea, candy);
        System.out.println("Outcome: " + outcome);
    }
}
