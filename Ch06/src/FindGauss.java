public class FindGauss {
    public static void main(String[] args) {
    	System.out.print(Gauss(1,5));
    }
    public static double Gauss(double x, double n) {
    	int fact = 1;
    	int sign = 1;
    	double exp = 1.0;
    	double term = 0;
    	double sum = 1;
    	for(int i = 1; i < n; i++) {
    		fact *= i;
    		sign *= -1;
    		exp *= x * x;
    		term = (sign * exp) / fact;
    		sum += term;
    	}
    	return sum;
    }
}