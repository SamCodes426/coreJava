import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double val = sc.nextDouble(); 
    
    if (val<0) {
        val*=-1;
        System.out.println(val);
    }
    else{
        System.out.println(val);
    }
    }
}
