public class methods {
    public static void main(String[] args) {
        System.out.println(" Main method ");
        walk();
        run();
        System.out.println("Main method ends");
        // say();
    }
    


    public static void walk(){
        System.out.println("A man is walking..!");
    }



    public static void run() {
        System.out.println("A man is running..!");
    }


    // public static void say(){
    //     System.out.println("its me again");
    //     say();                               A METHOD CALLING ITSELF IS CALLED RECURSION.
    // }
}