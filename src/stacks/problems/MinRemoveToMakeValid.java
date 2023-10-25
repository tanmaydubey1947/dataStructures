package stacks.problems;

import java.util.Stack;

public class MinRemoveToMakeValid {

    public static void main(String[] args) {

        System.out.println(minRemoveToMakeValid("))(("));

    }

    public static String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder(s);

        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0;i<str.length();i++){

            if(stack.isEmpty() && str.charAt(i) == ')'){
                stack.push(i);
            } else if(str.charAt(i) == '('){
                stack.push(i);
            } else if(str.charAt(i) == ')'){
                stack.pop();
            }
        }

        while(!stack.isEmpty()){
            int temp = stack.pop();
            str.deleteCharAt(temp);
        }

        return str.toString();

    }
}
