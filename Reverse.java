/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {
		String original = args[0];
		int index = original.length() - 1;
		String reversed = "";
		while (index >= 0) {
			reversed += original.charAt(index);
			index -= 1;
		}
		//// Put your code here
		System.out.println(reversed);

		if (original.length() % 2 == 0) {
			System.out.println("The middle character is " + original.charAt((original.length() / 2)));
		} else {
			System.out.println("The middle character is " + original.charAt(((original.length() - 1) / 2)));
		}
	}
}
