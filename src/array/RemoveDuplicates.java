package array;

/**
 * [26] 删除有序数组中的重复项
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2]
 * Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.
 * <p>
 * 时间复杂度：O(n) 假设数组长度n
 * 空间复杂度：O(1)
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 4, 4, 4};
        int result = new RemoveDuplicates().removeDuplicates(nums);
        System.out.println(result);
    }

    private int removeDuplicates(int[] nums) {
        // 采用长短指针i,n指示，相同元素则短指针不动
        // 长指针每次增加1，若不同元素则短指针也加1
        if (nums.length == 0)
            return 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[n]) {
                n++;
                nums[n] = nums[i];
            }
        }
        // 不用考虑超出数组长度的元素，输出用n限制
        /*for (int j = 0; j < n; j++)
            System.out.print(nums[j]);*/
        return n + 1;
    }
}
