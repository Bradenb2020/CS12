
public class Doubloon {

	public static void main(String[] args) {
		System.out.println(isDoubloon("toto"));
	}
	public static boolean isDoubloon(String s) {
		for(int i = 0; i < s.length(); i++) {
			int howMany = 0;
			for(int q = 0; q < s.length(); q++) {
				if(s.charAt(i) == s.charAt(q)) {
					howMany++;
				}
			}
			if(howMany != 2) {
				return false;
			}
		}
		return true;
	}

}