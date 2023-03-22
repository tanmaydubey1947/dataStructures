package strings;

public class CharactersByFrequency {

    // Simple and basic solution with time complexity: O(n)
    // Leetcode Link: https://leetcode.com/problems/sort-characters-by-frequency/description/
    // TODO: Needs improvement

    public static void main(String[] args) {

        System.out.println(frequencySort("112233aaabbbcccAAABBBCCC"));

    }

    public static String frequencySort(String s) {

        int[] arr = new int[62];

        for (int i = 0; i < s.length(); i++) {

            int ch = s.charAt(i);

            if (ch <= 57 && ch >= 48) {
                arr[ch - 48]++;
            }
            if (ch <= 122 && ch >= 97) {
                arr[ch - 87]++;
            }
            if (ch <= 90 && ch >= 65) {
                arr[ch - 30]++;
            }
        }

        StringBuilder result = new StringBuilder();


        while (s.length() != result.toString().length()) {
            int max = Integer.MIN_VALUE;
            int temp = 0;

            for (int i = 0; i < 62; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    temp = i;
                }
            }

            arr[temp] = 0;

            char ch = 0;
            if (temp <= 9) {
                ch = (char) (48 + temp);
            }
            if (temp > 9 && temp < 35) {
                ch = (char) (87 + temp);
            }
            if (temp >= 35) {
                ch = (char) (31 + temp);
            }
            while (max != 0) {
                result.append(ch);
                max--;

            }

        }

        return result.toString();
    }
}
