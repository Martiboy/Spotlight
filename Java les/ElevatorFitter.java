import static java.lang.System.out;
class ElevatorFitter {

	public static void main(String args[]){
		int WeightOfAPerson;
		int ElevatorWeightLimit;
		int NumberOfPeople;

		WeightOfAPerson = 150;
		ElevatorWeightLimit = 1400;
		NumberOfPeople = ElevatorWeightLimit / WeightOfAPerson;

		out.print("You can fit ");
		out.print(NumberOfPeople);
		out.println(" in an elevator");

	}

}
