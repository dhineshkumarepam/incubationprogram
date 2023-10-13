package loopsandarray;

public class Task1 {
	   public static int maxSpan(int[] nums) {
	        int maxSpan = 0;

	        for (int i = 0; i < nums.length; i++) {
	            for (int j = nums.length - 1; j >= i; j--) {
	                if (nums[i] == nums[j]) {
	                    int span = j - i + 1;
	                    if (span > maxSpan) {
	                        maxSpan = span;
	                    }
	                    break; 
	                }
	            }
	        }

	        return maxSpan;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 1, 1, 3};
	        int[] arr2 = {1, 4, 2, 1, 4, 1, 4};
	        int[] arr3 = {1, 4, 2, 1, 4, 4, 4};

	        System.out.println(maxSpan(arr1)); 
	        System.out.println(maxSpan(arr2));
	        System.out.println(maxSpan(arr3)); 
	    }
}
