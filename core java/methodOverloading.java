public class methodOverloading {
    public static void main(String[] args) {
        jump(344);
    }

    public static void jump(){
        System.out.println("Hello");
    }

    public static void jump(int k){
        System.out.println("hi");
    }
}

//Method Overloading --> same method name but different arguments

// // class variables{
//     public static void main(String[] args){
//         sum(10,20);
//         sum(12.5,13.5);
//     }
//     public static void sum(int a , int b){
//         System.out.println("Sum is :" + (a+b));
//     }

//     public static void sum(double a , double b) {
//         System.out.println("Sum is : " +(a+b) );
//     }
// }