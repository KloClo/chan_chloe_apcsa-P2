//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{
		String w = String.valueOf(rhs);
		//if (word.length() - w.length() == 0) return 0;
		
		return word.compareTo(w);
	}

	public String toString()
	{
		return word;
	}
}