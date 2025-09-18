import java.util.Scanner;
public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
       
        System.out.print("Enter the value of y : ");
        int y = sc.nextInt();
       
        for(int i=x;i<=y;i++){
            System.out.println(i);
        }
    }
}
