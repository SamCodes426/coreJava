import java.util.Scanner;
public class bonusSalary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter your experience: ");
        int experience = sc.nextInt();

        if(experience>=5){
            System.out.println("your bonus is: "+(salary*0.4));
        }
        else{
            System.out.println("your bonus is: "+(salary*0.25));
        }
    }    
}
