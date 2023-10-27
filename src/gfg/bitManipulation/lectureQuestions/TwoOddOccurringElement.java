package gfg.bitManipulation.lectureQuestions;

public class TwoOddOccurringElement {

    public static void main(String[] args) {
        findTwoOddOccurringElement(new int[]{1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,5});
    }

    public static void findTwoOddOccurringElement(int[] arr){
        int xor = 0, num1 = 0, num2 = 0;

        for(int num: arr){
            xor = xor ^ num;
        }

        int rightMostSetBitNum = xor & ~(xor - 1);

        for(int num : arr){
            if((num & rightMostSetBitNum) !=0){
                num1 = num1 ^ num;
            } else {
                num2 = num2 ^ num;
            }
        }
        System.out.println("First Number: " + num1 + " and Second Number: " + num2);
    }
}