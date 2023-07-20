package in.ashokit.samplePrograms;

public class Pattern4 {
	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) {
			for(int k=7-i;k>=1;k--) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	}

}
