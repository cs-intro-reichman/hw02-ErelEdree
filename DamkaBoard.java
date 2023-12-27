/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int row_index = 0;
		do {
			if (row_index % 2 != 0) {
				System.out.print(" ");
			}
			for (int i = 0; i < n; i++) {
				System.out.print("* ");
			}
			System.out.print("\n");
			row_index += 1;
		} while (row_index < n); //// Put your code here
		System.out.print("\n");
	}
}
