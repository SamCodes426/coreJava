import java.util.Scanner;
public class countFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int k = 0;
        for(int i = 1 ; i<=n ; i++){
            if (n%i==0) {
                
                k++;
            }
        
        }
    System.out.println(k);
    }
}
