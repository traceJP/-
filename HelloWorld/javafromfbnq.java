package HelloWorld;
import java.util.Scanner;

public class javafromfbnq {
    public static void main(String[] arge){
        Scanner scan = new Scanner(System.in);
        int N;
        int a1 = 1;
        int a2 = 1;
        int az = 0;
        N = scan.nextInt();
        if(N == 1){
            System.out.println(a1);
        }else if(N <= 0){
            System.out.println("输入数据有误");
        }
        for(int i = 1;i < N-1;i++){
            if(i == 1){
                System.out.print(a1+"   ");
                System.out.print(a1+"   ");
            }
            az = a1 + a2;
            a1 = a2;
            a2 = az;
            if((i-1) % 4 == 0){
                System.out.print("\n");
            }
            System.out.print(az+"   ");
        }
    }

}


