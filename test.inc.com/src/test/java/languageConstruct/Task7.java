package languageConstruct;

public class Task7 {
	public static int sumLimit(int a, int b) {
		String aStr = String.valueOf(a);
		String sumStr = String.valueOf(a + b);

		if (sumStr.length() == aStr.length()) {
			return a + b;
		} else {
			return a;
		}
	}

	public static void main(String[] args) {
		System.out.println(sumLimit(2, 3));
		System.out.println(sumLimit(8, 3));
		System.out.println(sumLimit(8, 1));
	}
}
