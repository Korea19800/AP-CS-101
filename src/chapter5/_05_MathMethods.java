/* 
 * Test out the Math Class methods
 */
package chapter5;

public class _05_MathMethods {

	public static void main(String[] args) {
		
		int a, b = 0 ;
		
		// absolute value
		a = -5;
		System.out.println( Math.abs(a));
		
		// power a^b ex. 2^3=8
		a = 2;
		b = 10;
		System.out.println((int) Math.pow (a,b));
		

		
		// square root
		a = 2;
		System.out.println( Math.sqrt (a));

		
		// random 
		System.out.println(Math.random()); // range: [0,1) 
		
		// random number between [a,b) ex>5~15 : b-a range, offset a
		// Math.random()*(range)+offset
		double rand= Math.random() * 10 +5 ; // [5,15) 
		System.out.println(rand);
		
		// random integer between [a,b] >> range:b-a+1,  offset: a
		// (int) (Math.random()*(range)+offset)
		int r= (int) (Math.random() * (15-5+1)+5) ; // [5,15]  
		System.out.println(r);

		
	}

}
