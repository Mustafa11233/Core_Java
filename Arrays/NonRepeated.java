package in.ashokit.Arrays;

import java.util.Arrays;

public class NonRepeated {
	public static void main(String[] args) {
		
		int arr[]= {2,3,2,1,3,4,5};
		
	
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
			
		if(arr[i] == arr[j] && i!=j ) {
			count++;
			
		}
		
		}
			if(count==0) {
				System.out.print(arr[i]+" ");
	
	}
	}
		
	}
}