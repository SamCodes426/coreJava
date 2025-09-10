import java.util.Scanner;
public class getProfit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price");
        int cp = sc.nextInt();

        System.out.print("Enter the selling price");
        int sp = sc.nextInt();

        System.out.println("The profit is: "+ (sp-cp));
    }
}
