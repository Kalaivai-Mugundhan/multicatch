import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			// Input from the user
			System.out.print("Enter an integer value for x: ");
			int x = sc.nextInt();

			// Ensure we have at least 2 command line arguments
			if (args.length < 2) {
				throw new ArrayIndexOutOfBoundsException();
			}

			// Convert command line argument to integer
			int y = Integer.parseInt(args[1]);

			// Perform division
			int z = x / y;
			System.out.println("Result = " + z);
		} catch (ArithmeticException ex) {
			System.out.println("Exception: cannot divide a number by zero!");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception: please provide a minimum of 2 command-line arguments");
		} catch (NumberFormatException ex) {
			System.out.println("Exception: please provide integer values as command-line arguments");
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		} finally {
			// Ensure resources are closed
			sc.close();
		}

		System.out.println("--- DONE ---");
	}
}
