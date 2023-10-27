package gfg.bitManipulation;

public class PowerSet {

    public static void main(String[] args) {
        powerSet("abc");
    }

    public static void powerSet(String str) {
        int strLen = str.length();
        int powSize = (int) Math.pow(2, strLen);

        for (int counter = 0; counter < powSize; counter++) {

            for (int j = 0; j < strLen; j++) {
                if ((counter & (1 << j)) != 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
