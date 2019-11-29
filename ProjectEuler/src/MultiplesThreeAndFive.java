public class MultiplesThreeAndFive {
	public static void main(String[] args) {
		System.out.println(MultiplesSum(3,5,1000));
	}
	public static int MultiplesSum(int a,int b,int c) {
		int sum=0;
		for(int i=0;i<c;i+=a) {
			sum+=i;
		}
		for(int i=0;i<c;i+=b) {
			sum+=i;
		}
		for(int i=0;i<c;i+=a*b) {
			sum-=i;
		}
		return sum;
	}
}