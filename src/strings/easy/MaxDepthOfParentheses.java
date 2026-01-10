package strings.easy;

public class MaxDepthOfParentheses {

    public int maxDepth(String s) {
        int ans = 0;
        int curMax = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                curMax++;
            } else if (s.charAt(i) == ')') {
                curMax--;
            }

            ans = Math.max(ans, curMax);
        }

        return ans;
    }
}