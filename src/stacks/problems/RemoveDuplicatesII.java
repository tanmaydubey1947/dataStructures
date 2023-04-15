package stacks.problems;

import java.util.Stack;

public class RemoveDuplicatesII {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("deeedbbcccbdaa", 3));

    }

    public static String removeDuplicates(String s, int k) {

        Stack<int[]> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek()[0] == c) {
                stack.peek()[1]++;
            } else {
                stack.push(new int[]{c, 1});
            }

            if (stack.peek()[1] == k) {
                stack.pop();
            }

        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            int[] top = stack.pop();

            while (top[1]-- > 0) {
                result.append((char) top[0]);
            }
        }

        return result.reverse().toString();

    }
}
