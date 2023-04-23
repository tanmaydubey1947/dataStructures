package stacks.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BuildArray {

    public static void main(String[] args) {

        System.out.println(buildArray(new int[]{1, 3}, 3));

    }

    public static List<String> buildArray(int[] target, int n) {

        List<String> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int tempIndex = 0;

        for (int i = 1; i <= n; i++) {
            if (!stack.isEmpty() && stack.peek() == target[target.length - 1]) {
                return result;
            }
            stack.push(i);
            result.add("Push");
            if (stack.peek() != target[tempIndex]) {
                stack.pop();
                result.add("Pop");
            } else {
                tempIndex++;
            }
        }

        return result;
    }
}
