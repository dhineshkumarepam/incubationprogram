package loopsandarray;

public class Task3 {
	public static int countClumps(int[] nums) {
        int clumps = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    inClump = true;
                    clumps++;
                }
            } else {
                inClump = false;
            }
        }

        return clumps;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 4};
        int[] arr2 = {1, 1, 2, 1, 1};
        int[] arr3 = {1, 1, 1, 1, 1};

        System.out.println(countClumps(arr1)); 
        System.out.println(countClumps(arr2)); 
        System.out.println(countClumps(arr3));
    }
}
