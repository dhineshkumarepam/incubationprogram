package languageConstruct;

public class Task9 {
	public static int maxBlock(String str) {
		int maxBlockSize = 0;
		int currentBlockSize = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				currentBlockSize++;
			} else {
				maxBlockSize = Math.max(maxBlockSize, currentBlockSize);
				currentBlockSize = 1;
			}
		}

		maxBlockSize = Math.max(maxBlockSize, currentBlockSize);

		return maxBlockSize;
	}

	public static void main(String[] args) {
		System.out.println(maxBlock("hoopla"));
		System.out.println(maxBlock("abbCCCddBBBxx"));
		System.out.println(maxBlock(""));
	}
}
