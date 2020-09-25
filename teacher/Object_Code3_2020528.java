package teacher;

import java.util.Scanner;

public class Object_Code3_2020528 {
    public static void main(String[] args) {
        Scanner Cin = new Scanner(System.in);
        int N = Cin.nextInt();
        int[][] n = new int[N][];
        for (int i = 0; i < N; i++) {
            n[i] = new int[i + 1];
            System.out.print((n[i][0] = 1) + "\t");
            for (int j = 1; j < i; j++)
                System.out.print((n[i][j] = n[i - 1][j - 1] + n[i - 1][j]) + "\t");
            if (i != 0)
                System.out.println(n[i][i] = 1);
            else
                System.out.print("\n");
        }
    }
}
