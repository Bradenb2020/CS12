public class CardTester {
	public static void main(String[] args) {
		Card aceOfSpades=new Card(1,3);
		Card sevenOfDiamonds=new Card(7,1);
		Card jackOfClubs=new Card(11,0);
		System.out.println(aceOfSpades);
		System.out.println(sevenOfDiamonds);
		System.out.println(jackOfClubs);
		System.out.println(aceOfSpades.equals(sevenOfDiamonds));
		Card aceOfSpades2=new Card(1,3);
		System.out.println(aceOfSpades.equals(aceOfSpades2));
	}
}