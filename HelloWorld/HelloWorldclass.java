package HelloWorld;

public class HelloWorldclass{

    public static void main(String[] the) {

        System.out.println("HelloWorld!!");
        int a = 35;
        int b = 12;
        int c;
        c = a/10 + (b/10)*10 + (a%10)*100 + (b%10)*1000;
        System.out.println("c的值为"+c);
    }
}
