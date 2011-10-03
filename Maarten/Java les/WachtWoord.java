import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

class WachtWoord {

	public static void main(String args[]){

	out.print("Wat het wachtwoord? ");

	Scanner myScanner = new Scanner(in);
	String wachtwoord = myScanner.next();

	out.println("je typte >> " + wachtwoord + " <<");
	out.println();

	if (wachtwoord == "koekjes") {
		out.println("wauw het woord dat je getypt heb");
		out.println("is opgeslagen op dezelfde plek");
		out.println("als het echte wachtwoord");
		out.println("jij moet een echte hacker zijn");
	} else {
		out.println("Het woord dat he getypt heb");
		out.println("is niet opgeslagen op dezelfde plek");
		out.println("als het echte wachtwoord");
		out.println("maar dat maakt niet uit");
	}

	out.println();

	if (wachtwoord.equals("koekjes")) {
		out.println("het woord dat je getypt heb");
		out.println("heeft dezelfde letters");
		out.println("als het echte wachtwoord");
		out.println("welkom in ons systeem");
	} else {
		out.println("het woord dat je getypt heb");
		out.println("komt niet overeen");
		out.println("met ons wachtwoord");
		out.println("probeer het nog eens");
	}




	}
}
