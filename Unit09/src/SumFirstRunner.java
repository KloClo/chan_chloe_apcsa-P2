import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{
		ListSumFirst s = new ListSumFirst();
		int[] array = new int[] {9,10,-8,10000,-5000,-3000};
		
		ArrayList<Integer> vals;
		vals = new ArrayList<Integer>();
		
		for (int x = 0; x < array.length; x++)
		{
			vals.add(array[x]);
		}

		System.out.println(s.go(vals));
	}
}