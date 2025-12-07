package archive.gfg.recursion.lectureQuestions;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(573));
    }

    public static int sumOfDigits(int num) {

        if (num <= 9) {
            return num;
        } else {
            return num % 10 + sumOfDigits(num / 10);
        }

    }
}