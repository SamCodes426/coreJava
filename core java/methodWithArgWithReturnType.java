public class methodWithArgWithReturnType {
    
    public static void main(String[] args) {
        System.out.println(reverse(812357));
    

    }   
    
    public static int reverse(int num){
    
    
    int rev = 0;    
    while (num!=0){
        int ld = num%10;
        rev = rev*10+ld;
        num= num/10;
    }
    return rev;

    }
}
