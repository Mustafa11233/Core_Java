package in.ashokit;

public class ThirdMaxNum {

	public static void main(String[] args) {

		int[] arr = { 30, 890, 12, 13, 14, 15, 19 };
		
		int temp;

		for (int i = 0; i <=arr.length-1; i++) {
			for (int j = 0 + 1; j <=arr.length-1; j++) {

				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		System.out.println(arr[2]);
	}

}
