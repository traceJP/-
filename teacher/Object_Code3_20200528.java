package teacher;

import java.util.Scanner;

public class Object_Code3_20200528 {
    public static void main(String[] args) {
        Scanner Cin = new Scanner(System.in);
        int N = Cin.nextInt();
        int[] sz = new int[N];
        for (int i = 0; i < N; i++)
            sz[i] = Cin.nextInt();
        int tex;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < i; j++)
                if (sz[j] > sz[i]) {
                    tex = sz[j];
                    sz[j] = sz[i];
                    sz[i] = tex;
                }
        for (int i = 0; i < N; i++) {
            System.out.print(sz[i] + "\t");
        }
    }
}
