public class Tile {
	private char letter;
	private int value;
	
	public Tile(char letter,int value) {
		this.letter=letter;
		this.value=value;
	}
	public String printTile() {
		return String.format("Letter: %c Value: %01d\n",this.letter,this.value);
	}
	public boolean equals(Tile that) {
		return this.letter==that.letter&&this.value==that.value;
	}
	public String toString() {
		return String.format("Letter: %c Value: %01d\n",this.letter,this.value);
	}
	public void setLetter(char letter) {
		this.letter=letter;
	}
	public char getLetter() {
		return letter;
	}
	public void setValue(int value) {
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}