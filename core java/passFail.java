import java.util.Scanner ;

public class passFail {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter total marks: ");
        int totalMarks = sc.nextInt();

        System.out.print("Enter obtained marks: ");
        double obtMarks = sc.nextDouble();

        double score = (obtMarks/totalMarks)*100;

        if(obtMarks > totalMarks){
            System.out.println("you have entered invalid marks");
        }
        
        else{
            if(score>=35&&score<=100){
            System.out.println("congratulations you passed the exams! with "+score+"%");
        }
    
            else{
            System.out.println("sorry, you have failed the exam with "+score+"%");
        }
        }
    
    }
}
