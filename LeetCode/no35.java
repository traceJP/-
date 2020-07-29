/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。你可以假设数组中无重复元素。
示例 1:
输入: [1,3,5,6], 5
输出: 2
*/
package LeetCode;
public class no35 {
    public static void main(String[] args) {
        int[] n = new int[]{1};
        int m = 0;
        System.out.println(searchInsert(n,m));
    }
    public static int searchInsert(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++)
            if(target == nums[i])
                return i;
        if(nums.length == 1)
            if(target > nums[0])
                return 1;
            else
                return 0;
        for(int i = 0;i < nums.length - 1;i++)
            if(target > nums[i] && target < nums[i+1])
                return i+1;
            else if(target < nums[0])
                return 0;
            else if(target > nums[nums.length-1])
                return nums.length;
        return 0;
    }
}
/*
public int searchInsert(int[] nums, int target) {
    for(int i = 0; i < nums.length;i++)
        if(nums[i] >= target)
            return i;
    return nums.length;
}
*/