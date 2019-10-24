public class Scrabble {
	public static void main(String[] args) {
		System.out.print(canSpell("apple", "apple"));
	}
	public static boolean canSpell(String word, String tiles) {
		word = word.toLowerCase();
		tiles = tiles.toLowerCase();
		for(int i = 0; i < word.length(); i++) {
			int index = tiles.indexOf(word.charAt(i));
			if(index < 0) {
				return false;
			} else {
				tiles = tiles.substring(0,index) + tiles.substring(index + 1);
			}
		}
		return true;
	}
}
