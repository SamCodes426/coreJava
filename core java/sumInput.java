import java.util.Scanner;
public class sumInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the first value: ");
        int a = sc.nextInt();
                        
        System.out.print("Enter the second value: ");
        int b = sc.nextInt();

        System.out.println("Sum of the given 2 numbers is: "+ (a+b));
    }
}
