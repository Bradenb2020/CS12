public class Time {
	private int hour;
	private int minute;
	private double second;
	
	public Time() {
		this(0,0,0.0);
	}
	public Time(int hour,int minute,double second) {
		if(hour>23||hour>=60||second>=60.0) {
			//throw new IllegalArgumentException();
		}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public String toString() {
		return String.format("%02d:%02d:%04.1f\n",this.hour,this.minute,this.second);
	}
	public boolean equals(Time that) {
		return this.hour==that.hour&&this.minute==that.minute&&this.second==that.second;
	}
	public Time add(Time that) {
		Time sum=new Time();
		sum.hour=this.hour+that.hour;
		sum.minute=this.minute+that.minute;
		sum.second=this.second+that.second;
		if(sum.second>=60.0) {
			sum.second-=60.0;
			sum.minute+=1;
		}
		if(sum.minute>=60) {
			sum.minute-=60;
			sum.hour+=1;
		}
		if(sum.hour>23) { 
			sum.hour-=24;
		}
		return sum;
	}
}