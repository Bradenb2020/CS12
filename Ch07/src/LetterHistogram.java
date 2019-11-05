import java.util.Arrays;

public class LetterHistogram {
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(Arrays.toString(Histogram(str)));
	}
	public static int[] Histogram(String s) {
		int[] letters = new int[26];
		s = s.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0;i<s.length();i++) {
			for(int j = 0;j<alphabet.length();j++) {
				if(s.charAt(i) == alphabet.charAt(j)) {
					letters[j]++;
				}
			}
		}
		return letters;
	}
}