public class logicalOperator {
    public static void main(String[] args) {
        
//===================== AND OPERATOR =========================//
        int age = 18;
        int bodyCount = 7;
        
        if((age<=18) && (bodyCount>=5)){
            System.out.println("ALERT!! RED FLAG");
        }

        else{
            System.out.println("Krishna sda sahayte !");
        }

//===================== OR OPERATOR =========================//
        int rank = 201;
        int percentage = 85;
        if((rank<=200)||(percentage>=90)){
            System.out.println("You have been selected");
        }

        else{
            System.out.println("You couldn't clear the cutoff of -  " + "rank : "+rank +"  "+"Percentage : "+ percentage+"%");
        }



//==================== NOT OPERATOR ===========================//
        System.out.println(!(5==5));
        System.out.println(!(3<1));
    
    



//================== ASSIGNMENT OPERATOR ======================//

int x = 7;
int y= 9;
x=y;
System.out.println(x);
System.out.println(y);



    }
}