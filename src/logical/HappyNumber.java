package logical;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            n = squareOfNum(n);
            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    private int squareOfNum(int num) {

        int res = 0;
        while (num != 0) {
            int n = num % 10;
            res = res + (n * n);
            num = num / 10;
        }
        return res;
    }
}
