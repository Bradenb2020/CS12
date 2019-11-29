public class EvenFibonnaci {
	public static void main(String[] args) {
		System.out.println(sumEvenFibonacci(4000000));
	}
	public static int sumEvenFibonacci(int limit) {
		int sum=0;
		int i1=1;
		int i2=2;
		while(i1<limit||i2<limit) {
			if(i1%2==0) sum+=i1;
			i1+=i2;
			if(i2%2==0) sum+=i2;
			i2+=i1;
		}
		return sum;
	}
}