package array.easy;

public class RotateArray {

    public void rotate(int[] nums, int k) { //This right shift, if need to do left then do the process in reverse order

        int n = nums.length;
        k = k % n;

        reverse(0, n - k - 1, nums);
        reverse(n - k, n - 1, nums);
        reverse(0, n - 1, nums);
    }

    private void reverse(int start, int end, int[] arr) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
