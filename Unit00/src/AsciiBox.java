//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class AsciiBox
{
	public static void main(String[] args)
	{
		int overallLoop = 3;
		int plusLoop = 3;
		
		System.out.println("name \t  date \n\n" );
		
		while (overallLoop > 0) {
			while (plusLoop > 0) {
				System.out.println("----+++++++++++++++++---- " );
				plusLoop = plusLoop - 1;
			}
			
			System.out.println("~o~\"~o~\\\"~o~\\\"~o~\\\"~o~\\\" " );
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA " );
			
			overallLoop = overallLoop - 1;
			plusLoop = 3;
		}
		
		while (plusLoop > 0) {
			System.out.println("+++++++++++++++++++++++++ " );
			plusLoop = plusLoop - 1;
		}
	}
}