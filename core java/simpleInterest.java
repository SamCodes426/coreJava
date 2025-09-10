import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double principle = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time duration: ");
        double time = sc.nextDouble();

        double interest = (principle*rate*time)/100;
        
        System.out.println("The interest is: "+interest);
    
    }
}
