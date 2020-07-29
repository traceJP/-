package HelloWorld;
import java.util.Scanner;
public class javafromgdbh {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int N = Scan.nextInt();
        int i,j;//ss i and j
        boolean ace = true;
        boolean bce = true;
        for(i = 2;i < N;i++){
            ace = true;
            bce = true;
            for(j = 2;j < N;j++){
                for(int q = 2;q < i;q++){     //i t/f  ss
                    if(i % q == 0){
                        ace = false;
                }
            }
                for(int q = 2;q < j;q++){
                    if(j % q == 0){
                        bce = false;        //j t/f  ss
                    }
                }
                if(N == i + j && ace == true && bce == true){
                    System.out.println("两个素数分别为" + i + "\t" + j);
                    break;
                }
            }
        }
    }
}
