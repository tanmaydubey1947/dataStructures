package hashing.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {

    public int[] intersect(int[] num1, int[] num2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : num1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> ref = new ArrayList<>();
        for (int i = 0; i < num2.length; i++) {

            if (map.containsKey(num2[i])) {

                int val = map.get(num2[i]);
                ref.add(num2[i]);

                if (val == 1) {
                    map.remove(num2[i]);
                } else {
                    map.put(num2[i], map.get(num2[i]) - 1);
                }
            }

        }

        int[] ans = new int[ref.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ref.get(i);
        }

        return ans;
    }
}
