//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		String output = "";

		int size = file.nextInt();
		file.nextLine();
		
		Word[] array = new Word[size];

		for (int x = 0; x < size; x++)
		{
			String s = file.nextLine();
			Word text = new Word(s);
			array[x] = text;
		}
		
		//System.out.println(array[0].compareTo(array[1]));
		
		Arrays.sort(array);

		for(Word w : array) 
		{
			System.out.println(w);
		}

	}
}