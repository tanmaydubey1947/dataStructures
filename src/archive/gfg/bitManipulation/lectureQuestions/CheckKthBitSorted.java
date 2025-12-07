package archive.gfg.bitManipulation.lectureQuestions;

public class CheckKthBitSorted {

    public static void main(String[] args) {
        System.out.println(method1(5, 3));
        System.out.println(method2(5, 2));
    }

    public static boolean method1(int num, int pos) {
        return (num & (1 << (pos - 1))) != 0;
    }

    public static boolean method2(int num, int pos) {
        return (((num >> (pos - 1)) & 1) == 1);
    }
}


