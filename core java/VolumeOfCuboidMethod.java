public class VolumeOfCuboidMethod {
    public static void main(String[] args) {
        Volume(5, 5, 10);
        reverse(123);
    }   
    
    public static void Volume(double l , double b , double h){
        System.out.println("Volume of cuboid is : "+(l*b*h));
    }

    public static void reverse(int num){
        if (num<10) {
            System.out.println("reversed number is: "+num);
        }
        else{
            int reverse = 0;
            while(num!=0){
                int lastDigit = num%10;
                reverse = reverse * 10 + lastDigit;
                num = num/10;
            }
            System.out.println("reverse of the given number is: "+reverse);
        }
    }
}
