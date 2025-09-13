import java.util.Scanner;
public class gradeResult {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        if(grade=='a'||grade=='A'){
            System.out.println("First Rank");
        }
    
        else if (grade=='b'||grade=='B') {
            System.out.println("Second Rank");
        }
    
        
        else if (grade=='c'||grade=='C') {
            System.out.println("first class");
        }
    
        
        else if (grade=='d'||grade=='D') {
            System.out.println("second class");
        }
    
        
        else if (grade=='e'||grade=='E') {
            System.out.println("you just passed the exam");
        }
    
        
        else if (grade=='f'||grade=='F') {
            System.out.println("you failed the exam");
        }
    
        else{
            System.out.println("Enter valid input");
        }
    }
}
