package HelloWorld;
import java.util.Scanner;
public class javafromxh_2 {

    public static void main(String[] args) {
        Xunhuan();
        }
    public static void Xunhuan(){
        int k = 0;
        for(int i = 1;i <= 100;i++){
            if(SsPd(i)){
                System.out.print(i + "\t");
                k++;
            }
            if(k == 5){
                System.out.print("\n");
                k = 0;
            }
        }
    }
    public static boolean SsPd(int Qr) {
        for (int q = 2; q < Qr; q++) {     //i t/f  ss
            if (Qr % q == 0) {
                return false;
            }
        }
        return true;
    }
}
