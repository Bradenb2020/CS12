import java.util.ArrayList;

public class Pile {
	private ArrayList<Card> cards;
	
	public Pile() {
		cards=new ArrayList<Card>();
	}
	public void addCard(Card card) {
		cards.add(card);
	}
	public Card popCard() {
		return cards.remove(0);
	}
	public int size() {
		return cards.size();
	}
	public void addDeck(Deck deck) {
		for(Card card:deck.getCards()) {
			cards.add(card);
		}
	}
}