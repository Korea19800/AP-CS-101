/*
 * page 88
 */
package chapter2;

public class _09_CastingErrors {

	public static void main(String[] args) {

		// you declare a variable to be one type, 
		// and assign it a value of a different type.
		int a=0; 
		double b=0;
		// which of the following are legal? illegal?
		a = 1;
		b = 2.0;
//		a = 3.0;
//		b = 4;
//		a=b;
//		b=a;		
		
		/* 
		 * Problem: John got 23 questions right out of 37.
		 * compute the percentage of his correct answers.
		 */
		int correct = 23;
		int total = 37;
		double percent = 0;
		// which of the following will render a correct answer?
		percent = correct/total * 100; 
		
		
//		percent = correct / total * 100.;
//		percent = correct. / total * 100;	// variable에 0찍는다고 변하지 x
		percent = 100. * correct / total;
		percent = (double) correct / total * 100;
		
		System.out.println(percent); 
		
		
			
	}
}
