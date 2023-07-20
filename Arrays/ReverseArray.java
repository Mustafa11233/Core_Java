package in.ashokit.Arrays;

public class ReverseArray {
	public static void main(String[] args) {

		int arr[] = { 123, 2, 3, 4, 5, 22, 4, 9 };

		int temp[] = new int[arr.length];
		int count = 0;
		for (int i = arr.length - 1; i >= 1; i--) {
			temp[count] = arr[i];
			count++;
		}
		for (int n : temp) {
			System.out.print(n + " ");
		}

	}
}