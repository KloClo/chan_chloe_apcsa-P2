//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		//condition 3: GCF for all is no greater than 1

		return 1;
	}

	public String toString()
	{
		String output = "";
		
		for (int a = 1; a <= number; a++) 
		{
			for (int b = a+1; b <= number; b++)
			{
				for (int c = b+1; c <= number; c++)
				{
					
				}
			}
		}
		
		//condition 1: a^2 + b^2 == c^2
		
		//condition 2: a odd, b even; a even, b odd; c odd

		

		return output+"\n";
	}
}