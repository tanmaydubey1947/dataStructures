package archive.gfg.recursion.youtube;

import java.util.Stack;

public class DeleteFromMiddleStack {

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

        if (stack.size() % 2 == 0) {
            deleteMiddle(stack, stack.size() / 2 - 1);
        } else {
            deleteMiddle(stack, stack.size() / 2);
        }

        System.out.println(stack);
    }

    public static void deleteMiddle(Stack<Integer> stack, int stackSize) {

        if (stackSize == 0) {
            stack.pop();
            return;
        }

        int temp = stack.pop();
        deleteMiddle(stack, stackSize - 1);
        stack.push(temp);
    }
}
