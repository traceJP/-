package HelloWorld;

public class javafor202032 {

    public static void main(String[] args) {
        int a = 12345;
        int b = 0;
        while (a != 0){
           b = (b*10)+(a%10);
           a /= 10;
        }
        System.out.println("a的数值倒过来为"+b);
    }
}
