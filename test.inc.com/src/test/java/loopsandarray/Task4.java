package loopsandarray;

public class Task4 {
	public static int maxMirror(int[] nums) {
        int maxMirrorSize = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int count = 0;
                int startIndexI = i;
                int startIndexJ = j;

                while (startIndexI < nums.length && startIndexJ >= 0 && nums[startIndexI] == nums[startIndexJ]) {
                    count++;
                    startIndexI++;
                    startIndexJ--;
                }

                if (count > maxMirrorSize) {
                    maxMirrorSize = count;
                }
            }
        }

        return maxMirrorSize;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 8, 9, 3, 2, 1};
        int[] arr2 = {1, 2, 1, 4};
        int[] arr3 = {7, 1, 2, 9, 7, 2, 1};

        System.out.println(maxMirror(arr1)); 
        System.out.println(maxMirror(arr2)); 
        System.out.println(maxMirror(arr3)); 
    }

}
