import java.util.Random;

/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get two command-line arguments: an int value
 * that determines how many families to simulate, and an int value
 * that serves as the seed of the random numbers generated by the program.
 * Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main(String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
		Random generator = new Random(seed);

		//// Put your code here
		int num_trials = Integer.parseInt(args[0]);
		// I want my program to run the previous code each time, and then store the
		// number of children in a total
		// and store the number of children in a batch either 2,3, or 4+
		int two_children = 0;
		int three_children = 0;
		int four_children = 0;
		int trial_index = 0;
		int sum_children = 0;
		while (trial_index < num_trials) {
			boolean both = false;
			boolean boy = false;
			boolean girl = false;
			int num_kids = 0;
			while (!both) {
				double rand = (generator.nextDouble());
				if (rand > 0.5) {
					boy = true;
				} else {
					girl = true;
				}
				num_kids += 1;
				both = girl && boy;
			}
			switch (num_kids) {
				case 2:
					two_children += 1;
					break;
				case 3:
					three_children += 1;
					break;
				default:
					four_children += 1;
					break;
			}
			sum_children += num_kids;
			trial_index += 1;
		}
		double average_kids = (double) sum_children / num_trials;
		System.out.println("Average: " + average_kids + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two_children);
		System.out.println("Number of families with 3 children: " + three_children);
		System.out.println("Number of families with 4 or more children: " + four_children);
		int largest_group = Math.max(Math.max(two_children, three_children),
				Math.max(three_children, four_children));
		if (largest_group == two_children) {
			System.out.println("The most common number of children is 2.");
		} else if (largest_group == three_children) {
			System.out.println("The most common number of children is 3.");
		} else {
			System.out.println("The most common number of children is 4.");
		}

		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

	}
}
