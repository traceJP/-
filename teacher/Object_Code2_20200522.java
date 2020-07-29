package teacher;
public class Object_Code2_20200522 {
    public static void main(String[] args) {
        System.out.println("三位的水仙花数都有：");
        for (int i = 100; i < 1000; i++) {
            int Unit = i % 10;
            int Ten = (i / 10) % 10;
            int Hundreds = i / 100;
            if(i == Unit*Unit*Unit + Ten*Ten*Ten + Hundreds*Hundreds*Hundreds)
                System.out.println(i);
        }
    }
}
