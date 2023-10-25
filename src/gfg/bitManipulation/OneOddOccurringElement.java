package gfg.bitManipulation;

/**
 * a ^ a = 0
 * <p>
 * Since the result element will be odd, once the X-OR operation is completed only that element will remain.
 */
public class OneOddOccurringElement {

    public static void main(String[] args) {
        System.out.println(findOneOddOccurringElement(new int[]{1,1,2,4,4}));
    }

    public static int findOneOddOccurringElement(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result = result ^ num;
        }

        return result;
    }
}