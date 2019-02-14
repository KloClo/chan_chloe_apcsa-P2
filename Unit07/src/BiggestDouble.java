//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a, b, c, d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		//Compare four doubles with && || !
		double big = 0;
		
		if (one>two && one>three && one>four) {
			big = one; 
		}
		else if (two>one && two>three && two>four) {
			big = two;
		}
		else if (three>one && three>two && three>four) {
			big = three;
		}
		else {
			big = four;
		}
		
		return big;
	}

	public String toString()
	{
	   return one+" "+two+" "+three+" "+four;
	}
}