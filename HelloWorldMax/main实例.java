package HelloWorldMax;

public class main实例 {
    private final String name;
    private int count;

    public main实例(String id) {
        name = id;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    public String toString_main实例() {
        return count + " " + name;
    }

    public static void main(String[] args) {
        main实例 heads = new main实例("heads");
        main实例 tails = new main实例("tails");
        heads.increment();
        heads.increment();
        tails.increment();
        System.out.println(heads + " " + tails);
        System.out.println(heads.tally() + tails.tally());
    }
}
