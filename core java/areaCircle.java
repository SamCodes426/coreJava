import java.util.Scanner;
public class areaCircle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of the circle is : "+(3.14*r*r) );
    }
}
