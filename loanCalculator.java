import java.util.*;
//A program to calculate the loan amount over a period of time.
public class loanCalculator{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount in naira: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter the rate in percentage: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the period in years: ");
        double time = scanner.nextDouble();

        double interest = (principalAmount * rate * time)/100;
        double loanAmount = principalAmount + interest;


        System.out.printf("The total amount in naira is %.2f", loanAmount);
    }
}