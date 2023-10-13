package languageConstruct;

public class Task8 {
	 public static String withoutString(String base, String remove) {
	        String lowerBase = base.toLowerCase();
	        String lowerRemove = remove.toLowerCase();

	        StringBuilder result = new StringBuilder();
	        int i = 0;
	        int removeLength = remove.length();

	        while (i < base.length()) {
	            int index = lowerBase.indexOf(lowerRemove, i);
	            if (index == -1) {
	                result.append(base.substring(i));
	                break;
	            }
	            result.append(base.substring(i, index));
	            i = index + removeLength;
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println(withoutString("Hello there", "llo"));  
	        System.out.println(withoutString("Hello there", "e"));   
	        System.out.println(withoutString("Hello there", "x"));  
	    }
}
