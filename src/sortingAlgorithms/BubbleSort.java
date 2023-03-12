package sortingAlgorithms;

public class BubbleSort {


    /**
     * <p>
     * In this sorting algorithm last element get sorted first.
     * Iterate through the array and keep checking if the adjacent element and if it is less than previous one just swap it
     * In every iteration the last element get sorted and we have to just keep coming to 0th index, and array will get sorted
     * <p>
     * Time Complexity : O(n^2) for Average Case and Worst Case
     * : O(n) for Best Case
     * <p>
     * In order to achieve the best case we just have to check if the array is sorted and no swapping performed. If this happened just come out of the loop and
     * return the result.
     * </p>
     */

    public static void main(String[] args) {

        int[] arr = bubbleSort(new int[]{1,2,3,4,5});

        for (int num : arr) {
            System.out.println(num);
        }

    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i >= 1; i--) {
            int isSwapped = 0; // This particular check is used to optimize the TC of the code, as it will check if swapping has ever happened
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = 1;
                }
            }

            if (isSwapped == 0) {
                break;
            }
            System.out.println("Swapping Performed");
        }

        return arr;
    }
}
