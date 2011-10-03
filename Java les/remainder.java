import static java.lang.System.out;
class remainder {

	public static void main(String args[]) {
		int total = 248; // we nemen 248 centen
		int kwartjes = total / 25;
		int leftOver = total % 25; // dit deelt het door 25 en onthoud wat er over blijft

		int dubbeltjes = leftOver / 10;
		leftOver = leftOver % 10;

		int stuivers = leftOver / 5;
		leftOver = leftOver % 5;

		int centen = leftOver;

		out.println("van de " + total + " centen krijg je");
		out.println(kwartjes + " kwartjes");
		out.println(dubbeltjes + " dubbeltjes");
		out.println(stuivers + " stuivers");
		out.println(centen +" centen");
	//uiteindelijk hebben we 9 kwartjes 2 dubbeltjes 0 stuivers en 3 centen




	}
}
