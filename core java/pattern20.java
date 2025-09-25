public class pattern20 {
    public static void main(String[] args) {
        int star = 6;
        for(int i = 1 ; i <= 6; i++){
            int x = i;
            int y = 6;
            for(int a = 1; a <= star;a++){
                System.out.print(" "+x+" ");
                x=x+y;
                y--;
            }
            star--;
            System.out.println();
        }
    }
}
