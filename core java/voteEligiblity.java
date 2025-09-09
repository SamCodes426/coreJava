import java.util.Scanner;
public class voteEligiblity {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        String a = (age>=18) ? "You are eligible for voting" : "You are not eligible for voting";
        System.out.println(a);

    }
}
