package strings.medium;

public class StringCompressionIII {

    public String compressedString(String word) {

        int n = word.length();
        int i = 0;
        int j = 1;
        StringBuilder ans = new StringBuilder();

        while (i < n) {

            int count = 1;

            while (j < n && word.charAt(i) == word.charAt(j)) {
                j++;
                count++;
                if (count == 9) {
                    break;
                }
            }

            ans.append(count).append(word.charAt(i));
            i = j;
            j++;
        }

        return ans.toString();
    }
}
