import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		ListDown s = new ListDown();
		int[] array = new int[] {10,9,8,7,6,5,4,3,2,1,-99};
		
		ArrayList<Integer> vals = new ArrayList<Integer>();
		
		for (int x = 0; x < array.length; x++)
		{
			vals.add(array[x]);
		}

		System.out.println(s.go(vals));
	}
}