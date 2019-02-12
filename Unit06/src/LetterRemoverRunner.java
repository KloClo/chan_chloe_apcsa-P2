//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		test.removeLetters();
		out.println(test.toString());
		
		LetterRemover test1 = new LetterRemover("ssssssssxssssesssssesss", 's');
		test1.removeLetters();
		out.println(test1.toString());
		
		LetterRemover test2 = new LetterRemover("qwertyqwertyqwerty", 'a');
		test2.removeLetters();
		out.println(test2.toString());		

		LetterRemover test3 = new LetterRemover("abababababa", 'b');
		test3.removeLetters();
		out.println(test3.toString());		
		
		LetterRemover test4 = new LetterRemover("abaababababa", 'x');
		test4.removeLetters();
		out.println(test4.toString());		
		
	}
}