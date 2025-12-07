package archive.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/longest-consecutive-sequence/description/">...</a>
     * <p>
     * Iteration for better approach : 1
     * </p>
     *      Get the given array and pass it through a Set so that first the duplicate elements get removed. Now once we have the Set extract the elements from it and
     *      prepare a new array. Sort that array and then keep two counters one will be temp and another will be maxTemp , initialize both of them with 1.
     *      Now iterate through new array and keep checking if the next element is just more than one from its previous, if so increase the temp by one and update maxTemp
     *      if it is smaller than temp. Now once the chain breaks, again reset the temp to 1 and start checking if previous element is just one smaller that next elmement.
     *      And keep updating temp and maxTemp accordingly.
     * <p>
     *
     * <p>
     * Time Complexity : O(n)
     * </p>
     */

    public static void main(String[] args) {

        System.out.println(longestConsecutive(new int[]{4, 0, -4, -2, 2, 5, 2, 0, -8, -8, -8, -8, -1, 7, 4, 5, 5, -4, 6, 6, -3}));

    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int[] newArr = new int[set.size()];

        int x = 0;
        for (int s : set) {
            newArr[x++] = s;
        }

        Arrays.sort(newArr);


        int temp = 1;
        int maxTemp = 1;

        for (int i = 0; i < newArr.length - 1; i++) {
            if (newArr[i] + 1 == newArr[i + 1]) {
                temp++;
            } else {
                temp = 1;
            }

            if (maxTemp < temp) {
                maxTemp = temp;
            }
        }

        return maxTemp;
    }
}
