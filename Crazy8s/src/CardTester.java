import java.util.Arrays;
public class CardTester {
	public static void main(String[] args) {
		Card[] deck=new Card[52];
		int index=0;
		for(int suit=0;suit<=3;suit++) {
			for(int rank=1;rank<=13;rank++) {
				deck[index]=new Card(rank,suit);
				index++;
			}
		}
		printDeck(deck);
		System.out.println(Arrays.toString(deck));
	}
	public static void printDeck(Card[] cards) {
	    for (Card card:cards) {
	        System.out.println(card);
	    }
	}
}