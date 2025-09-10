import java.util.Scanner;
public class areaTriangle {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base: ");
    double base = sc.nextDouble();

    System.out.print("Enter the height: ");
    double height = sc.nextDouble();

    System.out.println("Area of triangle is: "+(0.5*base*height));

    }
}
