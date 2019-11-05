import java.util.Arrays;

public class Sieve {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(Arrays.toString(sieve(n)));
	}
	public static boolean[] sieve(int n) {
		boolean[] a = new boolean[n+1];
		for(int i=2;i<a.length;i++) {
			a[i] = true;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(a[i]==true) {
				for(int j=i*i;j<=n;j+=i) {
					a[j]=false;
				}
			}
		}
		return a;
	}
}