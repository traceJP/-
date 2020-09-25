package HelloWorld2;

public class jingtai {
    static {
        System.out.println("123");

    }

    public static void main(String[] args) {
        Person P1 = new Person();
        Person P2 = new Person();
    }
}

class Person {
    static {
        System.out.println("233");

    }


}
