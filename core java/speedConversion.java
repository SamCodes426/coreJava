import java.util.Scanner;
public class speedConversion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the speed in km/h: ");
        double speed = sc.nextDouble();

        System.out.println("Speed converted into m/s: "+(0.278)*speed);

    }
    
}
