public class TileTest {
	public static void main(String[] args) {
		Tile t1=new Tile('Z',10);
		System.out.print(t1);
		t1.setLetter('A');
		t1.setValue(3);
		Tile t2=new Tile('A',3);
		System.out.print(t1);
		System.out.print(t2);
		System.out.println(t1.equals(t2));
	}
}