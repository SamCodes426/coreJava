public class methodWithoutArgWithReturnType {
    public static void main(String[] args) {
        
       
    //    System.out.println(getpi());
    //    double pi = getpi();
    //    System.out.println(pi);
       
       
        if (getpi()==3.1416) {
            System.out.println("True Value");
        }
        else{
            System.out.println("False Value");
        }

    }   
    
    public static double getpi(){
        return 3.1416;
    }
}
