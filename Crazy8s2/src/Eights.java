import java.util.Scanner;

public class Eights {
	private Player one;
	private SmartPlayer two;
	private Hand drawPile;
	private Hand discardPile;
	private Scanner in;
	
	public Eights() {
		int handSize=5;
		in=new Scanner(System.in);
		System.out.println("Enter player one's name: ");
		one=new Player("a");
		System.out.println("Enter player two's name: ");
		two=new SmartPlayer("b");
		Deck deck = new Deck("Deck");
		deck.shuffle();
		deck.deal(one.getHand(),handSize);
		deck.deal(two.getHand(),handSize);
		discardPile=new Hand("Discard Pile");
		deck.deal(discardPile,1);
		drawPile=new Hand("Draw Pile");
		deck.dealAll(drawPile);
	}
	public boolean isDone() {
		return one.getHand().empty()||two.getHand().empty();
	}
	public void	reshuffle() {
		Card prev=discardPile.popCard();
		discardPile.dealAll(drawPile);
		discardPile.addCard(prev);
		drawPile.shuffle();
	}
	public Card drawCard() {
		if(drawPile.empty()) {
			reshuffle();
		}
		return drawPile.popCard();
	}
	public Player nextPlayer(Player current) {
	    if (current==one) {
	        return two;
	    } else {
	        return one;
	    }
	}
	public void displayState() {
		System.out.println(one.getName()+"'s hand: ");
		one.getHand().display();
		System.out.println(two.getName()+"'s hand: ");
		two.getHand().display();
		System.out.println(discardPile.getLabel()+": ");
		discardPile.display();
		System.out.printf("Draw Pile has %d cards.\n",drawPile.size());
	}
	public void takeTurn(Player player) {
	    Card prev = discardPile.lastCard();
	    Card next = player.play(this,prev);
	    discardPile.addCard(next);

	    System.out.println(player.getName()+" plays "+next);
	    System.out.println();
	}
	public void playGame() {
	    Player player = one;
	    while (!isDone()) {
	        displayState();
	        takeTurn(player);
	        player = nextPlayer(player);
	    }
	    one.displayScore();
	    two.displayScore();
	}
}