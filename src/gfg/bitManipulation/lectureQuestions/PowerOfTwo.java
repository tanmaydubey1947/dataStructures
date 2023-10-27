package gfg.bitManipulation.lectureQuestions;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOf2(4));
        System.out.println(isPowerOf2(5));
    }

    public static boolean isPowerOf2(int num){
        return num!=0 && 0 == (num & (num-1));
    }

}
