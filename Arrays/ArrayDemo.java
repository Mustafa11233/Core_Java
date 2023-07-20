package in.ashokit.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40};
		//re-initialize the value at zeroth index;
		arr[0] =200;
		
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//re initialized but not used it
		arr[3] =399;
		
		System.out.println(arr[101]);
	}

}
