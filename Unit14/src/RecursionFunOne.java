//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		int last = num%10;
		if (num > 0)
		{
			if (last%2 == 0) return 1 + countEvenDigits((int)((num-last)/10));
			return 0 + countEvenDigits((int)((num-last)/10));
		}

		return 0;
	}
}