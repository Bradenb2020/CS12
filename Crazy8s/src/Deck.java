public class Deck {
	private Card[] cards;
	
	public Deck(int n) {
		this.cards=new Card[n];
	}
	public Deck() {
		this.cards=new Card[52];
		int index=0;
		for(int suit=0;suit<=3;suit++) {
			for(int rank=1;rank<=13;rank++) {
				this.cards[index]=new Card(rank,suit);
				index++;
			}
		}
	}
	public Card[] getCards() {
		return this.cards;
	}
	public void print() {
		for(Card card:cards) {
			System.out.println(card);
		}
	}
	public Deck subdeck(int low,int high) {
		Deck sub=new Deck(high-low+1);
		for(int i=0;i<sub.cards.length;i++) {
			sub.cards[i]=this.cards[low+i];
		}
		return sub;
	}
	//private static Deck merge(Deck d1,Deck d2) {
		//create a new deck big enough for all the cards
		//use i to keep track of where we are in the first deck
		//use j to keep track of where we are in the second deck
	//	int i=0;
	//	int j=0;
		//k traverses the result deck
	//	for(int k=0;k<d3.length;k++) {
			//if d1 is empty use top of d2
			//if d2 is empty use top of d1
			//otherwise compare top cards
			//add lowest card to new deck at k
			//increment i or j depending on card
	//	}
		//return the new deck
	//}
	public String toString() {
		String s="";
		for(Card card:cards) {
			s=s+card.toString()+", ";
		}
		return s;
	}
}