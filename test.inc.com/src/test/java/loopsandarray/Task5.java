package loopsandarray;

public class Task5 {
	public static boolean linearIn(int[] outer, int[] inner) {
        int outerIndex = 0;
        int innerIndex = 0;

        while (outerIndex < outer.length && innerIndex < inner.length) {
            if (outer[outerIndex] == inner[innerIndex]) {
                innerIndex++;
            }
            outerIndex++;
        }

        return innerIndex == inner.length;
    }

    public static void main(String[] args) {
        int[] outer1 = {1, 2, 4, 6};
        int[] inner1 = {2, 4};
        int[] outer2 = {1, 2, 4, 6};
        int[] inner2 = {2, 3, 4};
        int[] outer3 = {1, 2, 4, 4, 6};
        int[] inner3 = {2, 4};

        System.out.println(linearIn(outer1, inner1)); 
        System.out.println(linearIn(outer2, inner2)); 
        System.out.println(linearIn(outer3, inner3)); 
    }
}
