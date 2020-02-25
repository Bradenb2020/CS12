import java.util.Random;

public class Deck {
	private Card[] cards;
	
	public Deck(int n) {
		cards=new Card[n];
	}
	public Deck() {
		cards=new Card[52];
		int index=0;
		for(int suit=0;suit<=3;suit++) {
			for(int rank=1;rank<=13;rank++) {
				cards[index]=new Card(rank,suit);
				index++;
			}
		}
	}
	public Card[] getCards() {
		return cards;
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
		Card temp=new Card(cards[i].getRank(),cards[i].getSuit());
		cards[i]=cards[j];
		cards[j]=temp;
	}
	public void shuffle() {
		for(int i=0;i<cards.length;i++) {
			swap(i,randomInt(i,cards.length-1));
		}
	}
	private int indexLowest(int low,int high) {
		int index=0;
		for(int i=low;i<high;i++) {
			if(cards[i].compareTo(cards[index])==-1) {
				index=i;
			}
		}
		return index;
	}
	public void selectionSort() {
		for(int i=0;i<cards.length;i++) {
			swap(i,indexLowest(i,cards.length-1));
		}
	}
	public Deck subdeck(int low,int high) {
		Deck sub=new Deck(high-low+1);
		for(int i=0;i<sub.cards.length;i++) {
			sub.cards[i]=cards[low+i];
		}
		return sub;
	}
	private static Deck merge(Deck d1,Deck d2) {
		Deck d3=new Deck(d1.cards.length+d2.cards.length);
		int i=0;
		int j=0;
		for(int k=0;k<d3.cards.length;k++) {
			if(i==d1.cards.length) {
				d3.cards[k]=d2.cards[j];
				j++;
			} else if(j==d2.cards.length) {
				d3.cards[k]=d1.cards[i];
				i++;
			} else if(d1.cards[i].compareTo(d2.cards[j])<0){
				d3.cards[k]=d1.cards[i];
				i++;
			} else {
				d3.cards[k]=d2.cards[j];
				j++;
			}
		}
		return d3;
	}
	public Deck mergeSort() {
		if(cards.length<=1) return this;
		Deck sub1=subdeck(0,(cards.length/2)-1);
		Deck sub2=subdeck((cards.length/2),cards.length-1);
		sub1=sub1.mergeSort();
		sub2=sub2.mergeSort();
		return merge(sub1,sub2);
	}
	public void insertionSort() {
		for(int i=1;i<cards.length;i++) {
			int j=i;
			Card temp=cards[i];
			while(j>0) {
				if(cards[i].compareTo(cards[j-1])<0) {
					j--;
				} else {
					break;
				}
			}
			int k=i;
			while(k>j) {
				cards[k]=cards[k-1];
				k--;
			}
			cards[k]=temp;
		}
	}
}