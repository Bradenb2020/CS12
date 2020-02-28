import java.util.ArrayList;
import java.util.Random;

public class CardCollection {
	private String label;
	private ArrayList<Card> cards;
	
	public CardCollection(String label) {
		label=label;
		cards=new ArrayList<Card>();
	}
	public void addCard(Card card) {
		cards.add(card);
	}
	public int size() {
		return cards.size();
	}
	public Card popCard(int i) {
		return cards.remove(i);
	}
	public Card popCard() {
		int i=size()-1;
		return popCard(i);
	}
	public boolean empty() {
		return cards.size()==0;
	}
	public Card getCard(int i) {
		return cards.get(i);
	}
	public Card lastCard() {
		int i=size()-1;
		return cards.get(i);
	}
	public void swapCards(int i,int j) {
		Card t=cards.get(i);
		cards.set(i,cards.get(j));
		cards.set(j,t);
	}
	public void shuffle() {
		Random r=new Random();
		for(int i=size()-1;i>0;i--) {
			int j=r.nextInt(i);
			swapCards(i,j);
		}
	}
}