package archive.arrays;

public class PrintArrays {

	public static void main(String[] args) {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int num : arr) {
			System.out.println(num);
		}

	}

}
