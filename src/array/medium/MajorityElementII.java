package array.medium;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    public List<Integer> majorityElement(int[] nums) {

        int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count1 == 0 && element2 != nums[i]) {
                count1 = 1;
                element1 = nums[i];
            } else if (count2 == 0 && element1 != nums[i]) {
                count2 = 1;
                element2 = nums[i];
            } else if (element1 == nums[i]) {
                count1++;
            } else if (element2 == nums[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        int eleCount1 = 0, eleCount2 = 0;

        for (int num : nums) {
            if (num == element1) {
                eleCount1++;
            } else if (num == element2) {
                eleCount2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        if (nums.length / 3 < eleCount1) {
            ans.add(element1);
        }

        if (nums.length / 3 < eleCount2) {
            ans.add(element2);
        }


        return ans;
    }
}
