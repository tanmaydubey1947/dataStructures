package stacks.problems;

import java.util.Stack;

public class CalPoints {


    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/baseball-game/description/">...</a>
     * <p>
     * Iteration for better approach : 1
     * </p>
     * We have certain conditions based upon which we just have to perform basic stack operations
     * <p>
     *
     * <p>
     * Time Complexity : O(n)
     * </p>
     */

    public static void main(String[] args) {

        System.out.println(calPoints(new String[]{"1", "C"}));

    }

    public static int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (String str : operations) {
            switch (str) {
                case "C":
                    stack.pop();
                    break;
                case "D": {
                    int num = stack.peek();
                    stack.push(num * 2);
                    break;
                }
                case "+": {
                    int num = stack.peek();
                    int num1 = stack.get(stack.size() - 2);
                    stack.push(num + num1);
                    break;
                }
                default: {
                    int num = Integer.parseInt(str);
                    stack.push(num);
                    break;
                }
            }
        }

        int result = 0;

        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }

        return result;
    }
}

