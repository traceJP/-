package 算法;

public class ceshi2 {

    public static void main(String[] args) {

        System.out.println(meiju1.NO1);

    }

}
/*
class meiju1 {

    private final String name;
    private final String about;

    private meiju1(String name, String about) {
        this.name = name;
        this.about = about;
    }

    public static final meiju1 NO1 = new meiju1("张三", "nb");
    public static final meiju1 NO2 = new meiju1("李四", "wc");
    public static final meiju1 NO3 = new meiju1("王五", "qwq");
    public static final meiju1 NO4 = new meiju1("老六", "asa");

    @Override
    public String toString() {
        return name + "\t" + about;
    }
}
*/

enum meiju1 {

    NO1("张三", "nb"),
    NO2("李四", "wc"),
    NO3("王五", "qwq"),
    NO4("老六", "asa");

    private final String name;
    private final String about;

    private meiju1(String name, String about) {
        this.name = name;
        this.about = about;
    }

    @Override
    public String toString() {
        return name + "\t" + about;
    }
}