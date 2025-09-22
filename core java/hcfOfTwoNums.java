import java.util.Scanner;
public class hcfOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        int hcf =1;
        for(int i =1 ; i<=x && i<=y ; i++ ){
            if(x%i==0 && y%i==0){
                hcf = i;    
            }
        }
    System.out.println(hcf+" is the HCF of given 2 numbers");
        
    }
}
