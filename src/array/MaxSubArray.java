package array;

/**
 * [53] 最大子序和
 * @author: Aghao
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * 动态规划法
 * 时间复杂度：O(n)
 * 空间复杂度：O(1)
 *
 * 暴力遍历法
 * 时间复杂度：O(n*n)
 * 空间复杂度：O(1)
 */

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int result = new MaxSubArray().maxSubArrayViolence(nums);
        int result = new MaxSubArray().maxSubArray(nums);
        System.out.println(result);
    }

    // 动态规划法
    // 前子序列和如果小于0，就舍弃
    private int maxSubArray(int[] nums) {
        int pre = 0;
        int maxRes = nums[0];
        for(int i:nums) {
            pre = Math.max(pre + i, i);
            maxRes = Math.max(pre, maxRes);
        }
        return maxRes;
    }

    // 暴力法
    private int maxSubArrayViolence(int[] nums) {
        int maxRes = nums[0];
        for(int i=0;i<nums.length;i++) {
            int tempSum = 0;
            for(int j=i;j<nums.length;j++) {
                tempSum += nums[j];
                maxRes = Math.max(maxRes, tempSum);
            }
        }
        return maxRes;
    }
}