public class variable{
    public static void main(String[] args){
        byte b = 127;      // byte contains 1 byte i.e 8 bits in which 1 bit is reserved for +/- sign and rest 7 bits are left which decide the limit of the datatype (2^7-1)
        System.out.println(Byte.MAX_VALUE);


        short s = 32767;   // short contains 2 byte : 2 * 8 = 16 bits : i.e 2^15 - 1
        System.out.println(Short.MAX_VALUE);


        int n = 2147483647;     //int contains 4 byte : 4 * 8 = 32 bits : i.e 2^31 - 1
        System.out.println(Integer.MAX_VALUE);


        long l = 9223372036854775807L;  //long contains 8 byte : 8 * 8 = 64 bits : i.e 2^63 - 1
        System.out.println(Long.MAX_VALUE);

        
        System.out.println();
        
        
        System.out.println(b);
    
        System.out.println(s);
    
        System.out.println(n);

        System.out.println(l);

        
        System.out.println();
        System.out.println();
        
        double d = 3.14;
        System.out.println(Double.MAX_VALUE);


        float f = 34.1234f;
        System.out.println(Float.MAX_VALUE);

        
        System.out.println();


        System.out.println(d);

        System.out.println(f);
    }

}