package archive.gfg.recursion.youtube;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>() {
            {
                push(1);
                push(2);
                push(3);
                push(4);
                push(5);
                push(6);
            }

        };

        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }

    public static void reverseStack(Stack<Integer> stack) {

        if (stack.size() == 1) {
            return;
        }

        int temp = stack.pop();
        reverseStack(stack);
        insert(stack, temp);
    }

    public static void insert(Stack<Integer> stack, int temp) {

        if (stack.isEmpty()) {
            stack.push(temp);
            return;
        }
        int num = stack.pop();
        insert(stack, temp);
        stack.push(num);
    }

}
