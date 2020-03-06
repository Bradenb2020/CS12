public class SmartPlayer extends Player {
	public SmartPlayer(String name) {
		super(name);
	}
	public Card searchForMatch(Card prev) {
		for(int i=0;i<hand.size();i++) {
			Card card=hand.getCard(i);
			if(card.getRank()==8) {
				return hand.popCard();
			}
		}
		for(int i=0;i<hand.size();i++) {
			Card card=hand.getCard(i);
			if(cardMatches(card,prev)&&card.getRank()>=10) {
				return hand.popCard(i);
			}
		}
		for(int i=0;i<hand.size();i++) {
			Card card=hand.getCard(i);
			if(cardMatches(card,prev)) {
				return hand.popCard();
			}
		}
		return null;
	}
}