import java.util.Scanner;
public class areaPerimeterRectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth: ");
        double breadth = sc.nextDouble();

        System.out.println("Perimeter of the rectangle is: "+(2*(length+breadth)));

        System.out.println("Area of the rectangle is: "+(length*breadth));
    }
}
