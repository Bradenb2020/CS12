public class Card {
	private int rank;
	private int suit;
	public static final String[] SUITS={"clubs","diamonds","hearts","spades"};
	public static final String[] RANKS= {null,"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	
	public Card(int rank,int suit) {
		this.rank=rank;
		this.suit=suit;
	}
	public String toString() {
		return RANKS[this.rank]+" of "+SUITS[this.suit];
	}
	public boolean equals(Card that) {
		return this.rank==that.rank&&this.suit==that.suit;
	}
}