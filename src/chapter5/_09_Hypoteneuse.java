/* 
 * Write a method that returns the length of the hypotenuse 
 * when given the lengths of two legs
 */
package chapter5;

public class _09_Hypoteneuse {

	public static void main(String[] args) {
		
		double a, b;
		
		a = 12;	// try changing these values
		b = 5;	// ex a = 12, b = 5
		
		System.out.print(" the hypotenuse = "+hypotenuse(a,b));
		
	}

	public static double hypotenuse(double a, double b) {
		double ret=0;
		
		double aa= Math.pow(a,2);
		double bb= Math.pow(b, 2);
		double cc= aa+ bb;
		ret=Math.sqrt(cc);
		return ret;
	}
}
