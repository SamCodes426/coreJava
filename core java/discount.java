import java.util.Scanner;
public class discount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the product: ");
        double price = sc.nextDouble();

        if(price<=200){
            price = price-(price*0.1);
            System.out.println("Discounted Price: "+price);
        }
    else{
        price = price-(price*0.2);
        System.out.println("Discounted Price: "+price);
    }
    
    }
}
