import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven s = new ListOddToEven();
		int[] array = new int[] {2,4,6,8,8};
		
		ArrayList<Integer> vals = new ArrayList<Integer>();
		
		for (int x = 0; x < array.length; x++)
		{
			vals.add(array[x]);
		}

		System.out.println(s.go(vals));
	}

}