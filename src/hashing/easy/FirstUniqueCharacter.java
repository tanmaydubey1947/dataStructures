package hashing.easy;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {

        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (hash[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;

    }
}
