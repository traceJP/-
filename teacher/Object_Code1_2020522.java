package teacher;
import java.util.Scanner;
import java.util.Random;
public class Object_Code1_2020522 {
    public static void main(String[] args) {
        Scanner Cin = new Scanner(System.in);
        Random rand = new Random();
        int Number = rand.nextInt(100);
        int Num_zero = Cin.nextInt();
        int count = 1;       //计数器
        while(Number != Num_zero){
            if(Num_zero > Number){
                System.out.println("你猜的数太大了，请输入你猜测的下一个数：");
                Num_zero = Cin.nextInt();
            }
            if(Num_zero < Number){
                System.out.println("你猜的数太小了，请输入你猜测的下一个数：");
                Num_zero = Cin.nextInt();
            }
            count++;
        }
        System.out.println("你猜中了，答案是" + Number + "你一共猜了" + count + "次！");
    }
}
