import java.util.Scanner;
public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;
        boolean flag = true;
        while(temp!=0){
            if(temp%10!=0){
                count = count+1;
                temp = temp/10;
            }
        }
        temp = n;
        int power = 1;
        int sum = 0;
        while(temp!=0){
            int ld = temp%10;
            power = (int) Math.pow(ld,count);
            sum = sum+power;
            temp = temp/10;
           
        }
        if (sum==n) {
            System.out.println(n+" is an armstrong number");
        } else {
            System.out.println(n+" is not an armstrong number");
        }
    
    
    }    
}
