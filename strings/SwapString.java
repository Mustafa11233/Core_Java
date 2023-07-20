package in.ashokit.strings;

public class SwapString {
	public static void main(String[] args) {

		String s = "java";
		char[] array = s.toCharArray();
		char temp;

		for (int i = 0; i < array.length/2; i++) {
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		for (char n : array) {
			System.out.print(n + " ");
		}
	}
}
