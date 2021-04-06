package array;

/**
 * [27] 移除元素
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2]
 * Explanation: Your function should return length = 2, with the first two elements of nums being 2.
 * It doesn't matter what you leave beyond the returned length. For example if you return 2 with nums = [2,2,3,3] or nums = [2,2,0,0], your answer will be accepted.
 */


public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int len = new RemoveElement().removeElement(nums, val);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }

    private int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // 快慢双指针方法，不同值时，可以复制nums[j]到nums[i]，同时均增加索引
            // 不用考虑数组后长度
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
