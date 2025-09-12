import java.util.Scanner;
public class iasExamEligibility {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if(age>=2121 && age<=32){
            System.out.println("You are eligible for ias exam");
        }
        else{
            System.out.println("You are not eligilble for ias exam");
        }

    }
}
