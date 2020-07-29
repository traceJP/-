package teacher;
import java.util.Scanner;
public class Object_Code1_2020521 {
    public static void main(String[] args) {
        Scanner Cin = new Scanner(System.in);
        int N = Cin.nextInt();
        while (N < 1 || N > 7) {
            System.out.println("您输入的数据范围在1~7之外，请重新输入：");
            N = Cin.nextInt();
        }
        switch (N) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
