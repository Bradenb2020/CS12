public class Tile {
	private char letter;
	private int value;
	
	public Tile(char letter,int value) {
		this.letter=letter;
		this.value=value;
	}
	public String printTile() {
		return String.format("%c",this.letter);
	}
}