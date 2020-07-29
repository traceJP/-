/*编写一个算法来判断一个数 n 是不是快乐数.
快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
如果 n 是快乐数就返回 True ；不是，则返回 False 。
示例：
输入：19
输出：true
解释：
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/
package LeetCode;

public class no202 {
    public static boolean isHappy(int n) {

        for(int i = 0;i < 1000;i++){
            if(n == 1){
                return true;
            }else{
                n = kxsxh(n);
            }
        }
        return false;
    }
    public static int kxsxh(int m){
        int num = 0;
        for(int j = 0;j < 100;j++){
            int a = m % 10;
            m /= 10;
            num += a * a;
        }
        return num;
    }
    public static void main(String[] args){
        int a = 3;
        if(isHappy(a))
            System.out.println("是开心数");
        else
            System.out.println("不是开心数");
    }
}
