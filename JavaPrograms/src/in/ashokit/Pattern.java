package in.ashokit;

public class Pattern {
	public static void main(String[] args) {
		int N=5;
		
		for(int i=1;i<=N;i++) {
			for(int space=N;space>=i;space--) {
				System.out.print(" ");
			}for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
