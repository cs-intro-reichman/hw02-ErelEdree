/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 * we say a number is perfect if it equals the sum of all its divisors (6 = 3 +
 * 2 + 1)
 */
public class Perfect {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int index = 1;
		int test = 0;
		String s = "";
		while (index < num) {
			if (num % index == 0) {
				test += index;
			}
			index += 1;
		}
		if (test == num) {
			System.out.print(num + " is a perfect number since " + num + " = ");
			int second_index = 1;
			while (second_index < num) {
				if (num % second_index == 0) {
					s += second_index + " + ";
				}
				second_index += 1;
			}
			s = s.substring(0, s.length() - 2);
			System.out.print(s);
		} else {
			System.out.println(num + " is not a perfect number");
		}
		//// Put your code here
	}
}
