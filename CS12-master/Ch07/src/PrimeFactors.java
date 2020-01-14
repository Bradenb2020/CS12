public class PrimeFactors {
	public static void main(String[] args) {
		int n = 10;
		int[] a = {2,5};
		System.out.println(arePrimeFactors(n,a));
	}
	public static boolean arePrimeFactors(int n, int[] a) {
		boolean[] primes = sieve(n);
		for(int i = 0;i<a.length;i++) {
			if((n % a[i]) == 0 && primes[a[i]]) {
				
			}else{
				return false;
			}
		}
		return true;
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