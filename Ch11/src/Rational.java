public class Rational {
	private int numerator;
	private int denominator;
	
	public Rational(int numerator,int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	public Rational() {
		this(0,1);
	}
	public String printRational() {
		return String.format("%01d/%01d\n",this.numerator,this.denominator);
	}
	public String toString() {
		return String.format("%01d/%01d\n",this.numerator,this.denominator);
	}
	public void negate() {
		this.numerator=this.numerator*-1;
	}
	public void invert() {
		int r=this.denominator;
		this.denominator=this.numerator;
		this.numerator=r;
	}
	public double toDouble() {
		double n=this.numerator;
		double d=this.denominator;
		return n/d;
	}
	public Rational reduce() {
		int m=this.numerator;
		int n=this.denominator;
		int r=0;
		if(m<n) {
			r=n;
			n=m;
			m=r;
		}
		while(n!=0) {
			r=m%n;
			m=n;
			n=r;
		}
		Rational result=new Rational(this.numerator/m,this.denominator/m);
		return result;
	}
}