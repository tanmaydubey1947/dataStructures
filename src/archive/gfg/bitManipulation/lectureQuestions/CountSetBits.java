package archive.gfg.bitManipulation.lectureQuestions;

/**
 *  Brian Kerningam's Algorithm: n = n & (n-1) => this will unset the last set bit
 */
public class CountSetBits {

    public static void main(String[] args) {

        System.out.println(countBits(4));

    }

    public static int countBits(int n) {
        int res = 0;
        while (n > 0) {
            n = (n & (n - 1));
            res++;
        }
        return res;
    }
}
