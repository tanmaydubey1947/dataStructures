package archive.gfg.recursion.lectureQuestions;


public class RopeCutting {

    public static void main(String[] args) {

        System.out.println(ropeCutting(23, 12, 11, 10));
    }

    public static int ropeCutting(int rope, int a, int b, int c) {

        if (rope == 0) {
            return 0;
        }

        if (rope < 0) {
            return -1;
        }

        int res = max(ropeCutting(rope - a, a, b, c),
                ropeCutting(rope - b, a, b, c),
                ropeCutting(rope - c, a, b, c));

        if (res == -1) {
            return -1;
        }

        return res + 1;
    }

    public static int max(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else return Math.max(b, c);

    }
}
