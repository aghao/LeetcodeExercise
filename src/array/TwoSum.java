package array;
/**
 * [1] 两数之和
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
