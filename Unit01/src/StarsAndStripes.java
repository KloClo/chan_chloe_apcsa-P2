//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      System.out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   int i = 20;
	   String line = "*";
	   while (i > 1) {
		   line = line+"*";
		   i = i - 1;
	   }
	   System.out.println(line);
   }

   public void printTwentyDashes()
   {
   }

   public void printTwoBlankLines()
   {
   }
   
   public void printASmallBox()
   {	
   }
 
   public void printABigBox()
   { 	
   }   
}