import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount, for example, 15.75: ");
		
		double amount = input.nextDouble();
		
		int remainingAmount = (int) (amount * 100);
		
		int numberOfDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100 ;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numberofNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consist of \n" +
							"\t" + numberOfDollars + " dollars\n" +
							"\t" + numberOfQuarters + " quarters\n" +
							"\t" + numberOfDimes + " dimes\n" +
							"\t" + numberofNickels + " nickels\n" +
							"\t" + numberOfPennies + " pennies");

	}

}
