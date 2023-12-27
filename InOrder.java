/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {
		//// Write your code here
		int rand_num = (int) (Math.random() * 10);
		int max_num = rand_num;
		do {
			System.out.print(rand_num + " ");
			max_num = rand_num;
			rand_num = (int) (Math.random() * 10);
		} while (rand_num <= max_num);

	}
}
