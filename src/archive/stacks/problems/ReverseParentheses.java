package archive.stacks.problems;

import java.util.Stack;

public class ReverseParentheses {

    public static void main(String[] args) {

        System.out.println(reverseParentheses("(ed(et(oc))el)"));
    }

    public static String reverseParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        StringBuilder result = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {

                int index = stack.pop();
                StringBuilder innerResult = new StringBuilder(result.substring(index + 1, i));

                result.replace(index + 1, i, innerResult.reverse().toString());

            }
        }


        return result.toString().replaceAll("\\(|\\)", "");
    }
}
