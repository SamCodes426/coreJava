import java.util.Scanner;
public class prime2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        boolean flag = true;
        for(int i = 2; i<n ; i++){
            if (n%i==0) {
                 flag=false;
                 break;
            }
        }
            
        if (flag==true&&n>1) {
            System.out.println(n+" is prime");
        }
        else{
                System.out.println(n+" is not prime");
        }
        
        
    
    
    }
}
