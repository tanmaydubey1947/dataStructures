package archive.arrays;

public class SearchInsert {

    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/search-insert-position/description/">...</a>
     * <p>
     * Iteration for better approach : 1
     * <p>
     * Approach: Have a temp variable and initialize it with 0, now run a loop and keep incrementing the temp variable.
     * The loop should stop either the size of array is traversed or we have received the desired position of the element.
     * <p>
     * Time Complexity : O(n)
     * </p>
     */

    public static void main(String[] args) {

        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {

        int i = 0;
        while (nums.length > i && target > nums[i]) {
            i++;
        }
        return i;
    }
}
