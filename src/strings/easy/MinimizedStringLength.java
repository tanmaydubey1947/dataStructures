package strings.easy;

import java.util.HashSet;
import java.util.Set;

public class MinimizedStringLength {

    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        return set.size();
    }
}
