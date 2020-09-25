/*
给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
'A' : Absent，缺勤
'L' : Late，迟到
'P' : Present，到场
如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。你需要根据这个学生的出勤记录判断他是否会被奖赏。
示例 1:
输入: "PPALLP"
输出: True
*/
package LeetCode;

public class no551 {
    public static void main(String[] args) {
        String n = "A";
        if (checkRecord(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean checkRecord(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'A')
                sum++;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 2 || s.length() == 1)
                break;
            if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L')
                return false;
        }
        if (sum > 1)
            return false;
        else
            return true;
    }
}
