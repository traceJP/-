package HelloWorld;
import sun.plugin.dom.exception.BrowserNotSupportedException;
import java.util.Scanner;
public class yanghuisanjiao {
    public static void main(String[] args) {
        Scanner Cin = new Scanner(System.in);
        int row = Cin.nextInt();
        int[][] arr = new int[row][row];
        for(int i = 0;i < arr.length; i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for(int i = 0;i < arr.length; i++)
            for(int j = 1;j < i - 1; j++)
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
        for(int i = 1;i < arr.length; i++){
            for(int j = 0;j < i - 1; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}



