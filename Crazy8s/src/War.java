public class War {
	public static void main(String[] args) {
		Deck d=new Deck();
		d.shuffle();
		Pile p1=new Pile();
		p1.addDeck(d.subdeck(0,25));
		Pile p2=new Pile();
		p2.addDeck(d.subdeck(26, 51));
		
		while(p1.size()>0&&p2.size()>0) {
			Card c1=p1.popCard();
			Card c2=p2.popCard();
			int dif=c1.getRank()-c2.getRank();
			Pile war=new Pile();
			while(dif==0) {
				if(p1.size()<4) {
					System.out.println("Player 2 wins");
				} else if(p2.size()<4) {
					System.out.println("Player 1 wins");
				} else {
					war.addCard(c1);
					war.addCard(c2);
					for(int i=0;i<3;i++) {
						war.addCard(p1.popCard());
						war.addCard(p2.popCard());
					}
					c1=p1.popCard();
					c2=p2.popCard();
					dif=c1.getRank()-c2.getRank();
				}
			}
			if(dif>0) {
				while(war.size()>0) p1.addCard(war.popCard());
				p1.addCard(c1);
				p1.addCard(c2);
				
			} else if(dif<0) {
				while(war.size()>0) p2.addCard(war.popCard());
				p2.addCard(c1);
				p2.addCard(c2);
			}
		}
		if(p1.size()>0) {
			System.out.println("Player 1 wins");
		} else if(p2.size()>0){
			System.out.println("Player 2 wins");
		}
	}
}