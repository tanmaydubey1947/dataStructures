package array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {

    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ans = new ArrayList<>();
        int carry = 0;
        int n = num.length;
        int i = n - 1;

        while (i >= 0 || carry > 0 || k > 0) {
            int sum = k % 10 + carry;
            k = k / 10;
            if (i >= 0) {
                sum = sum + num[i];
                --i;
            }

            carry = sum / 10;
            ans.add(sum % 10);
        }

        Collections.reverse(ans);
        return ans;
    }
}
