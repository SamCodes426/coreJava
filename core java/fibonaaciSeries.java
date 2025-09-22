import java.util.Scanner;
public class fibonaaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i =0; i<=n; i++){
           System.out.println(sum);
            a=b;
            b=sum;
            sum=a+b;
        }
    }    
}
