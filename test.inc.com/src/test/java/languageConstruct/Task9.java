package languageConstruct;

public class Task9 {
	public static int maxBlock(String str) {
        int maxBlockLength = 0;
        int currentBlockLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentBlockLength++; 
            } else {
                currentBlockLength = 1;
            }

            maxBlockLength = Math.max(maxBlockLength, currentBlockLength); 
        }

        return maxBlockLength;
    }

    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));  
        System.out.println(maxBlock("abbCCCddBBBxx")); 
        System.out.println(maxBlock("")); 
    }
}
