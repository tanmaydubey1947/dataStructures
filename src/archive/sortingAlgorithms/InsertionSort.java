package archive.sortingAlgorithms;

public class InsertionSort {

    /**
     * <p>
     * The archive.main intuition behind Insertion Sort is pick the number compare with it's previous number if it is smaller than it's
     * previous number then swap it, keep this in recurring fashion until we reach the first index of array/list.
     * </p>
     *
     * <p>
     *     Time Complexity : O(n^2) for Worst and Average Case
     *                     : O(n) for Best Case
     * </p>
     */


    public static void main(String[] args) {

        int[] arr = insertionSort(new int[]{0, 5, 4, 3, 2, 1});

        for (int num : arr) {
            System.out.println(num);
        }

    }

    private static int[] insertionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {

                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        return arr;

    }
}
