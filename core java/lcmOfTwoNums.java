import java.util.Scanner;
public class lcmOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
 
        int lcm = 1;
        for(int i =1;true;i++){
            if((x*i)%y==0){
                System.out.println("LCM is : "+(x*i));
                break;
            }
        }
    }
}