package strings.medium;

import java.util.ArrayList;
import java.util.List;

public class StringCompression {

    public int compress(char[] chars) {

        int n = chars.length;
        int i = 0;
        int j = 1;
        List<Character> list = new ArrayList<>();

        while (i < n) {

            int count = 1;
            while (j < n && chars[i] == chars[j]) {
                j++;
                count++;
            }

            if (count > 1) {
                char[] temp = (String.valueOf(count)).toCharArray();
                list.add(chars[i]);
                for (char ch : temp) {
                    list.add(ch);
                }
            } else {
                list.add(chars[i]);
            }
            i = j;
            j++;
        }

        for (int k = 0; k < list.size(); k++) {
            chars[k] = list.get(k);
        }
        return list.size();
    }
}
