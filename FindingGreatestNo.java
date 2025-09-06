public class FindingGreatestNo {
    public static void main(String[] args) {
        

        int w = 45;
        int x = 322;
        int y = 7;
        int z= 9;
        
        int greater = (x>=y&&x>=z&&x>=w) ? x : (y>=x&&y>=z&&y>=w) ? y: (z>=w)? z : w;
        System.out.println("Largest number is: "+greater); 

    }
}
