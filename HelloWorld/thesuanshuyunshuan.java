package HelloWorld;

public class thesuanshuyunshuan {

    public static void main(String[] args) {

        int a = 1, b = 2, c = 3, d = 4;

        boolean result1;

        result1 = ++a <= b-- & c++ >= d--;

//问result1a,b,c,d的值分别是多少？

        int x = 1, y = 2, z = 3, w = 4;

        boolean result2;

        result2 = ++x <= y-- && z++ >= w--;

//问result2 x,y,z,w的值分别是多少？
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }

}