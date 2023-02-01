import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
    //Prompt the user to input the price of car
    Scanner price = new Scanner(System.in);
    System.out.println("\n--------------------\nEnter the price of the car: ");
    double carPrice = price.nextDouble();
    
    //Prompt the user to input the length of the loan
    Scanner length = new Scanner(System.in);
    System.out.println("\n--------------------\nEnter the length of your loan in months: ");
    int loanLength = length.nextInt();

    //Prompt the user to input the interest rate
    Scanner rate = new Scanner(System.in);
    System.out.println("\n--------------------\nEnter the interest rate for your loan: ");
    double interestRate = rate.nextDouble();

    //Prompt the user to input the down payment
    Scanner down = new Scanner(System.in);
    System.out.println("\n--------------------\nEnter the amount of your down payment: ");
    double downPayment = down.nextDouble();

    //Check if price is less than or equal to zero
    if (carPrice <= 0) {
      System.out.println("\n--------------------\nError! The price of the car must be a positive dollar amount.");
    
    //Check if loan length is less than or equal to zero
    } else if (loanLength <= 0) {
      System.out.println("\n--------------------\nError! The length of the loan must be a positive number.");
    
    //Check if interest rate is less than zero
    } else if (interestRate < 0) {
      System.out.println("\n--------------------\nError! The interest rate can not be a negative number.");
    
    //Check if down payment is greater than or equal to price of car
    } else if (downPayment >= carPrice) {
      System.out.println("\n--------------------\nAttention! The car can be paid in full. No loan is needed.");
    } else {
      
      //Calculates the monthly payments, rounds to 2 decimal points, and outputs to user
      double remainingBalance = carPrice - downPayment;
      double monthlyBalance = remainingBalance / loanLength;
      double interest = monthlyBalance * interestRate / 100;
      double monthlyPayment = monthlyBalance + interest;
      double roundedMonthlyPayment = Math.round(monthlyPayment*100.0)/100.0;
      System.out.println("\n--------------------\nYour monthly car payment will be $" + roundedMonthlyPayment + ".");
    }
	}
}