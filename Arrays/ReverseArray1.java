package in.ashokit.Arrays;

public class ReverseArray1 {
	public static void main(String[] args) {
		
		
		int arr[] = {12,34,56,78,9,1,3,4,6,4,2,0};
		
		int temp;
		//[]=new int[arr[arr.length-1]];
		
		for(int i=0;i<arr.length/2;i++) {
			        temp=arr[i];
			        arr[i]=arr[arr.length-1-i];
			        arr[arr.length-1-i]=temp;
		}
		for(int n:arr) {
			System.out.print(n+" ");
		}
		
	}

}
