/*给定一个整数，编写一个函数来判断它是否是 2 的幂次方。*/
package LeetCode;

public class no231 {
    public static void main(String[] args) {
        int a = 131071;
        if (mcf(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean mcf(int n) {
        if (n < 0)
            return false;
        for (int i = 0; i < 40; i++) {     //很少有比2的50次方大的数
            int num = 1;
            for (int j = 0; j < i; j++)
                num *= 2;
            if (n == num)
                return true;
        }
        return false;
    }
}
