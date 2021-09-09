import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub¸10
		
		final byte monthsInYear = 12;
		final byte percent = 100;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Amount: ");
		int  principalAmount = scn.nextInt();
		
		float annualIntRate = scn.nextFloat();
		float monthlyInterest = annualIntRate / percent / monthsInYear;
		
		int years = scn.nextInt();
		int numberOfPayments = years * monthsInYear;
		
		
		double mortgage = principalAmount 
				* (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
		
		
		String mortgageCalculated = NumberFormat.getCurrencyInstance().format(mortgage);
		
		
	
		System.out.println("Annual Interest Rate: " + annualIntRate);
		
		System.out.println("Period (Years): " + years);
		
		System.out.println("Mortagage: + " + mortgageCalculated);
		

	}

}
