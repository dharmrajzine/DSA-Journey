package Program_Practice;

public class MissingNumber {

	public static int missingNumber(int[] arr, int num) {
		int result = num * (num + 1) / 2;
		for (int i = 0; i < num - 1; i++) {
			result -= arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };

		System.out.println("missing number is : " + missingNumber(arr, 5));
	}
}
