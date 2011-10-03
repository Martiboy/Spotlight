import static java.lang.System.*;
import java.util.Scanner;

class WachtWoord2 {

	public static void main(String args[]){

		Scanner myScanner = new Scanner(System.in);

		out.println("Gebruiker: ");
		String Gebruiker = myScanner.next();

		out.println("Wachtwoord: ");
		String Wachtwoord = myScanner.next();

		if (
			(Gebruiker.equals("Maarten") &&
			 Wachtwoord.equals("nina123")) ||
			(Gebruiker.equals("Koekjes") &&
			 Wachtwoord.equals("zijn awesome"))
			 )
	    {
	    	out.println("je mag erin.");
			 } else {

			out.println("NEE DAS FOUT");
			 }


	}
}
