/*桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
示例 1：
输入：[4,2,1]
输出：4
解释：第一堆力扣币最少需要拿 2 次，第二堆最少需要拿 1 次，第三堆最少需要拿 1 次，总共 4 次即可拿完。
*/
package LeetCode;
public class LCP06 {
    public static void main(String[] args){
        int [] N = new int[]{2,3,10};
        System.out.println(minCount(N));
    }
    public static int minCount(int[] coins) {
        int num = 0;
        for(int i = coins.length - 1;i >= 0;i--){
            if(coins[i] % 2 == 0){
                num += coins[i] / 2;
                continue;
            }else{
                num += coins[i] / 2 + 1;
                continue;
            }
        }
        return num;
    }
}
