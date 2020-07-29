/*
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。
示例 1:
输入: [9,9,9]
输出: [1,0,0,0]
解释: 输入数组表示数字 999 + 1。
*/
package LeetCode;
public class no66 {
    public static void main(String[] args) {
        int[] n = new int[]{9,9,9};
        int[] a = plusOne(n);
        for(int i = 0;i < a.length; i++)
            System.out.println(a[i] + "\t" );
    }
    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for(int i = digits.length - 1;i > 0; i--)
            if(digits[i] >= 10){
                digits[i] -= 10;
                digits[i - 1] += 1;
            }
        if(digits[0] >= 10){
            int[] digits_zero = new int[digits.length + 1];
            digits[0] -= 10;
            digits_zero[0] = 1;
            for(int i = 0;i < digits.length; i++)
                digits_zero[i + 1] = digits[i];
            return digits_zero;
        }
        return digits;
    }
}
