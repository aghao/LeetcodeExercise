package array;

/**
 * [35] 搜索插入位置
 * @author: Aghao
 *
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * (二分法)
 * 时间复杂度：O(log n)
 * 空间复杂度：O(1)
 */
public class SearchInsert {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
//        int result = new SearchInsert().searchInsert(nums, target);
        int result = new SearchInsert().searchInsertBinary(nums, target);
        System.out.println(result);
    }

    // 1. 暴力法 直接顺序查找对比
    private int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    // 2. 二分查找法 加快查找速度
    private int searchInsertBinary(int[] nums, int target) {
        int left = 0, right = nums.length;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
