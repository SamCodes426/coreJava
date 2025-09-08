public class incDecOperator {
public static void main(String[] args) {

    
//===========INCREMENT OPERATOR =================//

    int a = 10;
    a++;
    System.out.println(a);

    int b = 10;
    ++b;
    System.out.println(b);

    int c = 5;
    System.out.println(++c);
    System.out.println(c);

    int d = 5;
    System.out.println(d++);
    System.out.println(d);

    
//========== DECREMENT OPERATOR =================//

    int w = 10;
    b--;
    System.out.println(b);

    int x = 10;
    --x;
    System.out.println(x);

    int y = 5;
    System.out.println(--y);
    System.out.println(y);

    int z = 5;
    System.out.println(z--);
    System.out.println(z);
    
//===================================================//

    int l = 5;
    int m = (++l)+(l++)-(--l)-(++l);
    System.out.println(l);
    System.out.println(m);


    int n = 5;
    int o = (--n)+(n++)-(n--)+(++n);
    System.out.println(n);
    System.out.println(o);

    int s = 5;
    s = ++s;
    System.out.println(s);


    }    
}
