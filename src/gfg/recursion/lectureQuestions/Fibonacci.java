package gfg.recursion.lectureQuestions;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int num) {

        if (num <= 1) {
            return num;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
