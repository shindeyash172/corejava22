package longestseq;

public class Longestseq {

	public static void main(String[] args) {
		String input = "acccccccccdwrrrgddeee";
		char[] chars = input.toCharArray();

		char currChar = chars[0];
		int currCount = 1;
		char longestChar = chars[0];
		int longestCount = 1;

		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == currChar) {
				currCount++;
			} else {
				currChar = chars[i];
				currCount = 1;
			}

			if (currCount > longestCount) {
				longestChar = currChar;
				longestCount = currCount;
			}
		}

		System.out.println("Longest seq " + longestChar + " (" + longestCount + " times)");
	}

}
