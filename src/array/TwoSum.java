package array;

/**
 * [1] 两数之和
 * @author: Aghao
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * 时间复杂度：O(n*n)
 * 空间复杂度：O(1)
 */

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,8};
        new TwoSum().twoSum(arr, 10);
    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
