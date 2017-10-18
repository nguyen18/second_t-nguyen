/* Taylor Nguyen
 * AP Compsci period 1
 * 15 October 2017
 * Quadratic does the calculations which will be printed in quadratic client
 */
public class Quadratic {
	public static double discriminant(double a, double b, double c) {
	    return (b * b) - (4 * a * c);
	  }
	
	public static double round2(double num1) {
		double result = 0.0;
		
		int tempInt = (int)(num1 * 1000);
		int roundNum = tempInt % 10;
		tempInt = tempInt / 10;
		if(roundNum >= 5 && tempInt < 0) {
			tempInt++;
		} else if(roundNum <= -5 && tempInt < 0) {
			tempInt--;
		}
		result = tempInt / 100.0;
		return result;
	}
	public static double sqrt(double num) {
		if (num <= 0) {
			throw new IllegalArgumentException("number must be bigger than 0");
		}
		double root = 0;
		while (root * root > (num + 0.01) || root * root < (num - 0.01)) {
			while (root * root < num) {
				root = root + 0.001;
			}
			while (root * root > num) {
				root = root - 0.001;
			}
		}
		root = round2(root);
		return root;
		
}
	public static String quadForm(double a, double b, double c){
		if (discriminant(a,b,c) < 0){
			throw new IllegalArgumentException("no real roots");

		}
		if (discriminant(a,b,c) == 0){
			 String roots = round2(-b /(2*a)) + " ";
			 return roots;
		}
		
		else {
			double root1 =  round2((-b + sqrt(discriminant(a, b, c)))/(2*a));
			double root2 =  round2((-b - sqrt(discriminant(a, b, c)))/(2*a));
			if (root1 > root2 || root1 < root2){
				String roots = root2 + " and " + root1;
				return roots;
			}
			
			}
		return null;		
	}
	
	public static String quadraticDescriber(double a, double b, double c) {
		if( a == 0) {
			throw new IllegalArgumentException("a cannot equal 0");
		}
		String equation = "y = " + a + " x^2 + " + b + " x + " + c;
		
		String open = "up";
		if(a > 0) {
			open = "up";
		} else {
			open = "down";
		}
		
		double axisOfSymmetry = (-1 * b) / (2 * a);
		String symmetry = "Axis of Symmetry: " + axisOfSymmetry;
			
		double x = axisOfSymmetry;
		double y = ((a) * ((x) * (x)) + (b) * (x) + c);
		String vertex = "(" + x + ", " + y + ")";
		
		double yIntercept = (a*(0)) + (b*0) + c;
		
		return "Description of the graph of:" + '\n' + equation +'\n' + '\n' + "Opens: " + open + '\n' + symmetry + '\n' + "Vertex: " + vertex + '\n' + "X-intercepts: " + quadForm(a, b, c) + '\n' + "Y-Intercept: " + yIntercept;
	}

}
