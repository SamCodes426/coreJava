public class pattern3 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println();
            for(int j = 1 ; j <= 5 ; j++){
                if (i==3&&j==2) {
                    System.out.print("    s    ");
                } 
                else if(i==3&&j==3){
                    System.out.print("    a    ");
                }
                else if(i==3&&j==4){
                    System.out.print("    m    ");
                }
                else {
                    System.out.print("    *    ");
                }
            }
        }
    }
}
