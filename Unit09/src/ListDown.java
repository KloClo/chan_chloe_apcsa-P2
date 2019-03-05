//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		int num = numArray.get(0);
		
		for (int x = 1; x < numArray.size(); x++)
		{
			if (num <= numArray.get(x))
			{
				return false;
			}
		}
		
		return true;
	}	
}