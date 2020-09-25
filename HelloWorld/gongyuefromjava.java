package HelloWorld;

public class gongyuefromjava {
    public static void main(String[] arge) {
        int i;
        int n = 9;
        int m = 15;
        int a = 0;
        int b = 0;

        for (i = (n > m) ? m : n; i > 0; i--) {
            if (n % i == m % i) {
                a = i;
                break;
            }
        }


        System.out.println(a);
    }
}
