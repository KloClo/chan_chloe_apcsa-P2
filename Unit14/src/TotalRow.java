//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for (int[] row : m)
    	{
    		int sum = 0;
    		for (int x : row)
    		{
    			sum = sum + x;
    		}
    		list.add(sum);
    	}
    	
		return list;
    }
}
