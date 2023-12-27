
/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main(String[] args) {
		boolean both = false;
		boolean boy = false;
		boolean girl = false;
		int num_kids = 0;
		while (!both) {
			double rand = (Math.random());
			if (rand > 0.5) {
				System.out.print("b ");
				boy = true;
			} else {
				System.out.print("g ");
				girl = true;
			}
			num_kids += 1;
			both = girl && boy;
		}
		System.out.print("\n");
		System.out.println("You made it... and you now have " + num_kids + " children");
		//// Put your code here
	}
}
