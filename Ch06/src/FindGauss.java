public class FindGauss {
    public static void main(String[] args) {
    	System.out.println(Gauss(3,2));
    }
    public static double Gauss(int x, int n) {
    	double total = 0;
    	for(int i = 1; i <= n; i++) {
    		double negOneToI = -1;
    		for(int q = 1; q < i; q++) {
    			negOneToI = negOneToI * -1;
    		}
    		int xTo2I = x;
    		for(int j = 1; j < (2 * i); j++) {
    			xTo2I = xTo2I * x;
    		}
    		double ithTerm = (negOneToI * xTo2I) / i;
    		total += ithTerm;
    	}
    	return total;
    }
}