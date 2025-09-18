import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income: ");
        double annualIncome = sc.nextDouble();
        double tax = 0;

        if (annualIncome <= 250000) {
            System.out.println("No tax required");
        } 
        else if (annualIncome > 250000 && annualIncome <= 500000) {
            tax = (annualIncome - 250000) * 0.05;
            System.out.println("You have to pay 5% tax: " + tax);
        } 
        else if (annualIncome > 500000 && annualIncome <= 1000000) {
            tax = (250000 * 0.05) + (annualIncome - 500000) * 0.20;
            System.out.println("You have to pay 20% tax: " + tax);
        } 
        else if (annualIncome > 1000000) {
            tax = (250000 * 0.05) + (500000 * 0.20) + (annualIncome - 1000000) * 0.30;
            System.out.println("You have to pay 30% tax: " + tax);
        }
    }
}
