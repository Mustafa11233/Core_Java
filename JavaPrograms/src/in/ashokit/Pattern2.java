package in.ashokit;

public class Pattern2 {
	public static void main(String[] args) {
		
		int N=5;
		
		for(int i=1;i<=N;i++) {
			for(int K=1;K<=N;K++) {
				if(i==1||K==1||i==N||K==N) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
