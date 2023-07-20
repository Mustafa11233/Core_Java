package in.ashokit.Arrays;

public class Array1 {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int max=100;
		int min=0;
		
		for(int i=min;i<=max;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
			
				if(i == arr[j]) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.print(i+" ,");
			}
		
			
		}
		}


	}


