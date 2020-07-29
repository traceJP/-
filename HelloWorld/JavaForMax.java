package HelloWorld;
import java.util.Scanner;
public class JavaForMax {

    public static void main(String[] arge){
        Scanner No1 = new Scanner(System.in);
        Scanner No2 = new Scanner(System.in);
        Scanner No3 = new Scanner(System.in);
        int a;
        int b;
        int c;
        a = No1.nextInt();
        b = No2.nextInt();
        c = No3.nextInt();
        int max = a;
        if(b > a ){
            max = b;
            if(c > b){
                max = c;
            }
        }
        if(c > a){
            max = c;
        }
        System.out.println("max="+max);
    }
}
