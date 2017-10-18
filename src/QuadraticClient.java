/* Taylor Nguyen
 * AP CompSci period 1
 * 15 October 2017
 * this prints the description of the quadratic from the method quadraticDescriber
 */
import java.util.Scanner;
public class QuadraticClient {

	private static Scanner scans;

	public static void main(String[] args) {
		boolean exit = false;
		System.out.println("Welcome to the Quadratic Describer");
		do { System.out.println("Provide values for coefficients a, b, and c");
		System.out.println();
		System.out.print("a: ");
		scans = new Scanner(System.in);
		double a = scans.nextDouble();
		System.out.print("b: ");
		double b = scans.nextDouble();
		System.out.print("c: ");
		double c = scans.nextDouble();
		System.out.println();
		System.out.println(Quadratic.quadraticDescriber(a, b, c));
		System.out.println();
		System.out.println("Do you want to keep going? Type q to quit, yes to continue");
		String done = scans.next();
		if(!done.equals("q") && !done.equals("yes")) {
			System.out.println("error. please type yes or q");
		}
		if(done.equals("yes")) {
			exit = false;
		} else if(done.equals("q")) {
			exit = true;
		} 
		
		} while (!exit);
		
		System.out.println("thanks for doing math with me, bye bye!");

	}

}
