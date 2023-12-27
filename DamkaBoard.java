/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int row_index = 1;
		String row = "";
		do {
			// even rows
			if (row_index % 2 == 0) {
				System.out.print(" ");
				for (int i = 0; i < n; i++) {
					row += "* ";
				}
				row = row.substring(0, n * 2 - 1);
				// odd rows
			} else {
				for (int i = 0; i < n; i++) {
					row += "* ";
				}
			}
			System.out.print(row + "\n");
			row = "";
			row_index += 1;
		} while (row_index <= n); //// Put your code here
		System.out.print("\n");
	}
}
