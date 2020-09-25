package HelloWorld;

public class xunhuanforjava {
/*
    public static void main(String[] args){
        int i;
        int j = 1;
        int sum = 0;
        for(i = 0;i < 50;i++) {
            sum += j;
            j = (j + 2) * -1;
        }
        System.out.println("sum="+sum);
    }
*/

    public static void main(String[] args) {
        double i = 1;
        double j = 1;
        double sum = 0;
        for (i = 1; i < 100; i += 2) {
            sum += (1 / i) * j;
            j *= -1;
        }
        System.out.println("sum=" + sum);
    }
}
