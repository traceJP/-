/*
给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
        示例 1：
        输入：[-4,-1,0,3,10]
        输出：[0,1,9,16,100]

*/
package LeetCode;
public class no977 {
    public static void main(String[] args){
        int[] a = new int[]{-4,-1,0,3,10};
        int[] cin = sortedSquares(a);
        for(int i = 0;i < a.length;i++)
            System.out.println(cin[i]);
    }
    public static int[] sortedSquares(int[] A) {
        for(int i = 0;i < A.length;i++)  //平方
            A[i] *= A[i];
        int t;
        for(int i = 0;i < A.length;i++)     //排序
            for(int j = 0;j < i;j++){
                if(A[i] < A[j]){
                    t = A[j];
                    A[j] = A[i];
                    A[i] = t;
                }
            }
        return A;
    }
}
/*   java双指针 ，运行耗时2ms
  public int[] sortedSquares(int[] A) {
        int start = 0;
        int end = A.length;
        int i = end - 1;
        int[] nums = new int[end--];
        while (i >= 0) {
            nums[i--] = A[start]*A[start] >= A[end]*A[end] ? A[start]*A[start++] : A[end]*A[end--];
        }
        return nums;
*/
