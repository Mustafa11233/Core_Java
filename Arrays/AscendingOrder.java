package in.ashokit.Arrays;

import java.util.Arrays;

public class AscendingOrder {
	public static void main(String[] args) {
		
		int arr[]= {1,3,5,6,3,2,5,7,8,4};
		
		int temp;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
					
				}
				/*
				 * for(int n:arr) { System.out.print(n+" "); }
				 */
				
				}
			}
		System.out.println(Arrays.toString(arr));
		}
		
	}


