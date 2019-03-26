//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{		
		int loc = sentence.indexOf(' ');
		String left = sentence;
		int i = 1;
		
		while (loc > -1){
			i++;
			left = left.substring(loc+1);
			loc = left.indexOf(' ');
		}
		
		wordRay = new String[i];

		 loc = sentence.indexOf(' ');
		 left = sentence;
		 i = 0;
		 while (loc > -1){
			wordRay[i] = left.substring(0, loc);
			left = left.substring(loc+1);
			loc = left.indexOf(' ');
			i++;
		}
		 
		 sort();

	}

	public void sort()
	{
	}

	public String toString()
	{
		String output=Arrays.toString(wordRay);
		return output+"\n\n";
	}
}