package stacks.problems;

import java.util.Stack;

public class ValidateStackSequences {

    public static void main(String[] args) {

        System.out.println(validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();
        int push = 0;
        int pop = 0;

        if (pushed.length == 1) {
            return true;
        }

        for (int i = 0; i < Math.pow(pushed.length, 2); i++) {

            if (!stack.isEmpty() && stack.peek() == popped[pop]) {
                stack.pop();
                pop++;
            } else if (push <= pushed.length - 1) {
                stack.push(pushed[push]);
                push++;
            } else {
                break;
            }
        }

        return stack.isEmpty();
    }
}
