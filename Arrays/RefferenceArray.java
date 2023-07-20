package in.ashokit.Arrays;

public class RefferenceArray {
	public static void main(String[] args) {
		
		//Array Declaration
		int[] arr;
		//Array Initilization
		//which is used to homogeneous values
		//the index will starts from 0 to 4 only
		arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//System.out.println(arr[1]);
		/*
		 * for(int i=0;i<=4;i++) { System.out.println(arr[i]); }
		 */
		
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		}

}
