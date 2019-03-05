//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		
		if (ray.size() == 0) return -1;
		
		for (int x = 1; x < ray.size(); x++)
		{
			if (ray.get(0)<ray.get(x))
			{
				sum = sum + ray.get(x);
			}
		}
		
		if (sum == 0) sum = -1;
		
		return sum;
	}
}