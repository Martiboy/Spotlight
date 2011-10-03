import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class RaadSpelletje {

	public static void main(String args[]){
		Scanner myScanner = new Scanner(System.in);

		out.print("Enter a number from 1 to 10");

		int inputNumber = myScanner.nextInt();
		int randomNumber = new Random().nextInt(10) + 1;

		   	if (inputNumber == randomNumber) {
		   out.println("*********");
		   out.println("*YOU WIN*");
		   out.println("*********");
		} else {
		   out.println("You lose");
		   out.print("the random number was ");
		   out.println(randomNumber + ".");

			}
			out.println("Thank you for playing ^.^");


		}

	}

