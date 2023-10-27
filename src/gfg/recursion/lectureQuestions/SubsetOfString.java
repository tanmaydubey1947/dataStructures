package gfg.recursion.lectureQuestions;

public class SubsetOfString {

    public static void main(String[] args) {
        subset("abc", "", 0);
    }

    public static void subset(String str, String curr, int i) {

        if (str.length() == i) {
            System.out.println(curr);
            return;
        }
        subset(str, curr, i + 1);
        subset(str, curr + str.charAt(i), i + 1);
    }
}
