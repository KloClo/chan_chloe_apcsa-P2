//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	String s = str;
    	
    	for (int x = 0; x < m.length; x++)
    	{
    		for (int y = 0; y < m[x].length; y++)
    		{
    			m[x][y] = s.substring(0, 1);
    			s = s.substring(1);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
    	String output = "";
    	
    	for (String[] s : m)
    	{
    		for (String c : s)
    		{
    			output += (c + " ");
    		}
			output += "\n";
    	}
    	
 		return output;
    }
}
