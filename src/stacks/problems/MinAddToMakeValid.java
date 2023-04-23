package stacks.problems;

import java.util.Stack;

public class MinAddToMakeValid {

    public static void main(String[] args) {

        System.out.println(minAddToMakeValid(")))"));

    }

    public static int minAddToMakeValid(String s) {

       int result = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ;i< s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(1);
            } else if(!stack.isEmpty() && s.charAt(i) == ')'){
                stack.pop();
            } else {
                result++;
            }
        }

        return result + stack.size();
    }
}
