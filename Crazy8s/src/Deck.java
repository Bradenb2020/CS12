import java.util.Random;

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
	public String toString() {
		String s="";
		for(Card card:cards) {
			s=s+card.toString()+", ";
		}
		return s;
	}
	private static int randomInt(int low,int high) {
		Random random=new Random();
		int r=random.nextInt((high-low)+1);
		return r;
	}
	private void swap(int i,int j) {
		Card temp=new Card(this.cards[i].getRank(),this.cards[i].getSuit());
		this.cards[i]=this.cards[j];
		this.cards[j]=temp;
	}
	public void shuffle() {
		for(int i=0;i<this.cards.length;i++) {
			swap(i,randomInt(i,this.cards.length-1));
		}
	}
	private int indexLowest(int low,int high) {
		int index=0;
		for(int i=low;i<high;i++) {
			if(this.cards[i].compareTo(this.cards[index])==-1) {
				index=i;
			}
		}
		return index;
	}
	public void selectionSort() {
		for(int i=0;i<this.cards.length;i++) {
			swap(i,indexLowest(i,this.cards.length-1));
		}
	}
	public Deck subdeck(int low,int high) {
		Deck sub=new Deck(high-low+1);
		for(int i=0;i<sub.cards.length;i++) {
			sub.cards[i]=this.cards[low+i];
		}
		return sub;
	}
	private static Deck merge(Deck d1,Deck d2) {
		Deck d3=new Deck(d1.cards.length+d2.cards.length);
		int i=0;
		int j=0;
		for(int k=0;k<d3.cards.length;k++) {
			if(d1.cards.length==0) {
				d3.cards[k]=d2.cards[j];
				j++;
			} else if(d2.cards.length==0) {
				d3.cards[k]=d1.cards[i];
				i++;
			} else if(d1.cards[i].compareTo(d2.cards[j])>0){
				d3.cards[k]=d1.cards[i];
				i++;
			} else if(d1.cards[i].compareTo(d2.cards[j])<0) {
				d3.cards[k]=d2.cards[j];
				j++;
			}
		}
		return d3;
	}
}