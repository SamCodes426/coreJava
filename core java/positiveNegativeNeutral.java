import java.util.Scanner;
public class positiveNegativeNeutral {
    public static void main(String[] args) {
        

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = sc.nextDouble();

        if (number>0) {
            System.out.println(number+" is a positive number");
        }
    
        else if(number==0){
            System.out.println(number + " is neutral");
        }
    
        else{
            System.out.println(number+ " is a negative number");
        }
    }
}
