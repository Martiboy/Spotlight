import static java.lang.System.out;
import java.util.Scanner;

class WachtWoord3 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		out.print("Gebruiker: ");
		String gebruiker = myScanner.next();

		if(gebruiker.equals("Maarten")) {
		   out.print("Wachtwoord: ");
		   String wachtwoord = myScanner.next();

		   if (wachtwoord.equals("nina123")) {
		       out.println("Welkom");
		   } else {
		   	   out.println("Onbekend wachtwoord");
		   }

		} else {
		   out.println("onbekende gebruiker");
		}
	}
}

