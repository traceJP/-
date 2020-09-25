package HelloWorld;

public class javafromjitu {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i < 20; i++) {
            for (j = 0; j < 34; j++) {
                for (k = 0; k < 100; k += 3) {

                    if (5 * i + 3 * j + k / 3 == 100 && i + j + k == 100) {
                        System.out.println("公鸡有" + i + "个" + "\n" + "母鸡有" + j + "个" + "\n" + "小鸡有" + k + "个");
                        System.out.print("\n\n\n");
                        break;
                    }
                }
            }
        }

    }
}
