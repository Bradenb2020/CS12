import java.util.Arrays;

public class Sieve {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(Arrays.toString(sieve(n)));
	}
	public static boolean[] sieve(int n) {
		boolean[] a = new boolean[n];
		for(int i=0;i<a.length;i++) {
			a[i] = true;
		}
		//for(int i=2;i<)
		return a;
	}
}
