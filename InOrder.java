/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {
		//// Write your code here
		int rand_num = (int) (Math.random() * 10); // going from 0-9
		int minimum = rand_num; // initialising my minimum as the first random
		do {
			System.out.print(rand_num + " "); // print out first random
			rand_num = (int) (Math.random() * 10); // generate a new random
			if (rand_num > minimum) { // if the random number is less than the max, make it the new max
				// i.e. if my first random is 9, and my new is 5, make 5 the new max.
				minimum = rand_num;
			}
		} while (rand_num >= minimum); // loop while my random number is less than my max num. i.e. if I get 4 and max
										// is 5, end loop.

	}
}
