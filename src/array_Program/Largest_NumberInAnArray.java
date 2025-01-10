package array_Program;

public class Largest_NumberInAnArray {

	// - Input: [5, 8, 3, 12, 9]
	// - Output: Largest number: 12

	public static void main(String[] args) {
		int[] arr = { 5, 8, 3, 12, 13 };
		System.out.println(getLargestNumber(arr));
	}

	public static int getLargestNumber(int[] arr) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
}
