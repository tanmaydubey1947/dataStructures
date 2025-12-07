package archive.stacks.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, 10, -5})));

    }

    public static Object[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            if (stack.isEmpty()) {
                stack.push(asteroids[i]);
            } else if (asteroids[i] > 0) {
                if (stack.peek() > 0) {
                    stack.push(asteroids[i]);
                } else {
                    int peek = stack.peek() * -1;
                    if(peek < asteroids[i]){
                        stack.push(asteroids[i]);
                    } else if(stack.peek() == asteroids[i]){
                        stack.pop();
                    }
                }
            } else if (asteroids[i] < 0) {
                if (stack.peek() < 0) {
                    stack.push(asteroids[i]);
                } else {
                    int asteroid = asteroids[i]*-1;
                    int peek = stack.peek();
                    if(peek < asteroid){
                        stack.push(asteroids[i]);
                    } else if(stack.peek() == asteroid){
                        stack.pop();
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        while(!stack.isEmpty()){
            result.add(stack.pop());
        }



        return result.toArray();
    }
}
