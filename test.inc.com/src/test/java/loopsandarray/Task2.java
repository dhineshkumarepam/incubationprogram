package loopsandarray;

public class Task2 {
	public static boolean canBalance(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int num : nums) {
            leftSum += num;
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 2, 1};
        int[] arr2 = {2, 1, 1, 2, 1};
        int[] arr3 = {10, 10};

        System.out.println(canBalance(arr1));
        System.out.println(canBalance(arr2)); 
        System.out.println(canBalance(arr3));
    }

}
