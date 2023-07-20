package in.ashokit.Arrays;

public class MaxElement {
	public static void main(String[] args) {

		int ar[] = { 1, 3, 4, 5, 6, 3, 5, 6, 9 };
		MaxElement e = new MaxElement();
		e.max(ar);

//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
//	}
	}
	void max(int arr[]) {
		int maxValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println(maxValue);
	}

	}


