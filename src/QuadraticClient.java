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
		if(!done.equals("q") && !done.equals("no")) {
			System.out.println("error. please type yes or no");
		}
		if(done.equals("yes")) {
			exit = true;
		} else if(done.equals("q")) {
			exit = false;
		} 
		
		} while (!exit);
		
		System.out.println("thanks for mathing with me");

	}

}