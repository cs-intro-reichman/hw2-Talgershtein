/*
Feedback:
Great work!
Yam
*/



// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int counter = 0;
		if(mode.equals("v")) {
			for (int i = 1; i <= seed; i++) {
				int num = i;
				do {
					System.out.print(num + " ");
					if (num % 2 == 0)
						num /= 2;
					else
						num = num*3 + 1;
					counter++;
				} while (num != 1);
				counter++; // cause of the 1 at the and.
				System.out.println(1 + " (" + counter + ")");// 1 is added here
				counter = 0;
		} }
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}

