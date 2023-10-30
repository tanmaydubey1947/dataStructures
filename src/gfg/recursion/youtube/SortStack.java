package gfg.recursion.youtube;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>() {
            {
                push(5);
                push(4);
                push(3);
                push(2);
                push(1);
            }
        };


        sortStack(stack);

        System.out.println(stack);

    }

    public static void sortStack(Stack<Integer> stack) {

        if (stack.size() == 1) {
            return;
        }

        int temp = stack.pop();
        sortStack(stack);
        insert(stack, temp);

    }

    public static void insert(Stack<Integer> stack, int temp) {

        if (stack.size() == 0 || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }

        int num = stack.pop();
        insert(stack, temp);
        stack.push(num);

    }
}
